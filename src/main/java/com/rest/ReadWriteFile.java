package com.rest;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ReadWriteFile {
	
	InputStream is;
	String val = "";
	public void readFile() throws IOException {
		is = ReadWriteFile.class.getClassLoader().getResourceAsStream("people.txt");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String line;
		while( (line = br.readLine()) != null) {
			val = val + line+"\n";
		}
		val = val.replace("sita", "patni");
		System.out.println(val);
		is.close();
	}
	
	public static void reverseArray(int[] arr){
		
		for (int i = 0, j = arr.length-1; i<=j ; i++, j--) {
			swap(arr, i, j);
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
	
	public static void swap(int[] input, int x, int y) {
		int temp = input[x];
		input[x] = input[y];
		input[y] = temp;
	}
	
	
	public void readFile_() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/states.txt"));
		StringBuilder sb = new StringBuilder();
		String line;
		while( (line = br.readLine()) != null) {
			sb.append(line);
			sb.append("\n");
			
		}
		System.out.println(sb);
		//sb = sb.replace(sb.indexOf("textas"), end, str)
		writeToFile(sb);
		br.close();
	}
	
	public void readFile_for_count() throws IOException {
		
		BufferedReader br = new BufferedReader(new FileReader("src/main/resources/states.txt"));
		StringBuilder sb = new StringBuilder();
		String line;
		int i=0;
		while( (line = br.readLine()) != null) {
			sb.append(line);
			sb.append("\n");
			i+=1;
		}
		System.out.println(sb);
		System.out.println("count ="+i);
		writeToFile(sb);
		br.close();
	}

	public void writeToFile(StringBuilder sb) throws IOException {
		FileWriter fw = new FileWriter("people_w.txt");
		fw.write(sb.toString());
		fw.close();
		
	}
	
	
	public static void main(String[] args) throws IOException {
		//new ReadWriteFile().readFile();
		//new ReadWriteFile().readFile_for_count();
		
		//new ReadWriteFile().readFile_();
		
		reverseArray(new int[] {4,7,3,6,9,2,3,1,0});
		
		
	}
}
