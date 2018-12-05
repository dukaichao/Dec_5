package dkc.string;
/*获取的方法
	  	int length()           //获取字符串长度
	  	char charAt(int index)  //获取特定位置的字符
	  	int indexOf(String str)  //获取特定字符的位置
	  	int lastindexOf(String str)  //获取最后一个字符的位置
 * 		
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("a中国bcdef中国g");
		System.out.println("length为："+str.length());
		System.out.println("根据索引值查找的字符为："+str.charAt(1));
		System.out.println("length为："+str.lastIndexOf("中国g"));
		System.out.println("length为："+str.indexOf("中g"));
		
	}

}
