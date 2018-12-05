package dkc.string;
/*
 *	需求：实现trim方法
 */
public class Demo4 {
	public static void main(String [] args) {
		String str = "      Mr.Du   大杜帝国     哈哈哈   就是这么强大      youxi";
		//System.out.println(str+"str长度为："+str.length());
		System.out.println(myTrim(str)+"    str长度为："+str.length());
	}
	
	public static String myTrim(String str) {
		//先将字符串转换成字符数组
		char [] buf = str.toCharArray();
		//定义字节数组开始和结束的索引
		int startIndex = 0;
		int endIndex = buf.length-1;
		while(true) {
			if(buf[startIndex]==' ') {
				startIndex++;
			}
			else {
				break;
			}
		}
		while(true) {
			if(buf[endIndex]==' ') {
				endIndex--;
			}
			else {
				break;
			}
		}
		
		return str.substring(startIndex, endIndex+1) ;
	}
}
