package test;

import org.junit.Test;

/**
 * 【程序10】 题目:一球从100米高度自由落下,每次落地后反跳回原高度的一半;再落下,
 * 求它在第10次落地时,共经过多少米?第10次反弹多高?
*/
public class Question008 {

	@Test
	public void Q1(){
		for(int i = 1;i<11;i++){
			ft(100,i);
		}
		
	}
	
	public void ft(double height,int num){
		 double sum = height;
		 for(int i=1;i<num;i++){
			 height = height/2;
			 sum = sum + height;
		 }
		 System.out.println("第"+num+"次落地时经过的路程"+sum);
		 System.out.println("第"+num+"次反弹的高度"+height/2);
	}
	
}
