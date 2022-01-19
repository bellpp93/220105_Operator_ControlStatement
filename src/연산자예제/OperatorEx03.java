package 연산자예제;

public class OperatorEx03 {

	public static void main(String[] args) {
		String strVar1 = "박태호";  //strVar1은 객체를 가르키는 참조변수
		String strVar2 = "박태호";
		
		String strVar3 = new String("박태호");  //String(String original)로 이용
		
		System.out.println(strVar1 == strVar2);  //true /==는  주소값이 같은지?
		System.out.println(strVar1 == strVar3);  //false
		
		System.out.println(strVar1.equals(strVar2));  //true /.equals는 문자열 값이 같은지?
		System.out.println(strVar1.equals(strVar3));  //true /논리타입이며 boolean을 반환시킴
//		equals(Object anObject) => Compares this string to the specified object.

	}

}
