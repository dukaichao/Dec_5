package dkc.string;
/*
 * 需求：子串在字符串中出现的次数
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
		System.out.println("出现的次数为："+count+"次");
	}
}
