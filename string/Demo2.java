package dkc.string;
/*��ȡ�ķ���
	  	int length()           //��ȡ�ַ�������
	  	char charAt(int index)  //��ȡ�ض�λ�õ��ַ�
	  	int indexOf(String str)  //��ȡ�ض��ַ���λ��
	  	int lastindexOf(String str)  //��ȡ���һ���ַ���λ��
 * 		
 */
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = new String("a�й�bcdef�й�g");
		System.out.println("lengthΪ��"+str.length());
		System.out.println("��������ֵ���ҵ��ַ�Ϊ��"+str.charAt(1));
		System.out.println("lengthΪ��"+str.lastIndexOf("�й�g"));
		System.out.println("lengthΪ��"+str.indexOf("��g"));
		
	}

}
