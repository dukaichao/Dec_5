package dkc.string;
/*
 * 需求：定义反转，正输入，反输出
 */
public class Demo6 {
	public static void main(String [] args) {
		String str = "abc我爱你中国cba";
	
		System.out.println(myReserve(str));
	}
	
	public static String myReserve(String str) {
		char[] arr = str.toCharArray();
		for(int startIndex = 0,endIndex = arr.length-1;startIndex < endIndex;startIndex++,endIndex--) {
			char temp = arr[startIndex];
			arr[startIndex] = arr[endIndex];
			arr[endIndex] = temp;
		}
		return new String(arr);
	}
}
