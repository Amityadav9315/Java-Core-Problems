package String;

public class Binary {
	public static void main(String[] args) {
		int b=9010001;
		String str=String.valueOf(b);
		boolean  str1=str.matches("[01]+");
		System.out.println(str1);
	}

}
