package Method;

public class cmd {
	
static void Recursion(int n) {
	if(n>0) {
		Recursion(n-1);
		System.out.println(n);
		
	}
}
public static void main(String[] args) {
	Recursion(3);
	
}

}
