package com.tj.array;
// �迭 ����
public class Ex05 {
	public static void main(String[] args) {
		int[] num = {100 ,20,30,40,50};
		int[] newNum = new int[num.length];
		
		/*for(int i = 0 ;i<num.length;i++) { //API �� �̿��������� �迭 ����
			newNum[i]=num[i];
		}*/
		System.arraycopy(num, 0, newNum, 0, num.length);// API �� �̿��� ���� 
		
		for(int i =0 ; i<num.length;i++) {
			System.out.printf("num[%d]=%d\t newNum[%d]=%d\n",i,num[i],i,newNum[i]);
		}
		System.out.println("newNum�迭�� ����");
		newNum[0]=9; newNum[2]=9; newNum[4]=9;
		for(int i =0 ; i<num.length;i++) {
			System.out.printf("num[%d]=%d\t newNum[%d]=%d\n",i,num[i],i,newNum[i]);
		}
	}
}
