package Shalendra;

import java.lang.reflect.Method;

public class test1vd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * that is an refelection api
		 * in java
		 * 
		 */
		Class<?>  a=testclass.class;
		Method[] r=a.getDeclaredMethods();
		System.out.println(r[1]);
		

	}

}

class testclass {

	public void ujjwal() {
		
		
		System.out.println("This is an ujjwal");

	}
	
	
	public void ujjwal2() {
		
		
		System.out.println("This is an ujjwal is ujjwal");

	}


}