package 제어문예제;

public class IfEx01 {

	public static void main(String[] args) {
		int score = 85;
		
//		[문법] if(조건식) 참이면 {}블록 안에 있는 문장들을 처리해라.
//		거짓이면 처리하지 말아라 {}블록을 빠져나감.
		if(score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("학점은 A 입니다.");
		}
		if(score < 90) {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("학점은 B 입니다.");
		}
	}
}
