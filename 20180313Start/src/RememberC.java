
public class RememberC {

	/*
	 *	Today's Topic
	 	1. 변수 (Variable)
		2. 자료형 (Data type)
		3. 변수 선언 (Variable Declaration)
	 */
	public static void main(String[] args) {
		// 변수 : 메모리 저장공간의 이름
		// 자료형 :
		//	1. 변수가 가질 수 있는 값의 범위
		//	2. 변수를 피연산자로 사용할 경우, 사용할 수 있는 연산자를 정한다.
		//	3. 값을 메모리에 저장하기 위해 필요한 정보(저장공간의 수, 저장 포맷)을 정한다.
		// 변수 선언문 : Java에서 변수를 사용하기 전에 반드시 변수선언을 해야 한다. 변수를 사용하기 위해 필요한 아래의 정보를 표현한다.
		// 	1. 사용할 변수의 이름을 지정한다.
		//	2. 사용할 변수의 자료형을 선언한다.
		int a;
		int b; // 변수 선언문 :
			   //	1. a는 변수의 이름이다. 2. 변수 a의 자료형은 int이다.
		// 리터럴(literal) : 소스코드에서 값을 표현하는 방법.
		// 연산자 : 연산을 위한 기호
		// 대입연산자(=) : 우변의 값을 좌변의 저장소로 이동한다. 우변의 값을 반환한다.
		// 수식(Expression) : 
		//	1. 연산자와 피연산자(리터럴, 변수, 수식)들의 집합.
		//	2. 모든 수식은 값을 반환(리턴)한다.
		// 부수효과(Side Effect) : 수식이 값을 반환하는 것 이외에 수행하는 모든 작업을 부수효과라 한다.
		a = 0x10;
		a = a * 10 + 20;
		
		// post increment(a++) : 반환값은 a, 부수효과는 a=a+1;
		b = a++;
		System.out.println("a = " + a + " b = " + b);
		// pre increment(++a) : 반환값은 a+1, 부수효과는 a=a+1;
		a = 10;
		b = ++a;
		System.out.println("a = " + a + " b = " + b);
		// "a = " 는 string 즉, 문자열
		// + 는 연산자
		// a 는 변수
		
		// Java는 부울 자료형과 true/false 리터럴을 사용한다.
		// 논리연산자(&&, ||, !)의 피연산자는 부울 변수 또는 리터럴을 사용해야 한다.
		// 관계연산자(>, <, <=, ==, !=)는 부울 값을 반환한다.
		boolean bb;
		bb = true || false;
		bb = 0>1;
		System.out.println("bb = " + bb );
		
		// Java에서 상수를 선언하려면 final 키워드를 사용해야 한다. final을 붙이면 그 변수를 바꿀 수 없다.
		final int c = 100;
//		c = 1000;	// error c는 상수	
		
		System.out.println("c = " + c);
		System.out.println("Hellllllo " + "there");
		
		// 변수 이름은 숫자로 시작 x, 대도록 소문자로 시작, _로 시작해도 되나 안하는게 좋음
		// 식별자 = identifier = 이름 = name
		// 식별자의 관례
		//	1. 클래스명의 각 단어의 첫글자는 대문자로
		//	2. 변수명, 메소드명은 소문자로 시작되어 2번째 단어의 첫글자는 대문자로
		//	3. 상수는 모든 글자를 대문자로
		
		// 소숫점 자료형 (float, double)
		float ff;
		double dd;
		ff = 3.14f;
		dd = 3.14; // 리터럴 "3.14"의 자료형은 double이다.!!!! (모든 소숫점 있는 숫자는 그냥 double 쓰는게 편함)
		System.out.println("ff = " + ff + " dd = " + dd);
		
		// 형변환(casting) : 유사한 자료형으로 변환한다.
		int x = 10;
		double y = 100.34;
		x = (int) y;	// explicit casting
//		y = x;			// implicit casting, y = (double) x 사용해도 됨.
		// double에서 int로 갈 때는 정보를 잃고 int에서 double로 갈 때는 정보를 거의 잃지 않기 때문에 위와 같은 차이점 발생.
		System.out.println("x = " + x + " y = " + y);
	}

}
