package com.tj.array;

public class Ex02 {
	public static void main(String[] args) {
		int i;
		i = 10;
		// 2. �迭�� ����(�迭���� Ȯ��)�ϰ� �ʱ�ȭ�� �����Ѵ�.
		int[] iArr = new int[3]; //�迭�� ���� :3
		iArr[0]=100;
		iArr[1]=200;
		iArr[2]=3000;
		
		for(int idx = 0; idx<iArr.length;idx++) {
			System.out.printf("iArr[%d]=%d\n",idx,iArr[idx]);
		}
		
		
		
		
		
	}
}
