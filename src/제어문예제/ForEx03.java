package �������;

/*
 * 1���� 100������ ¦���� ���� ���ϴ� ���α׷� �ۼ�
 */
public class ForEx03 {

	public static void main(String[] args) {
		int evenSum = 0;
		
		for(int i=1; i<=100; i++) {
			if(i%2 != 0) {
				evenSum = evenSum + i;
			}
		}
		System.out.println("1���� 100������ Ȧ���� ���� " + evenSum + "�Դϴ�.");
		/*
		for(int i=1; i<=100; i++) {
			if(i%2 == 0) {
				evenSum = evenSum + i;
			}
		}
		System.out.println("1���� 100������ ¦���� ���� " + evenSum + "�Դϴ�.");
		*/
		
		/*
		int even = 0;  //�ʱⰪ ����(¦��)
		int odd = 0;   //�ʱⰪ ����(Ȧ��)
		
		for(int i=1; i<=100; i++) {
			if(i % 2 == 0) {  //¦�� ���ǽ�
				even += i;  //even = even + i;
			} else {  //Ȧ�� ���ǽ� : i%2==1 �Ǵ� i%2!=0;
				odd += i;  //odd = odd + i;
			}
		}
		System.out.println("¦�� �� : " + even); //��� : 2550
		System.out.println("Ȧ�� �� : " + odd);  //��� : 2500
		*/

	}

}
