package com.intheeast.stringclass;

public class StringCallMain {

	static {
		// 엘리먼트 사이즈가 2바이트인 unicode 값을 저장할 수 있는...
		char[] helloArray = { 'h', 'e', 'l', 'l', 'o', '.' };
		// index에 들어가 있는 값은 h자체가 아닌 코드포인트 값
		// 자바에서 배열은 클래스 인스턴스처럼 다룬다
		// 확인하는법 helloArray. 하면 Object를 상속한걸 확인할수있다
		String helloString = new String(helloArray);
								// F3누르고 갔을때 char value[]는(C언어 스타일)
								//                    == char[] value
								// "" <- 텅빈 문자열
								// char은 2바이트인데 1바이트로 (형변환)압축함[사이즈를 줄임]
								// -> 상위바이트를 날린다

	
		String palindrome = "Dot saw I was Tod";
		int len = palindrome.length();
		// 디버깅시 len = 17 -> .length()은 문자열 객체에 포함된 문자 개수를 반환 메서드
	
	}
	
	
	public static void main(String... args) {
		
		String str1 = "Python"; // literal[String Constant] pool in heap area
		String str2 = new String("Python");// in heap area : 일반적인 인스턴스임.
	
		// 결국 equals 메서드는 동일한 문자열을 각각의 String 인스턴스가 가지고 있는지를...
		// 동일한 문자열을 각각의 String 인스턴스가 가지고 있는지를 확인하느 메서드
		boolean isEqual = str1.equals(str2);
		
		
		
//		if (str1.equals(str2)) {
//		    System.out.println("objects are equal");
//		} else {
//		    System.out.println("objects are not equal");
//		}
		
		/* intern()
		리턴값 : 문자열 객체에 대한 표준 표현(canonical representation) 을 반환합니다.
		클래스 String은 초기에는 비어 있는 문자열 풀(string pool) 을 비공개로 유지합니다.
		intern 메서드가 호출되면,
		만약 그 풀 안에 이 String 객체와 equals(Object) 메서드로 
		비교했을 때 같은 문자열 이 이미 존재하면,
		풀에 저장되어 있는 문자열 객체를 반환합니다.
		그렇지 않으면, 현재 String 객체를 풀에 추가하고, 그 객체에 대한 참조를 반환합니다.		
		따라서, 어떤 두 문자열 s와 t에 대해,
		s.intern() == t.intern()이 참(true)이 되는 것은
		오직 s.equals(t)가 참(true)일 때뿐입니다.		
		모든 문자열 리터럴과 문자열로 계산된 상수 표현식은 자동으로 intern 처리됩니다.	
		반환값:
		이 문자열과 내용은 같지만,
		문자열 풀 내에 있는 고유한 문자열을 반환합니다. 
		 */	
	
		String str = "Javapoint";
		
		String str3 = new String("Javapoint");
	
		// literal pool에 있는 "Javapoint" 문자열 리터럴을 인스턴스 하겠다
		String str4 = new String("Javapoint").intern();
		
		// 현재 리터럴 풀에는 Pyth 스트링이 없음.
		// 그런데도 리터럴 풀에 Pyth 스트링이 있으면 찾아서 달라고 함
		// : 결국은 없음... 그래서 Pyth 스트링 인스턴스를 생성한 후,
		//   이 인스턴스를 리터럴 풀에서 관리함.
		String str5 = new String("Pyth").intern();
		
		String str6 = new String("Pyth").intern();
		
		return;
	}

}
