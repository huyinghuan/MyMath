package test;

import org.junit.Test;

/**
 * 题目:打印出所有的 "水仙花数 ",所谓 "水仙花数 "是指一个三位数,其各位数字立方和等于该数本身。例如:153是一个 "水仙花
数 ",因为153=1的三次方+5的三次方+3的三次方。  
数中含有两个8或者两个9的排除
*/
public class Question003 {

	@Test
	public void Q1(){
		long num = System.currentTimeMillis();
		for(int i=100;i<987;i++){
			fenjie(i);
		}
		System.out.println((System.currentTimeMillis()-num));//耗时2-3ms
	}
	
	@Test
	public void Q2(){
		long num = System.currentTimeMillis();
		for(int i=100;i<987;i++){
			fenjie2(i);
		}
		System.out.println((System.currentTimeMillis()-num));//耗时2-3ms
	}
	
	public void fenjie(int i){
		int [] num = new int[3];
		num[0] = i/100;
		num[1] = (i%100)/10;
		num[2] = i%10;
		if(Math.pow(num[0],3)+Math.pow(num[1],3)+Math.pow(num[2],3) == i)
			System.out.println(i);
	}
	
	public void fenjie2(int i){
		int x = i/100;
		int y = (i%100)/10;
		int z = i%10;
		if(Math.pow(x,3)+Math.pow(y,3)+Math.pow(z,3) == i)
			System.out.println(i);
	}
}
