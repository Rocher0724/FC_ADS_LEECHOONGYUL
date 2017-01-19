package week.day3;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {

		String myName = "leechoongyul";
		String palYong = "palyong";
		String jaeSeock = "jaeseok";
		String jaeMin = "jaemin";
		String seokYang = "seokYang";

		// 개수가 정해져 있을 때 배열을 사용.
		String aaa[] = new String[5];
		aaa[0] = "myName";
		aaa[1] = seokYang;

		/**
		 * 객체와 클래스와 인스턴스?? 객체라 불리는 애들은 아직까지 코드랑 연관이 없는 상태이다. 인스턴스화 시키는것을 객체라 부르는
		 * 경우도 있다. 객체는 설계단계에 개념화된 앞으로 코딩할 것 이다.
		 * 
		 * 클래스는 개념화된 객체를 코딩한게 클래스이다.
		 * 
		 * 이 코드를 실행을 시켰을 때 메모리에 올라간 순간 인스턴스라고 부른다. new 를 하는 순간 인스턴스가 된다. new를 하면
		 * 메모리 heap 영역에 공간이 할당된다.
		 * 
		 * <String> 은 제네릭으로 collection의 자료형을 지정하여 주는 것이다. 제네릭이 생긴 이유는 collection사용 시 혹시 다른 자료형이 
		 * 들어갔을때 미리 알기 위함이다.
		 */

		ArrayList<String> nameList = new ArrayList<>();
		nameList.add(myName);
		nameList.add(palYong);
		nameList.add(jaeSeock);
		nameList.add(jaeMin);
		nameList.add(seokYang);
		
		int x;
		/**
		 * 동적인 함수를 기준으로 사용하면 안된다는 권고사항이 있다. 
		 * 아래와 같이 nameList.size 를 사용하면 포문 내에서 사이즈가 변화할 가능성이 있기 때문이다. 
		 * 그래서 보통 사이즈를 외부에서 따로 배정해준다. 
		 */
		int nameListSize = nameList.size();
		for( x=0 ; x<nameListSize ; x++) {
			System.out.println(x+1 + "번째 사람 : " + nameList.get(x));
		}
		/**
		 * 위의 방식은 전통적인 방식이고 
		 * 아래와 같이 하는 방식도 있다 for each 구문.
		 */
		for( String name : nameList ) {
			System.out.println(name);
		}
		
		// indexOf 를 아래와같이 포문을 사용하진 않지만, indexOf()는 ()안에 있는 문자의 순서를 알려준다.String.indexOf()도 가능.
		for( String name : nameList ) {
			System.out.println(nameList.indexOf(jaeSeock));
		}
		
	}

	/**
	 * 컬렉션에는 기본자료형을 넣을수가 없었다. int char 등, String은 객체자료형이기 때문에 사용할 수 있다.
	 * int와 char 등 기본자료형을 java 7부터 가능하게 해주면서 집어넣었을 때 자료형을 Object 로 변환하여 집어넣는다. 
	 * 꺼낼 때는 자료형 캐스팅을 해주어야 한다. 
	 */
}
