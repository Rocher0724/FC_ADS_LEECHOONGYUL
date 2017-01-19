package week.day3;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		/*
		 * 1. 문자열 비교 문자열.compareTo(문자열) 문자열.
		 * equals() 은 문자비교를 주로 하며 다른것은 잘안된다. 
		 *  ==  으로 하는 비교는 메모리 주소를 비교한다.
		 */

		String a = "231131";
		String b = "231111";
		String c = "231131";

		System.out.println(a.compareTo(b)); // -1 출력
		System.out.println(a.compareTo(c)); // 0 출력

		System.out.println(a.equals(c)); // true 출력
		System.out.println(a.equals(b)); // false 출력

		System.out.println(a == c); // true 출력 이지만 쓰지않음. 

		/*
		 * 2. 문자열의 인덱스 값 charAt(index) - index 번째 문자를 가져온다.
		 */
		System.out.println(a.charAt(2));

		// 3. 문자열 합치기
		System.out.println(a + b);

		// 4. 무엇으로 시작하는, 끝나는 문자열인지 판단
		// 문자열.startsWith("문자열");
		// 문자열.endsWith("문자열");
		System.out.println(a.startsWith("21"));
		System.out.println(a.endsWith("31"));

		/*
		 * 5. 찾고자 하는 문자열이 몇번째 있는지... 
		 * 		3이라는 글자가 몇 번 째에 있는지 여러개 있을 때는 그중 맨 앞에 있는 문자열의
		 * 인덱스 값을 가져온다.
		 */
		System.out.println(a.indexOf("3"));

		// 6. 문자열의 길이
		System.out.println(a.length());
		
		//7. 문자열 변경. 앞자리 문자를 뒷자리로 변경
		System.out.println(a.replace("1", "x"));
		
		//8. 문자열의 패턴: 정규식
		// a.replaceAll(문자열의 패턴:정규식, 바꿀문자)
		
		//9. 문자열 자르기
		System.out.println(a.substring(3)); // 3번째 부터 끝까지 가져온다.
		System.out.println(a.substring(3, 4)); // 3번째부터 4번째 이전까지 가져온다.3 <= x < 4
		
		//10. 문자열 분리하기
		String value = "a/b/cdg/a2223/afefs";
		String values[] = value.split("/");
		for (String s : values) {
			System.out.println(s);
		}
		 // 숫자 -> 문자 변환
		String str = 888 + "";
		
		// 문자 -> 숫자 변환
		int number = Integer.parseInt(str);
		long longnumber = Long.parseLong(str);
		
		// 하나의 숫자를 char로 변형
		int argNum = 8;    // 입력하는 숫자
		int argDigix = 10;  // 진법
		
		char cha = Character.forDigit(argNum, argDigix);
		
		// 문자를 캐릭터 단위(1글자씩)로 분해
		String target = "8888";
		char arrs[] = target.toCharArray();
		
		// 배열 정렬
		Arrays.sort(arrs);
		
		
		
	}

}
