package dkc.string;
/*
   String()  的构造方法
   		String(byte[] bytes) 使用一个字节数组构成一个字符串对象
   		String(byte[] bytes, int offset, int length) 
   			bytes - 要解码为字符的字节 
			offset - 要解码的第一个字节的索引 
			length - 要解码的字节数 
   		
   		
   		
   		
 */
public class Demo1 {
	public static void main(String [] args) {
		//String(byte[] bytes) 方法
		String str = new String();
		byte[] bytes = {'a',98,99};
		str = new String(bytes);
		str = new String(bytes,1,2);
		System.out.println(str);
	}
}
