package dkc.string;
/*
 * �����Ӵ����ַ����г��ֵĴ���
 */
public class Demo8 {
	public static void main(String [] args) {
		String str = "bcagbcagbcaasfaasaabcdefgbcdefhgsaffabcdef";
		getZicuan(str, "bc");
	}
	
	public static void getZicuan(String str,String target) {
		int count = 0;
		int startIndex = 0;
		while((startIndex = str.indexOf(target, startIndex))!=-1) {
			count++;
			startIndex = startIndex + target.length();
		}
		System.out.println("���ֵĴ���Ϊ��"+count+"��");
	}
}
