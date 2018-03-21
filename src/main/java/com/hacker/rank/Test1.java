package com.hacker.rank;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TimeZone;

public class Test1 {
	
	
		 public static void main(String[] args) {

//	            Scanner sc=new Scanner(System.in);
//	            int n=sc.nextInt();            
//	            String ans="";
//	            if(n%2==1){
//	              ans = "Weird";
//	            }
//	            else{
//	                if(n ==2 || n==4)
//	                    ans = "Not Weird";
//	                else if(n >=6 && n <=20)
//	                    ans = "Weird";
//	                else if( n > 20)
//	                    ans = "Not Weird";
//	                else{}
//	            }
//	            System.out.println(ans);
			 //2
	            
//			 Scanner scan = new Scanner(System.in);
//			 int i = scan.nextInt();
//			 double d = scan.nextDouble();
//			 String s = scan.nextLine();
//			 s = scan.nextLine();
//			 scan.close();
//		        // Write your code here.
//
//		        System.out.println("String: " + s);
//		        System.out.println("Double: " + d);
//		        System.out.println("Int: " + i);
			 
			 //3
			 
//			 StringBuffer sb = null;
//			 String s;
//	            Scanner sc=new Scanner(System.in);
//	            System.out.println("================================");
//	            for(int i=0;i<3;i++){
//	            sb = new StringBuffer();
//	                String s1=sc.next();
//	                int x=sc.nextInt();
//	                //Complete this line
//	                int len = s1.length();
//	                int y = 15-len;
//	                for(int y1=0;y1<y; y1++){
//	                sb.append(" ");
//	                }
//	                
//	                System.out.println(s1+sb+x);
//	                
//	            }
//	            System.out.println("================================");
	            

    
	            
	            
	        }
	

	public static void main1(String[] args) throws ParseException {
		int year = 2015;
		int month = 8;
		int day = 5;

		// First convert to Date. This is one of the many ways.
		String dateString = String.format("%d-%d-%d", year, month, day);
		Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2015-08-07");

		// Then get the day of week from the Date based on specific locale.
		String dayOfWeek = new SimpleDateFormat("EEEE", Locale.ENGLISH).format(date);

		System.out.println(dayOfWeek); // Friday
	}

	public static void main2(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
		format.setTimeZone(TimeZone.getTimeZone("UTC"));
		String dateToStr = format.format(new Date());

	}

	public static void main3(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		NumberFormat lp; // Local Payment

		lp = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println("US: " + lp.format(payment));

		lp = NumberFormat.getCurrencyInstance(new Locale("en", "in"));
		System.out.println("India: " + lp.format(payment));

		lp = NumberFormat.getCurrencyInstance(Locale.CHINA);
		System.out.println("China: " + lp.format(payment));

		lp = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		System.out.println("France: " + lp.format(payment));
	}

	public static void main4(String[] args) {
		String s1 = "hello";
		String s2 = "world";

		int res = s1.compareTo(s2);
		System.out.println(res);
	}

	public static void main5(String[] args) {
		String str = "This is String , split by StringTokenizer, created by Venu";
		StringTokenizer st = new StringTokenizer(str);

		System.out.println("---- Split by space ------");
		while (st.hasMoreElements()) {
			System.out.println(st.nextElement());
		}
	}

	public static void main6(String[] args) {

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		in.nextLine();
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (int i = 0; i < n; i++) {
			String name = in.nextLine();
			int phone = in.nextInt();
			map.put(name, phone);

			in.nextLine();
			if (i == n)
				in.close();
		}
		while (in.hasNext()) {
			String s = in.nextLine();
			System.out.println("phone num of " + s + " is = " + map.get(s));
		}

	}
	
	
	
	
	
	static int[] oddNumbers(int l, int r) {
		List<Integer> odds = new ArrayList<>();
		for (int i = l; i <= r; i++) {
			if (i % 2 == 1) {
				odds.add(i);
			}
		}

		int[] result = new int[odds.size()];
		int counter = 0;
		for (Integer odd : odds) {
			result[counter++] = odd;
		}
		return result;
	}

	public static void main7(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int t = 0; t < n; t++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			System.out.println(a + b);

		}
	}
	 static int KDifference(int[] a, int k) {
         int pairs = 0;
       for(int i=0;i<a.length;i++){
           for(int j=i+1;j<a.length;j++){
               int temp = (a[i]>a[j])?(a[i]-a[j]):(a[j]-a[i]);
               
               if(temp ==k) pairs++;
               
           }
       }
       
     return pairs;
   }
	 
	 static int solvePuzzle(int num) {
		 	int holes = 0;
		 	
		 	String strNum = ""+num;
		 	for(int i=0;i<strNum.length();i++) {
		 		System.err.println("char L "+ strNum.charAt(i));
		 		String str = new String(new char[] {strNum.charAt(i)});
		 		switch(str) {
		 		case "0": case "4":case "6":case "9":
		 			holes +=1;break;
		 		case "8" : holes +=2;break;
		 		default : holes +=0;break;
		 		}
		 		
		 	}
		 	
		 	return holes;

	    }

	 
	 static int solvePuzzle1(int num) {
		 	int holes = 0;
		 	
//		 	0 4 6 9=1
//		 			1 3 5 7 =0
//		 			8 = 2
		 	
		
		 	
		 	String number = ""+num;
		 	for(int i=0; i<number.length(); i++) {
		 		String charAt = ""+number.charAt(i);
		 		System.err.println("chart " + charAt);
				if(charAt.equals("0")  || charAt.equals("4") || charAt.equals("6") || charAt.equals("9"))
		 			holes+=1;
		 		else if(charAt.equals("8")  )
		 			holes+=2;
		 		
		 	}
		 	
			return holes;
		 	

	    }
	 
	 
	 static int kDiff(int k) {
		 System.out.println("k diff start");
		 int count = 0;
		 int[] kArr = new int[] {3,5,1,9,4,7};
		 
		 for(int i=0; i<=kArr.length-1; i++) {
			 System.out.println(kArr[5]); 
			 for(int j=i+1; j<=kArr.length-1; j++) {
				 if(kArr[i]-kArr[j] == k || kArr[j]-kArr[i] == k) {
					 System.out.println(kArr[i]-kArr[j]); 
					 count+=1;
				 }
			 }
		 }
		return count;
	 }
	
	 
	public static void main10(String[] args) {
		System.err.println(solvePuzzle1(0));
		
		
	}
	
	public static void main9(String[] args) {
		
		System.err.println(kDiff(2));
		
		
	}
	
	
	
}
