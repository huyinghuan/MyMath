package test;

import org.junit.Test;

/**
 * 输入两个正整数m和n,求其最大公约数和最小公倍数
**/
public class Question006 {
	
	
	public int[] getGYSandGBS(int i,int j){
		int[] arr ={1,1};
		if(i == j){
			arr[0] = i;
			arr[1] = i;
			return arr;
		}
		int min = (i>j?j:i);
		for(int x=2;x<=min;x++){
			if(i%x==0&&j%x==0){
				arr[0] =arr[0]*x;
				i = i/x;
				j = j/x;
				x--;
			}
		}
		arr[1] = arr[0]*j*i;
		return arr;
	}
	
	@Test
	public void Q1(){
		int s = 0;
		for(int i = 1 ;i<=100;i++){
			s = (int)(Math.random()*100);
			int arr[] = getGYSandGBS(i,s);
			System.out.println(i+","+s+":"+arr[0]+","+arr[1]);
		}
	}
	
}
