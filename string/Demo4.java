package dkc.string;
/*
 *	����ʵ��trim����
 */
public class Demo4 {
	public static void main(String [] args) {
		String str = "      Mr.Du   ��ŵ۹�     ������   ������ôǿ��      youxi";
		//System.out.println(str+"str����Ϊ��"+str.length());
		System.out.println(myTrim(str)+"    str����Ϊ��"+str.length());
	}
	
	public static String myTrim(String str) {
		//�Ƚ��ַ���ת�����ַ�����
		char [] buf = str.toCharArray();
		//�����ֽ����鿪ʼ�ͽ���������
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
