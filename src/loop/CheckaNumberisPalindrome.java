package loop;

import java.util.Scanner;

public class CheckaNumberisPalindrome {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int original=n;
		int rev=0;
		while(n>0) {
			int r=n%10; 
			n=n/10;
		     rev=rev*10+r;
		}
		if(original==rev) {
		System.out.println("Palindrome");
   }
   else {
	   System.out.println("Not palindrome");
   }
}
}

