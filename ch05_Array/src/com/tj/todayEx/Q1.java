package com.tj.todayEx;

public class Q1 {
	public static void main(String[] args) {
		String[] title = {"제품명" ,"1월" , "2월" ,"3월", "4월" , "합계" , "평균"};
		String[] name = {"냉장고","테레비","청소기"};
		int[][] price = {{250,170,300,780},{170,120,150,220},{450,230,400,250}};
		
		int sum =0; double avg= 0;
		int [] total =new int[4];
		line('■',100);
		System.out.println("매출현황");
		line('■',100);
		for(int i=0;i<title.length;i++) {
			System.out.print(title[i]+"\t");
		}
		System.out.println();
		line('■',100);
		for(int i =0; i<name.length;i++) {
			System.out.printf(name[i]+"\t");
			for(int j=0; j<price[i].length; j++) {
				
				System.out.print(price[i][j]+"\t");
				sum+= price[i][j];
				total[j]+=price[i][j];
			}
			avg= (double)sum/price[i].length;
			System.out.printf("%d\t%.1f\n",sum,avg);
			sum=0;
		}
		line('■',100);
		System.out.print("총계\t");
		for(int i =0; i<total.length; i++) {
			System.out.print(total[i]+"\t");
			sum +=total[i];
		}
		avg= (double)sum/price.length;
		System.out.printf("%d\t%.1f\n",sum,avg);
		line('■',100);
		

		
	}

	private static void line(char ch, int no) {
		for(int i=0;i<no;i++) {
			System.out.print(ch);
		}
		System.out.println();
		
	}
}
