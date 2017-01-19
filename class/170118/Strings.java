package week.day3;

import java.util.Arrays;

public class Strings {

	public static void main(String[] args) {
		/*
		 * 1. ���ڿ� �� ���ڿ�.compareTo(���ڿ�) ���ڿ�.
		 * equals() �� ���ں񱳸� �ַ� �ϸ� �ٸ����� �߾ȵȴ�. 
		 *  ==  ���� �ϴ� �񱳴� �޸� �ּҸ� ���Ѵ�.
		 */

		String a = "231131";
		String b = "231111";
		String c = "231131";

		System.out.println(a.compareTo(b)); // -1 ���
		System.out.println(a.compareTo(c)); // 0 ���

		System.out.println(a.equals(c)); // true ���
		System.out.println(a.equals(b)); // false ���

		System.out.println(a == c); // true ��� ������ ��������. 

		/*
		 * 2. ���ڿ��� �ε��� �� charAt(index) - index ��° ���ڸ� �����´�.
		 */
		System.out.println(a.charAt(2));

		// 3. ���ڿ� ��ġ��
		System.out.println(a + b);

		// 4. �������� �����ϴ�, ������ ���ڿ����� �Ǵ�
		// ���ڿ�.startsWith("���ڿ�");
		// ���ڿ�.endsWith("���ڿ�");
		System.out.println(a.startsWith("21"));
		System.out.println(a.endsWith("31"));

		/*
		 * 5. ã���� �ϴ� ���ڿ��� ���° �ִ���... 
		 * 		3�̶�� ���ڰ� �� �� °�� �ִ��� ������ ���� ���� ���� �� �տ� �ִ� ���ڿ���
		 * �ε��� ���� �����´�.
		 */
		System.out.println(a.indexOf("3"));

		// 6. ���ڿ��� ����
		System.out.println(a.length());
		
		//7. ���ڿ� ����. ���ڸ� ���ڸ� ���ڸ��� ����
		System.out.println(a.replace("1", "x"));
		
		//8. ���ڿ��� ����: ���Խ�
		// a.replaceAll(���ڿ��� ����:���Խ�, �ٲܹ���)
		
		//9. ���ڿ� �ڸ���
		System.out.println(a.substring(3)); // 3��° ���� ������ �����´�.
		System.out.println(a.substring(3, 4)); // 3��°���� 4��° �������� �����´�.3 <= x < 4
		
		//10. ���ڿ� �и��ϱ�
		String value = "a/b/cdg/a2223/afefs";
		String values[] = value.split("/");
		for (String s : values) {
			System.out.println(s);
		}
		 // ���� -> ���� ��ȯ
		String str = 888 + "";
		
		// ���� -> ���� ��ȯ
		int number = Integer.parseInt(str);
		long longnumber = Long.parseLong(str);
		
		// �ϳ��� ���ڸ� char�� ����
		int argNum = 8;    // �Է��ϴ� ����
		int argDigix = 10;  // ����
		
		char cha = Character.forDigit(argNum, argDigix);
		
		// ���ڸ� ĳ���� ����(1���ھ�)�� ����
		String target = "8888";
		char arrs[] = target.toCharArray();
		
		// �迭 ����
		Arrays.sort(arrs);
		
		
		
	}

}
