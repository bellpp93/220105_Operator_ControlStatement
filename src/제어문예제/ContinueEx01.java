package �������;
/*
 * 1���� 10���� �߿��� ¦���� ����ϱ� => 2 4 6 8 10�� ���
 */
public class ContinueEx01 {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) {
			/*
			if(i%2 != 0) {  //i���� Ȧ�� ���̸�
				continue;  //[�߿�]
			}
			*/
			if(i%2 == 1) {
				continue;
			}
			System.out.print(i + " ");
		}
	}
}
