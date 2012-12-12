package test;

import org.junit.Test;

/**
 * 判断101-200之间有多少个素数,并输出所有素数
*/
public class Question002 {
	
	@Test
	public void Q2(){
		caluction(100,201);
		caluction(100);
	}
	
	public void caluction(int start,int end){
		for(int i = start;i<end;i++){
			if(isSuShu(i)) System.out.println(i);
		}
	}
	public void caluction(int end){
		for(int i = 2;i<end;i++){
			if(isSuShu(i)) System.out.println(i);
		}
	}
	
	public boolean isSuShu(int i){
		boolean flag = true;
		for (int j = 2; j < i/2+1 && flag; j++) {
			if (i % j == 0) {
				flag = false;
				break;
			}
		}
			 return flag;
	}
}
