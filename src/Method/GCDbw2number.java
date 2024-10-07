package Method;

import java.util.Scanner;

public class GCDbw2number {
	static void GCD(int n,int m,int count) {
		for(int i=0; i<n; i++) {
			
		
		if(n>m) {
			
			n=n-m;
			
			
		}
		else {
			m=m-n;
			
		}
		if(n==m) {
			count=n;
		}
		
	}
		System.out.println(count);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int m=sc.nextInt();
		GCD(n,m, m);
		
	}

}
