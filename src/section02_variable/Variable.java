package section02_variable;
/*
 * 자바 클래스명 규칙
 * 	1. 클래스명은 관례적으로 대문자로 시작한다
 * 	2. 유효한 식별자(예:문자, 숫자, 밑줄(_)의 조합)으로 이루어져야 한다
 * 	3. 공백 포함해서는 안된다.
 * 	4. 예약어를 사용해서는 안된다.
 * 
 * 
 * 변수(variable)
 *	데이터를 저장하고 참조하기 위한 메모리 공간을 나타내는 이름
 *	변수는 이름을 통해 메모리 공간에 접근하고 값을 읽거나 수정할 수 있다.
 *
 * 변수 선언 및 초기화
 * 	자료형 변수명 = 값;
 * 
 * 변수명 표기법
 * 	낙타표기법 consolePrint
 * 	스네이크표기법	console_print
 * 
 * 기본 자료형(8가지)
 * 	자바에서 기본적으로 제공해주는 자료형
 * 	실제 데이터 값을 저장
 * 	
 * 	정수형			크기				범위	
 * 		byte		1byte			-128 ~ 127
 * 		short		2byte			-32,768 ~ 32,767 
 * 		int			4byte			-2,147,483,648 ~ 2,147,483,647
 * 		long		8byte			매우 큰 정수
 * 	실수형
 * 		float		4byte			소수점 7자리 표현
 * 		double		8byte			소수점 15자리 표현
 * 	문자형
 * 		char		2byte			유니코드 문자
 * 	논리형
 * 		boolean		1byte			true/false
 * 
 * 
 */
public class Variable {
	
	public static void main(String[] args) {
		// 정수형 변수
		byte byteValue = 10;
		short shortValue = 30000;
		int intValue = 2100000000;
		long longValue = 9223372036854775807L;	// L 접미사 필요
		
		// 실수형 변수
		float floatValue = 3.14f; // f 접미사 필요
		double doubleValue = 3.141592653589793;
		
		// 문자형 변수
		char charValue = 'A';
		
		// 논리형 변수
		boolean boolValue = true;
		
		System.out.println("byte: " + byteValue);
		System.out.println("short: " + shortValue);
		System.out.println("int: " + intValue);
		System.out.println("long: " + longValue);
		System.out.println("float: " + floatValue);
		System.out.println("double: " + doubleValue);
		System.out.println("char: " + charValue);
		System.out.println("boolean: " + boolValue);
		
	}

}











