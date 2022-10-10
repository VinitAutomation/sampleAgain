package com.maven;

public class Practice_Child extends Practice {
	
	public static void main(String arg[]) {
		
		Practice_Child obj = (Practice_Child) new Practice();
		obj.run();
		
	}
	
	void run () {
		System.out.println("run child");
	}

}
