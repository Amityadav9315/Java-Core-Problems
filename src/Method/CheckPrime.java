package Method;

import java.util.Scanner;

public class CheckPrime {
	static void Prime(int n,int i,int count) {
		for(int i1=1; i1<n; i1++) {
			if(n%i1==0) {
				count++;
			}
		}
			if(count>2) {
				System.out.println("Not Prime");
			}
			else {
				System.out.println("Prime number");
			}
			
		
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		Prime(n,count, count);
		
	}

}
