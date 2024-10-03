package loop;

import java.util.Scanner;

public class GP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int term=a;
		int r=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.print(term+" ");
			term=term*r;
		}
	}

}
