import java.util.HashSet;
import java.util.Set;


public class Sum {

	private static void executeAlgoOnWord(String word) {
		 Set<String> unique = new HashSet<String>();
		 if(word != null && word.length() >1) {
			 String outputString =""+ word.charAt(0);

			 for(int j=1; j<word.length()-1; j++) {
					int indexOf = word.charAt(j);
					unique.add(""+indexOf);
					
				}
			 outputString += unique.size()+""+word.charAt(word.length()-1);
			 System.out.print(outputString);
		 }
	 }
	 
	 public static void printUpdatedString(String sentence) {
		 String[] words = sentence.split("[^a-zA-Z]");
		 int delimeterIndex = 0;
		 for(String word : words) {
			 executeAlgoOnWord(word);
			 if(delimeterIndex == 0)
				 delimeterIndex += word.length();
			 else
				 delimeterIndex += word.length()+1;
			 
			 if(delimeterIndex < sentence.length()-1)
				 System.out.print(sentence.charAt(delimeterIndex));
		 }
	 }
	 
	public static int getMaxSum(int[] arr, int windowSize) {
		 
		 int maxSofar = 0;
		 if(arr!=null && arr.length>=windowSize) {
			 for(int i=0; i<arr.length; i++) {
				 int sum = 0;
				 
				 if(i < arr.length-2) {
					 for(int j=i; j< windowSize+i; j++) {
						 sum += arr[j];
					 }
					 if(sum > maxSofar) {
						 maxSofar = sum;
					 }
				 }
			 
			 }
		 }
		 return maxSofar;
	}
	
	
	
	 
	 
	 public static void main(String[] args) {
		 //printUpdatedString("Automotive parts venu#parrot%gopal");
		 int[] arr = new int[] {2,4,6,7,10,1,9};
		 System.out.println(getMaxSum(arr, 3));
	}
	 
}
