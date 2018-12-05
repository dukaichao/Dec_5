package dkc.string;

import java.util.Arrays;

/*
 	判断的方法：
 		boolean endWith(String str)  是否以指定字符结束
 		boolean isEmpty()             是否为空
 		boolean contain(CharSequence)  是否包含指定序列
 		boolean equals(Object anObject)   是否相等
 		boolean equalsIgnoreCase(String anotherString)   不看大小写两者是否相等
 	转换方法：
 		char [] toCharArray()
 		Byte[] getBytes()
 */
public class Demo3 {
	public static void main(String [] ars) {
		String str1 = "wo爱你China";
		String str2 = "WO爱你china";
		String str3 = new String("wo爱你China");
		String str4 = "";
		System.out.println("字符串是否以na字符结束："+str1.endsWith("na"));
		System.out.println("字符串是否以wo字符开始："+str1.startsWith("wo"));
		System.out.println();
		System.out.println("字符串是否包含china字符："+str1.contains("china"));
		System.out.println("字符串是否包含China字符："+str1.contains("China"));
		System.out.println();
		System.out.println("字符串str1是否为空："+str1.isEmpty());
		System.out.println("字符串str4是否为空："+str4.isEmpty());
		System.out.println();
		System.out.println("str1和str2是否相等："+str1.equals(str2));
		System.out.println("str1和str3是否相等："+str1.equals(str3));
		System.out.println("str2和str3是否相等："+str2.equals(str3));
		System.out.println();
		System.out.println("忽略大小写str1和str2是否相等："+str1.equalsIgnoreCase(str2));
		System.out.println("忽略大小写str1和str3是否相等："+str1.equalsIgnoreCase(str3));
		System.out.println("忽略大小写str2和str3是否相等："+str2.equalsIgnoreCase(str3));
		
		//转换方法
		char[] buf = str1.toCharArray();
		System.out.println("字符转换数组为："+Arrays.toString(buf));
		//把字符串转换为字节数组
		byte[] b = str1.getBytes();
		System.out.println("字符转换字节数组为："+Arrays.toString(b));
	}
}
