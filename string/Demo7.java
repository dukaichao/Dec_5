package dkc.string;
/*
 * ������һ���Ӵ����ַ��г��ֵĴ���
 */
public class Demo7 {
	public static void main(String [] args) {
		String str = "bcagbcagbcaasfaasaabcdefgbcdefhgsaffabcdef";
		getNumber(str, 0, 2);
	}
	
	public static void getNumber(String str,int n,int m) {
		String str1 = str.substring(n, m);
		System.out.println("��׼��ȡ��"+str1);
		int endIndex = str.length();
		int count = 0;
		for(int startIndex = 0;startIndex <endIndex-1;startIndex++) {
			if(startIndex > endIndex-m+n) {
				break;
			}
			String str2 = str.substring(startIndex, startIndex+m-n);
			System.out.println("��"+(startIndex+1)+"��ȡ����"+str2);
			if(str1.equals(str2)){
				count++;
			}
			//startIndex+=m-n;
		}
		System.out.println("�ظ��ַ�������Ϊ��"+count);
	}
}
