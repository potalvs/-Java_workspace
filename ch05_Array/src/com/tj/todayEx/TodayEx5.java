package com.tj.todayEx;
//76,45,34,89,100,50,90,92 �����ϱ� 
public class TodayEx5 {
	public static void main(String[] args) {
		String[] title = {"�̸�","����","����","����","����","���"};
		String[] name = {"���켺","���ϴ�","Ȳ����","������","������"};
		int [][]score = {{90,90,90},{90,95,79},{90,69,65},{49,54,65},{43,54,32}};

		int sum =0; double avg;
		int[] total = new int[3];
		line('=',50);
		System.out.println("����ǥ");
		line('=',50);
		for(String t: title) System.out.print(t+"\t");
		System.out.println();
		line('=',50);
		for(int i=0 ; i<name.length; i++ ) {
			System.out.print(name[i]+"\t");
		for(int j=0; j<score[i].length; j++) {
			//i�� j�� ������ ����ϰ� sum �� total[j]�� ����
			System.out.print(score[i][j]+"\t");
			sum += score[i][j];
			total[j]+=score[i][j];
			
		}
		avg = (double)sum/score[i].length;
		System.out.printf("%d\t%.1f\n",sum,avg);
		sum=0;
	}
		line('=',50);
		System.out.print("�Ѱ�\t");
		for(int i =0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
			sum +=total[i];
		}
		avg =(double)sum/total.length;
		System.out.printf("%d\t%.1f\n",sum,avg);
		
		line('=',50);
		
	}
	

	private static void line(char ch,int no) {
		for(int i =0 ; i<no ; i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	}
}