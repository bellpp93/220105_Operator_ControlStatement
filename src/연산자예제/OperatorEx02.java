package �����ڿ���;

import java.util.Scanner;

/*
 *                      ��1
 * ���� ������ ���� => ���� = (���ǽ�) ? ��2 : ��3
 */

public class OperatorEx02 {

	public static void main(String[] args) {
		
		//int score = 85;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �Է� >>> ");
		int score = scan.nextInt();
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C');
		
		System.out.println("������ ������ " + grade + "�Դϴ�.");

	}

}
