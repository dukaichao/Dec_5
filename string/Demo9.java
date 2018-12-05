package dkc.string;

public class Demo9 {
	public static void main(String[] args) {
		String tem1 = "hello";
		String tem2 = "world";
		String s1 = tem1+tem2;
		String s2 = "helloworld";
		System.out.println(s1.intern() == s2);
	}
}
