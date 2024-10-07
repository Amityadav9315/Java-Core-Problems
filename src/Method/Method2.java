package Method;

import java.util.Scanner;

public class Method2 {
	static void Add( int n, int m,int c) {
		c=n+m;
		System.out.println(c);
		
		
	}
	
	
	
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int c=0;
		Add(n,m,c);
		
		
	}

}
