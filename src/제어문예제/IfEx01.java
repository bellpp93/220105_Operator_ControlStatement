package �������;

public class IfEx01 {

	public static void main(String[] args) {
		int score = 85;
		
//		[����] if(���ǽ�) ���̸� {}��� �ȿ� �ִ� ������� ó���ض�.
//		�����̸� ó������ ���ƶ� {}����� ��������.
		if(score >= 90) {
			System.out.println("������ 90���� Ů�ϴ�.");
			System.out.println("������ A �Դϴ�.");
		}
		if(score < 90) {
			System.out.println("������ 90���� �۽��ϴ�.");
			System.out.println("������ B �Դϴ�.");
		}
	}
}
