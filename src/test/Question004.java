package test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
/**题目:将一个正整数分解质因数。例如:输入90,打印出90=2*3*3*5。  
*/
public class Question004 {

	@Test
	public void Q1(){
		for(int i=100;i<1000;i++){
			List<Integer> list = feijie(i);
			System.out.println(i+"="+list);
		}
	}
	
	public List<Integer> feijie(int i){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int j=2;j<i/2+1;j++){
			if(i%j==0){
				list.add(j);
				i = i/j;
				j--; //重复除该数
			}
		}
		list.add(i);
		return list;
	}
}
