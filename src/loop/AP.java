package loop;

import java.util.Scanner;

public class AP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a=sc.nextInt();
		int c=0;
		int d=sc.nextInt();
		for(int i=0; i<n; i++) {
			
	     
	     
	     if(i==0) {
	    	 System.out.print(a+" ");
		}
	     else if(i>0) {
	    	 a=a+d;
	    	 System.out.print(a+" ");
	    	 
	     }
	}

}
}
