package dkc.string;
/*
   String()  �Ĺ��췽��
   		String(byte[] bytes) ʹ��һ���ֽ����鹹��һ���ַ�������
   		String(byte[] bytes, int offset, int length) 
   			bytes - Ҫ����Ϊ�ַ����ֽ� 
			offset - Ҫ����ĵ�һ���ֽڵ����� 
			length - Ҫ������ֽ��� 
   		
   		
   		
   		
 */
public class Demo1 {
	public static void main(String [] args) {
		//String(byte[] bytes) ����
		String str = new String();
		byte[] bytes = {'a',98,99};
		str = new String(bytes);
		str = new String(bytes,1,2);
		System.out.println(str);
	}
}
