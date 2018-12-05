package dkc.string;
/*
 * 需求：获取上传文件名
 */
public class Demo5 {
	public static void mian(String [] args) {
		String str = "D:\\20180811\\day12\\Demo5.java";
		getFileName(str);
	}
		
	public static void getFileName(String str) {
		int index = str.lastIndexOf("\\");
		String FileName = str.substring(index+1);
		System.out.println(FileName);
		}
	}
