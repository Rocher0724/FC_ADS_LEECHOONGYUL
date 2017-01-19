package week.day3;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) {

		String myName = "leechoongyul";
		String palYong = "palyong";
		String jaeSeock = "jaeseok";
		String jaeMin = "jaemin";
		String seokYang = "seokYang";

		// ������ ������ ���� �� �迭�� ���.
		String aaa[] = new String[5];
		aaa[0] = "myName";
		aaa[1] = seokYang;

		/**
		 * ��ü�� Ŭ������ �ν��Ͻ�?? ��ü�� �Ҹ��� �ֵ��� �������� �ڵ�� ������ ���� �����̴�. �ν��Ͻ�ȭ ��Ű�°��� ��ü�� �θ���
		 * ��쵵 �ִ�. ��ü�� ����ܰ迡 ����ȭ�� ������ �ڵ��� �� �̴�.
		 * 
		 * Ŭ������ ����ȭ�� ��ü�� �ڵ��Ѱ� Ŭ�����̴�.
		 * 
		 * �� �ڵ带 ������ ������ �� �޸𸮿� �ö� ���� �ν��Ͻ���� �θ���. new �� �ϴ� ���� �ν��Ͻ��� �ȴ�. new�� �ϸ�
		 * �޸� heap ������ ������ �Ҵ�ȴ�.
		 * 
		 * <String> �� ���׸����� collection�� �ڷ����� �����Ͽ� �ִ� ���̴�. ���׸��� ���� ������ collection��� �� Ȥ�� �ٸ� �ڷ����� 
		 * ������ �̸� �˱� �����̴�.
		 */

		ArrayList<String> nameList = new ArrayList<>();
		nameList.add(myName);
		nameList.add(palYong);
		nameList.add(jaeSeock);
		nameList.add(jaeMin);
		nameList.add(seokYang);
		
		int x;
		/**
		 * ������ �Լ��� �������� ����ϸ� �ȵȴٴ� �ǰ������ �ִ�. 
		 * �Ʒ��� ���� nameList.size �� ����ϸ� ���� ������ ����� ��ȭ�� ���ɼ��� �ֱ� �����̴�. 
		 * �׷��� ���� ����� �ܺο��� ���� �������ش�. 
		 */
		int nameListSize = nameList.size();
		for( x=0 ; x<nameListSize ; x++) {
			System.out.println(x+1 + "��° ��� : " + nameList.get(x));
		}
		/**
		 * ���� ����� �������� ����̰� 
		 * �Ʒ��� ���� �ϴ� ��ĵ� �ִ� for each ����.
		 */
		for( String name : nameList ) {
			System.out.println(name);
		}
		
		// indexOf �� �Ʒ��Ͱ��� ������ ������� ������, indexOf()�� ()�ȿ� �ִ� ������ ������ �˷��ش�.String.indexOf()�� ����.
		for( String name : nameList ) {
			System.out.println(nameList.indexOf(jaeSeock));
		}
		
	}

	/**
	 * �÷��ǿ��� �⺻�ڷ����� �������� ������. int char ��, String�� ��ü�ڷ����̱� ������ ����� �� �ִ�.
	 * int�� char �� �⺻�ڷ����� java 7���� �����ϰ� ���ָ鼭 ����־��� �� �ڷ����� Object �� ��ȯ�Ͽ� ����ִ´�. 
	 * ���� ���� �ڷ��� ĳ������ ���־�� �Ѵ�. 
	 */
}
