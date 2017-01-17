package com.choongyul;

public class DrawPattern {
	public static void main(String[] args) {
		DrawPattern dp = new DrawPattern();
		System.out.println("");
		System.out.println("");
		dp.showRectTri(5, "X");
		System.out.println("");

		dp.showReverseTri(10, "X");
		System.out.println("");

		dp.Tri3(5, "X");
		System.out.println("");

		System.out.println("");
		dp.Tri4(5, "X");
		System.out.println("");
		System.out.println("");

		dp.Tri5(5, "X");
		System.out.println("");
		System.out.println("");

		dp.Tri6(5, "X");
		System.out.println("");
		System.out.println("");

		dp.Tri7(5, "X");
		System.out.println("");
		System.out.println("");

		dp.Tri8(5, "X");
		System.out.println("");
		System.out.println("");
		dp.Tri9(10, "X");
		System.out.println("");
		System.out.println("");
		dp.Tri10(5, "X");
		System.out.println("");
		System.out.println("");
		dp.Tri11(10, "X");
		System.out.println("");
		System.out.println("");
		dp.Tri12(7, "X");
		System.out.println("");
		System.out.println("");
		dp.Tri13(6, "X");
		System.out.println("");
		System.out.println("");
		dp.snail(5);
	}
	
	/** count�� unit�� �Է¹޾Ƽ� 
	 *  1���� count�� �� ���ڸ�ŭ unit�� ����մϴ�.
	 *  
	 *  ������� count = 5 , unit = A
	 *  A
	 *  AA
	 *  AAA
	 *  AAAA
	 *  AAAAA
	 * 
	 * @param count
	 * @param unit
	 */
	public void showRectTri(int count, String unit) {
		int i = 0;
		for ( i = 1 ; i <= count ; i++) {
			for ( int j = 1 ; j <= i ; j++) {
				System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	public void showReverseTri(int count, String unit) {
		int i = 0;
		int j = 0;
		
		for ( i = 1 ; i <= count ; i++) {
			// ������ ����ϴ� �ݺ���
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			
//			// unit�� ����ϴ� �ݺ���
//			for ( int k = 1 ; k <= i ; k++) {
//				System.out.print(unit);
//			}
			
			// unit�� ����ϴ� �ݺ���
			for ( j = 1 ; j <= i ; j++) {
				System.out.print(unit);
			}
			
			// �ٹٲٱ�
			System.out.println("");
		}
	}
	
	public void Tri3(int count, String unit) {
		int i = 0;
		int j = 0;
		for( i=1 ; i <= count ; i++) {
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			for( j = 1; j <= i*2 - 1 ; j++ ) {
				System.out.print(unit);
			}
			System.out.println("");
		}
	}
	
	public void Tri4(int count, String unit) {
		int i = 0;
		int j = 0;
		for( i=1 ; i <= count ; i++) {
			// �������
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			// ���� A���
			System.out.print(unit);
			
			// �߰��������
			for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
				System.out.print(" ");
			}
			
			// ������ A ���
			if ( i != 1) {
			System.out.print(unit);
			}
			
			// �ٹٲٱ�
			System.out.println("");
			
			
		}
	}
	
	public void Tri5(int count, String unit) {
		int i = 0;
		int j = 0;
		
		for( i=1 ; i <= count ; i++) {
			// �������
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			// ���� A���
			System.out.print(unit);
			
			// �߰��������, �������ٿ����� A���
			if ( i == count) {
				for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
					System.out.print(unit);
				}
			} 
			else {
				for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
					System.out.print(" ");
				}
			}
			// ������ A ���
			if ( i != 1) {
			System.out.print(unit);
			}
						
			// �ٹٲٱ�
			System.out.println("");
			
		}
		
	}
	
	public void Tri6(int count, String unit) {
		int i = 0;
		int j = 0;
		
		for( i=1 ; i <= count ; i++) {
			// �������
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			// ���� A���
			System.out.print(unit);
			
			// �߰�A���
			for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
				System.out.print(unit);
			}
			
			// ������ A ���
			if ( i != 1) {
			System.out.print(unit);
			}
						
			// �ٹٲٱ�
			System.out.println("");
		}
		// �Ʒ� �ﰢ�� ���
		for ( i = 1 ; i <= count ; i++) {
			// ������ ����ϴ� �ݺ���
			for ( j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			// unit�� ����ϴ� �ݺ���
			for ( j = 1 ; j <= (count-i)*2 -1 ; j++) {
				System.out.print(unit);
			}
			
			// �ٹٲٱ�
			System.out.println("");
		}
	}
	
	
	public void Tri7(int count, String unit) {
		int i = 0;
		int j = 0;
		for( i=1 ; i <= count ; i++) {
			// �������
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			// ���� A���
			System.out.print(unit);
			
			// �߰��������
			for( j = 1; j <= i-1 ; j++ ) {
				System.out.print(" ");
				System.out.print(unit);
			}
			// �ٹٲٱ�
			System.out.println("");
		}
		
		// �Ʒ� �ﰢ�� ���
		for ( i = 1 ; i <= count ; i++) {
			// ������ ����ϴ� �ݺ���
			for ( j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			// unit�� ����ϴ� �ݺ���
			for ( j = 1 ; j <= (count-i)*2 -1 ; j++) {
				System.out.print(unit);
			}
			
			// �ٹٲٱ�
			System.out.println("");
		}
	}
	
	
	public void Tri8(int count, String unit) {
		int i = 0;
		int j = 0;
		for( i=1 ; i <= count ; i++) {
			// �������
			for ( j = count-i ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			// ���� A���
			System.out.print(unit);
			
			// �߰��������
			for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
				System.out.print(" ");
			}
			
			// ������ A ���
			if ( i != 1) {
			System.out.print(unit);
			}
			
			// �ٹٲٱ�
			System.out.println("");
		}
		
		// �Ʒ� �ﰢ�� ���
		for ( i = 1 ; i <= count-1 ; i++) {
			// ������ ����ϴ� �ݺ���
			for ( j = 1 ; j <= i ; j++) {
				System.out.print(" ");
			}
			
			//�Ʒ� ���� A
			System.out.print(unit);
			
			// unit�� ����ϴ� �ݺ���
			for ( j = 1 ; j <= (count-i)*2 -3 ; j++) {
				System.out.print(" ");
			}
			
			//�Ʒ� ������ A
			if ( i != count-1) {
				System.out.print(unit);
				}
			// �ٹٲٱ�
			System.out.println("");
		}
		
	}
	
	public void Tri9(int count, String unit) {
		int i = 0;
		int j = 0;
		// �Ʒ� �ﰢ�� ���
		for ( i = 1 ; i <= count ; i++) {
			// ������ ����ϴ� �ݺ���
			for ( j = 2 ; j <= i ; j++) {
				System.out.print(" ");
			}	
			//�Ʒ� ���� A
			System.out.print(unit);
					
			// �� �ﰢ�� �߰������� ����ϴ� �ݺ���
			for ( j = 1 ; j <= (count-i)*2 -1 ; j++) {
				System.out.print(" ");
				}
					
			//�Ʒ� ������ A
			if ( i != count) {
				System.out.print(unit);
				}
			// �ٹٲٱ�
			System.out.println("");
		}
		
		// �Ʒ� �ﰢ�� ���
		for( i=1 ; i <= count ; i++) {
			
			// �������
			if ( i != 1) {
				for ( j = count-i ; j >= 1 ; j--) {
					System.out.print(" ");
				}
				// ���� A���
				System.out.print(unit);
				
				// �߰��������
				for( j = 1; j <= (i-1)*2 - 1 ; j++ ) {
					System.out.print(" ");
				}
			
				// ������ A ���
				System.out.print(unit);
			
			
				// �ٹٲٱ�
				System.out.println("");
			}
		}
		
	}
	
	
	
	public void Tri10(int count, String unit) {
		int i = 0;
		int j = 0;
		for ( i = 1; i <= count; i++) {
			
			System.out.print(unit);
			
			
		}
		System.out.println("");
		for ( i = 1; i <= count - 2; i++) {
			
			System.out.print(unit);
			
			for ( j = 1 ; j <= count - 2 ; j++) {
				System.out.print(" ");
			}
			
			System.out.println(unit);
		}
		for ( i = 1; i <= count; i++) {
			System.out.print(unit);
		}
	}
	
	public void Tri11(int count, String unit) {
		int i = 0;
		int j = 0;
		int k = 0;
		int temp = 0;
		for (i = 0; i < count; i++) {
			
			if (j != count) {
				for (j = 0; j<count; j++) {
					System.out.print(unit);
				}
				System.out.println("");
			}
			
			System.out.print(unit);
			for (k = 0; k < count -2 ; k++) {
				System.out.print(" ");
			}
			System.out.println(unit);
			
			temp += 1;
			if (temp == count) {
				for (j = 0; j<count; j++) {
					System.out.print(unit);
				}
			}
		}
		System.out.println("");
	}
	
	public void Tri12(int count, String unit) {
		int i = 0;
		int j = 0;
		int k = 0;
		int temp = 0;
		for (k = 0; k < count; k++) {
			for (i=0;i<count-k;i++) {
				System.out.print(unit);
				for (j=0;j<count-k-1;j++) {
					System.out.print(" ");
				}
			}
			System.out.println("");
			temp += i;
			for (i = 2; i <= temp - k ; i++) {
				System.out.print(" ");
			}
		}
	}
						//6  //   x
	public void Tri13(int count, String unit) {
		int i = 0;
		int j = 0;
		int k = 0;
		int z = 0;
		int temp = 0;
		int temp2 = 0;
		
		for (i=1; i<=count; i++) {
			temp = temp + i;
		}
		System.out.println(temp);
		for(k=1; k<=count ; k++) {	
			for (i = 1; i <= temp ; i++) {
				System.out.print(" ");
			}
			
			temp = temp - (count-(k-1));
//			System.out.print(temp);
			System.out.print(unit);
			
			
			for(j = 0 ; j < count ; j ++){
				System.out.print(" ");
			}
			
			for(j = 0 ; j < temp2 ; j ++){
				System.out.print(" ");
			}
			
			temp2 = temp2 + count-(k-2);
//			System.out.print(temp2);
			
			for(j = 1 ; j < temp2 ; j ++){
				System.out.print(" ");
			}
			System.out.print(unit);
			System.out.println("");
		}
	}
	
	// �Է°� 25
	public void snail(int count) {
		int i = 0;
		int j = 0;
		int k = 0;
		int z = 0;
		int temp = 0;
		int temp1 = 0;
		int temp2 = 0;
		
		for ( i = 1 ; i<=count ; i++ ) {
			if ( i != count ) {
				if(i == 1) {
					
					for ( k = 1 ; k <= count ; k++ ) {
						if ( k < 10 ) {
							System.out.print("0" + k + " ");
						}
						else {
							System.out.print(k + " ");
						}
					}
					
					System.out.println("");
				}
				
				if ( i == 2) {
					//							count * 4 - 4 + (count-1)
					for ( j = count * 4 - 4 ; j < 5*count - 5 ; j ++ ) {
						if ( j < 10 ) {
							System.out.print("0" + j + " ");
						}
						else {
							System.out.print(j + " ");
						}
					}
					
					if ( count+i-1 < 10 ) {
						System.out.println("0" + (count+i-1) + " ");
					}
					else {
						System.out.println((count+i-1) + " ");
					}
				}
				
				if ( i == 3 ) {
					temp = count * 4 - 5;
					if ( temp < 10 ) {
						System.out.print("0" + (temp) + " ");
					}
					else {
						System.out.print(temp + " ");
					}
					
					
					for ( k = 8 * count - 16 ; k < 9 * count - 19 ; k++) {
						System.out.print(k + " ");
					}
					System.out.print(j + " ");
					
					if ( count+i-1 < 10 ) {
						System.out.println("0" + (count+i-1) + " ");
					}
					else {
						System.out.println((count+i-1) + " ");
					}
					
				}
				
				// 4��° ��
				if ( i == 3 ) {
					temp1 = 4 * count - 6;
					if ( temp1 < 10 ) {
						System.out.print("0" + (temp1) + " ");
					}
					else {
						System.out.print((temp1) + " ");
					}		
					
					temp1 = 8 * count - 17;
					
					for ( j = 8 * count - 17 ; j >= 8 * count - 19 ; j-- ) {
						if ( j < 10 ) {
							System.out.print("0" + (j) + " ");
						}
						else {
							System.out.print((j) + " ");
						}	
					}
						
					temp1 = count + i;
					if ( temp1 < 10 ) {
						System.out.print("0" + (temp1) + " ");
					}
					else {
						System.out.print((temp1) + " ");
					}	
					
					
					System.out.println("");
				}
			}
		else { // i == count �̸�
			
			for(j = 3 * count - 2 ; j >= 2 * count - 1 ; j-- ) {
				if ( j < 10 ) {
					System.out.print("0" + j + " ");
				}
				else {
					System.out.print(j + " ");
				}
			}
			
		}
			
			
		} // �� ���� ������ ��������.
		
		
	}
}
