package seleniumpractice;

import java.util.Scanner;

public class ss {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner b=new Scanner(System.in);
		String words=b.next();
		String[] l=words.split(" ");
		for(int i=l.length-1;i>=0;i--){
			System.out.print(l[i]+" ");

	}

	}
}
