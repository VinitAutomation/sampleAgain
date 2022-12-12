package com.maven;

public abstract class Practice_Child {
	

	
	
	public static void main(String arg[]) {
		
	
				
		String str = "Tea";
		char[] strChar = str.toCharArray();
		String temp = "";
		
		for (int i=strChar.length-1; i>=0; i--) {
			
			
			temp = temp + strChar[i];
		
		}
		
		System.out.println(temp);
		
		
		
	}
		

	


}
