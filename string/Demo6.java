package dkc.string;
/*
 * ���󣺶��巴ת�������룬�����
 */
public class Demo6 {
	public static void main(String [] args) {
		String str = "abc�Ұ����й�cba";
	
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
