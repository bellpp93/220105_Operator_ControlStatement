package �������;

public class SwitchEx01 {

	public static void main(String[] args) {
		char grade = 'C';  //ȸ���� ����� 'B'���
		
		switch(grade) {
			case 'A':
			case 'a':
				System.out.println("��� ȸ���Դϴ�.");
				break;  //[����]
			case 'B':
			case 'b':
				System.out.println("�Ϲ� ȸ���Դϴ�.");
				break;
			default:
				System.out.println("�մ��Դϴ�.");
		}

	}

}
