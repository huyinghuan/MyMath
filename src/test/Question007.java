package test;

import org.junit.Test;

/**
 * 题目:一个数如果恰好等于它的因子之和,这个数就称为 "完数 "。例如6=1+2+3.编程   找出1000以内的所有完数。 
  ps:一个数的本身也它的因子，不算？*/
public class Question007 {
	@Test
	public void Q1(){
		for(int i=2;i<1000;i++){
			isWanShu(i);
		}
	}
	
	public void isWanShu(int i){
		int sum =1;
		for(int j=2;j<i/2+1;j++){
			if(i%j==0){
				sum = sum+j;
			}
		}
		if(i==sum){
			System.out.println(i);
		}
		
	}
}
