package dkc.string;

import java.util.Arrays;

/*
 	�жϵķ�����
 		boolean endWith(String str)  �Ƿ���ָ���ַ�����
 		boolean isEmpty()             �Ƿ�Ϊ��
 		boolean contain(CharSequence)  �Ƿ����ָ������
 		boolean equals(Object anObject)   �Ƿ����
 		boolean equalsIgnoreCase(String anotherString)   ������Сд�����Ƿ����
 	ת��������
 		char [] toCharArray()
 		Byte[] getBytes()
 */
public class Demo3 {
	public static void main(String [] ars) {
		String str1 = "wo����China";
		String str2 = "WO����china";
		String str3 = new String("wo����China");
		String str4 = "";
		System.out.println("�ַ����Ƿ���na�ַ�������"+str1.endsWith("na"));
		System.out.println("�ַ����Ƿ���wo�ַ���ʼ��"+str1.startsWith("wo"));
		System.out.println();
		System.out.println("�ַ����Ƿ����china�ַ���"+str1.contains("china"));
		System.out.println("�ַ����Ƿ����China�ַ���"+str1.contains("China"));
		System.out.println();
		System.out.println("�ַ���str1�Ƿ�Ϊ�գ�"+str1.isEmpty());
		System.out.println("�ַ���str4�Ƿ�Ϊ�գ�"+str4.isEmpty());
		System.out.println();
		System.out.println("str1��str2�Ƿ���ȣ�"+str1.equals(str2));
		System.out.println("str1��str3�Ƿ���ȣ�"+str1.equals(str3));
		System.out.println("str2��str3�Ƿ���ȣ�"+str2.equals(str3));
		System.out.println();
		System.out.println("���Դ�Сдstr1��str2�Ƿ���ȣ�"+str1.equalsIgnoreCase(str2));
		System.out.println("���Դ�Сдstr1��str3�Ƿ���ȣ�"+str1.equalsIgnoreCase(str3));
		System.out.println("���Դ�Сдstr2��str3�Ƿ���ȣ�"+str2.equalsIgnoreCase(str3));
		
		//ת������
		char[] buf = str1.toCharArray();
		System.out.println("�ַ�ת������Ϊ��"+Arrays.toString(buf));
		//���ַ���ת��Ϊ�ֽ�����
		byte[] b = str1.getBytes();
		System.out.println("�ַ�ת���ֽ�����Ϊ��"+Arrays.toString(b));
	}
}
