package �����ڿ���;

public class OperatorEx01 {

	public static void main(String[] args) {
		/*
		int x = 10;
		//x = x + 1;
		//x += 1;
		x++;  //���׿�����(1����������) /�����ϰ� �������� ���� �ڵ��� �����ڵ��̴�.
		System.out.println(x);
		*/
		
		//���� �������� �켱������ ������ ���� '���� =>������'���� ������ ����ȴ�.
		int result = 100 * 2 / 3 % 5;
		System.out.println(result);  //����� 1
		
		int var1 = 10;
		int var2 = 30;
		int var3 = 20;
		
		int result2 = var1 + var2 * var3;
		System.out.println(result2);  //610
		
		int result3 = (var1 + var2) * var3;
		System.out.println(result3);  //800
		
		short a,b,c;
		a = 10;
		b = 20;
		c = (short)(a + b);  //(short)�� ĳ��Ʈ������(��������ȯ������) /()�� ������ ������ '���� ������'
		System.out.println(c);

	}

}
