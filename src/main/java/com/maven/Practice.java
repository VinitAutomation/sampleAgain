package com.maven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Practice extends RuntimeException {
	
	Practice(String s){
		super(s);
	}
	
	public static void main(String[] args) throws IOException, FileNotFoundException, InterruptedException {
		
		
	
		
//==============Read Excel Sheet==================		-
//		FileInputStream fis = new FileInputStream("C:\\Users\\vinit.kumar\\eclipse-workspace\\testJ\\TestData\\TestData.xlsx");
//		Workbook wb = new XSSFWorkbook(fis);
//		Sheet sh = wb.getSheet("JIRA");
//		int rowCount = sh.getLastRowNum() - sh.getFirstRowNum();		
//
//		Map<String, String> map = new LinkedHashMap<String, String>();
//		
//		for (int i=0; i<=rowCount; i++) {
//			Row row = sh.getRow(i);
//			for (int j=0; j< row.getLastCellNum(); j=j+2) {
//				
//				map.put(row.getCell(j).toString(), row.getCell(j+1).toString());
//			} 
//		}
//		Map<String, String> map1 = new TreeMap<String, String>(map);
//		System.out.println(map1);		
		
		
//************character count in String via HashMap**********		
//		String str = "akalfjdhgasunfghgd";
//		char[] ch = str.toCharArray();
//		
//		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//		
//		for(char c : ch) {
//			if (map.containsKey(c)) {
//				map.put(c, map.get(c)+1);
//			}
//			else {
//				map.put(c, 1);
//			}
//		}
//		System.out.println(map);		
		
		
//=========Traverse HashMap=========		
//		Map<String, Integer> map = new HashMap<String, Integer>();
//		map.put("Anmol", 31);
//		map.put("Vinit", 33);
//		map.put("Shobhit", 32);
		
//		Set<Entry<String, Integer>> enSet = map.entrySet();//		 
//		for(Entry<String, Integer> en : enSet) {
//			System.out.println(en.getKey()+ "---->"+ en.getValue());
//		}
		
//*********Retrieving the Key Set**********        
//      Set<Integer> keySet = map.keySet();         
//      for (Integer key : keySet) 
//      {
//          System.out.println(key);
//      }
		
//*********Retrieving the Value*******        
//      Collection<String> values = map.values();         
//      for (String value : values) 
//      {
//          System.out.println(value);
//      }
		
//		****Add Key if absent in Map*****
//		map.putIfAbsent("Ravi", 32);
		
//		*****if you want value directly****
		//int value = map.get("Vinit");	
		
//		*********Check if Key and Value present*******
	       //Checking whether key 'Vinit' exist in map        
//        System.out.println(map.containsKey("Vinit"));      //Output : true
         
        //Checking whether value '33' exist in map         
//       System.out.println(map.containsValue(33));   //Output : true
		
//		********Map Size*********
//		System.out.println(map.size()); 
		
//		********Map Clear*********
//		 map.clear();
				
//**********Removing the mapping for the key 'Vinit'*****        
//        map.remove("Vinit");
		
//*******Removes the mapping for the key 'Vinit' only if it is currently mapped to '31'
//        map.remove("Vinit", "31");
         
//Removes the mapping for the key 'Vinit' only if it is currently mapped to '33'
//		map.remove("Vinit", "33");
		
//Replacing the value associated with 'VInit' to '40'        
//        map.replace("Vinit", "40");
		
//=========Second Highest Number in Array=====		
//		int[] arr1 = {1, 2, 3, 4, 3, 7};
//		int pos= arr1.length-2;
//		Arrays.sort(arr1);
//		//Arrays.toString(arr1);
//		System.out.println(arr1[pos]);	
		
		
//==========Match Values in Array=========		
//		int[] arr1 = {1, 2, 3, 4};
//		int[] arr2 = {5, 1, 6, 2, 3};
//		
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j<arr2.length; j++) {
//				if (arr1[i]==arr2[j]) {
//					System.out.println(arr1[i]);
//				}
//			}
//		}
		
//=========Sorting an Array======
//		int[] array = {1, 2, 3, -1, -2, 4};
//		Arrays.sort(array);
//
//		System.out.println(Arrays.toString(array));	
		
		
//========Remove White Space Leading and Trailing====		
//		String str = " vinit kumar  ";
//		str = str.trim(); //or use strip() method
//		System.out.println(str);
		
		
//=========Find Odd number in List==========
//		List<Integer> ll = new ArrayList<Integer>();
//		ll.add(2);
//		ll.add(3);
//		ll.add(4);
//		ll.add(5);
//		
//		for (int num : ll) {
//			if(!(num%2==0)) {
//				System.out.println("Odd Number ->" +num);
//			}
//		}
		
		
	
//=======Check if Vowel present=======
//	String str = "Vinit Kumar";
//	boolean b = str.matches(".*[aeiou].*");
//	System.out.println(b);
	
	
//===========Find Vowel in String=======	

//		char[] ch = {'a','e','i','o','u'};
//		String str = "Vinit Kumar";
		
//		for (int i= 0; i<str.length(); i++) {
//			for (int j =0; j<ch.length; j++) {
//				if(str.charAt(i)==ch[j]) {
//					System.out.println(str.charAt(i));
//				}
//			}
//		}		
		
//===========Reverse String=======
//		String str = "Vinit";
//		String s = "";
//		String temp = "";
//		char[] strChar = str.toCharArray();
//		
//		for(int i = str.length()-1; i>=0; i--) {
//			
//			
////			char c = str.charAt(i);
//			temp = temp + str.charAt(i);
//		}
//		System.out.print(temp);		
		
//========Factorial===============		
//		int num = 3;
//		int fact = 1;
//		 for (int i = num; i>=1; i--) {
//			 
//			 fact = fact*i;
//		 }
//		System.out.println(fact);
		
		
//=========Armstong Number=========		
//		int num = 372;
//		int sum = 0;
//		int t = num;
//		
//		while (num > 0) {
//			
//			int r = num%10;
//			sum = sum+ r*r*r;
//			num = num/10;
//		}
//		 if (t==sum) {
//			 System.out.println("Armstrong");
//		 }else {
//			 System.out.println("Not Armstong");
//		 }
		

		
//==========Find Duplicate Words=====
//		String str = "Vinit Kumar Vinit abd Vinit abd";
//		String[] strArr = str.split(" ");
//				
//		for(int i=0; i<strArr.length; i++) {
//			int count = 1;
//			for (int j=i+1; j<strArr.length; j++){
//				if(strArr[i].equals(strArr[j])) {
//					count++;
//				strArr[j]="0";
//				}
//			}
//			if(count > 1 && !strArr[i].equals("0")) {
//				System.out.println(strArr[i]+" "+ count);
//			}
//		}		
		
//=========Pallindrome==================		
//		int num = 122;
//		
//		int s=num;
//		int sum = 0;
//		
//		while(num > 0) {
//			int r = num%10;
//			sum = (sum*10) + r;   // 1, 12
//			num = num/10;
//			
//		}
//		if(s==sum) {
//			System.out.println("Pallindrome");
//		}else {System.out.println("Not Pallindrome");
//		
//		}
		
		
		
//=================Prime Number==========	
//		int num =11; 
//		if(num%2==0 || num%3==0) {
//			System.out.println("Not a Prime Number--> " +num);
//		}else if(num==0){
//			System.out.println("Not a Prime--> " +num);
//		}else if (num==1) {
//			System.out.println("Prime Number--> " +num);
//		}else {
//			System.out.println("Prime--> " +num);
//		}
//======================		
		
//		String str = "Anmol";
//		str.concat("Agarwal");
//		System.out.println(str);
		
//========================		
		
//		HashMap<Integer, String> hm = new HashMap<Integer, String>();
//		hm.put(1, "test1");
//		hm.put(2, "test2");
//		hm.put(3, "test3");
//		hm.put(4, "test4");
//		System.out.println(hm.get(1));
//		Boolean b1 = hm.containsKey(3);
//		Boolean b2 = hm.containsValue("test2");
//		System.out.println("B1 "+b1+ "  B2 " + b2);
//		
//		for(Entry<Integer, String> m : hm.entrySet()) {
//			int k = m.getKey();
//			String v = m.getValue();
//			System.out.println(k+ " " +v);
//		}
//		
//		LinkedList<String> ll = new LinkedList<String>();
//		ll.add("Ram");
//		ll.add("Shyam");
//		
//		LinkedList<String> ll1 = new LinkedList<String>();
//		ll1.add(0, "varun");
//		ll1.add(1, "anmol");
//		ll1.addFirst("ravi");
//		
//		for(String s : ll1) {
//			System.out.println(s);
//		}
//=============Array List Concept==========				
//		ArrayList<Integer> arr = new ArrayList<Integer>();
//		arr.add(10);
//		arr.add(25);
//		arr.add(30);
//		arr.add(5);
//		Collections.sort(arr);	
//		ArrayList<Integer> arr1 = new ArrayList<Integer>();
//		arr1.add(6);
//		arr.addAll(arr1);
//		for (Object i : arr) {			
//			System.out.println(i);		
//		}
		
//===============Reverse String==========		
//		String str = "Hello WOrld My Name";
//		String[] str1 = str.split(" ");
//		for(int i = str1.length-1; i>=0; i--) {
//			System.out.print(str1[i]);
//			System.out.print(" ");
//		}
		
	

}
	
	
//	void run () {
//		System.out.println("run parent");
//	}
}
