package �����ڿ���;

public class OperatorEx03 {

	public static void main(String[] args) {
		String strVar1 = "����ȣ";  //strVar1�� ��ü�� ����Ű�� ��������
		String strVar2 = "����ȣ";
		
		String strVar3 = new String("����ȣ");  //String(String original)�� �̿�
		
		System.out.println(strVar1 == strVar2);  //true /==��  �ּҰ��� ������?
		System.out.println(strVar1 == strVar3);  //false
		
		System.out.println(strVar1.equals(strVar2));  //true /.equals�� ���ڿ� ���� ������?
		System.out.println(strVar1.equals(strVar3));  //true /��Ÿ���̸� boolean�� ��ȯ��Ŵ
//		equals(Object anObject) => Compares this string to the specified object.

	}

}
