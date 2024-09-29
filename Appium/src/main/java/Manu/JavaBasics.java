package Manu;

import java.util.ArrayList;

public class JavaBasics {

	public static void main(String[] args) {
		
//		//Basic data type
//		int a=5;
//		String b = "Manu";
//		char c = 'm';
//		double d = 4.4444;
//		boolean e = true;
//		
//		System.out.println(a+b+c+d+e);
//		
//		//Array
//		int[] arr = new int[5];
//		arr[0] = 1;
//		arr[1] = 2;
//		arr[2] = 3;
//		arr[3] = 4;
//		arr[4] = 5;
//		//or
//		int[] arr1 = {1,2,3,4,5};
//		System.out.println(arr1[1]);
//		
//		//for loop
//		for(int i=0; i< arr1.length; i++)
//		{
//			System.out.println(arr1[i]);
//		}
//		//enhanced for loop
//		for(int f: arr)
//		{
//			System.out.println(f);
//		}
//		
//		// if else
//		// check if array has multiple of 2
//		for(int f: arr)
//		{
//			if(f%2==0) 
//			{
//			System.out.println(f + " is even number");
//			break;
//			}
//			else
//			{
//			System.out.println(f + " is odd number");	
//			}
//		}
		
//		// Array list to dynamically grow the size of an array
//		ArrayList<String> arrList = new ArrayList<String>();
//		arrList.add("Manu");
//		arrList.add("Mohan");
//		System.out.println(arrList.get(1));
	
		
//		//String - String literal no new memory allocation
//		String s1 = "Manu";
//		String s2 = "Manu";
//		//new keyword
//		String s3 = new String("Mohan");
//		String s4 = new String("Mohan");
//		
//		String s = "Manu Mohan G M";
//		String[] s5 = s.split(" ");
//		String[] s6 = s.split("Mohan");
//		String s7 = s6[1].trim();
//		System.out.println(s7);
//		
//		for(int i=0; i<s.length(); i++)
//		{
//			System.out.println(s.charAt(i));
//		}
//		
//		for(int i=s.length()-1; i>=0; i--)
//		{
//			System.out.println(s.charAt(i));
//		}
		
	
	
		Class1 c1 = new Class1();
		c1.data();
		JavaBasics jb1 = new JavaBasics();
		jb1.dataUser();
		dataUser1();
		Class1.data1();
		
		Car car1 = new Car();
		car1.colour();
		car1.engine();
	
	
	
	
	
	
	}
	
	public void dataUser() {
		System.out.println("Hello world");
	}
	
	public static void dataUser1() {
		System.out.println("Hello world");
	}
	
	
}
