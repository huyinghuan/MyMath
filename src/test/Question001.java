package test;

import org.junit.Test;

/**
 * 题目:
 * 古典问题:有一对兔子,从出生后第3个月起每个月都生一对兔子,小兔子长到第四个月后每个月又生一对兔子
 * 假如兔子都不死,问每个月的兔子总数为多少 （第四个月怎么算。是从出生经过四个月还是，从第一只兔子开始的第四个月）
   从出生经过四个月：
   Q1-1：
   1 2 3 4 5 6 7 8 9
   每天增加的鸡的 示意图 ，计算某天总数，应该全部加起来，ex. 3t = 1+0+1=2; 6t = 1+0+1+1+1+2=6
   1 0 1 1 1 1 1 1
   	
   			 1 1 1
    			 
   			   1 1
   			   
   			   	 1  从第五个月开始 兔子成等差数列增长
  
                  1   x<3
        f(x) ={  f(x-1)+f(x-3)  x<6
                 f(5-1)+f(5-3) + E（x-4）-1  x>5  PS: E（2）：1+2 ；E（3）= 1+2+3 。。。。
   
   Q1-2 从第一只兔子开始的第四个月
   1 2 3 4 5 6 7 8 9
   某天鸡总数的示意图  ex. 3t =2; 4t=3 5t=5
   1 1 1 1 1 1
   	   1 1 1 1
   	   	 1 1 1
   	   	   1 1
   	   	   1 1
   	   	     1
   	   	     1
   	   	     1
   1 1 2 3 5 8   此数列为斐波那数列 即某天的数量为前两天之和
           1  x=1
   f(x) =  1  x=2
   		  f(x-1)+f(x-2)  x>2
**/
 
public class Question001 {
    @Test
	public void Q1(){
		int month = 9;
		int sum = 0;
		sum = Q1_A(month);
		
		System.out.println(sum);
		
	}
    
    public int Q1_A(int i){
    	if(i<3) return 1;
    	else if(i<6) return Q1_A(i-1)+Q1_A(i-3);
    	else if (i>5) return Q1_A(5-1)+Q1_A(5-3)+lj(i-4)-1;
    	return 0;
    }
	
    //连加
	public int lj(int i){
		if(i==1){
			return 1;
		}else{
			 return lj(i-1)+i;
		}
	}
	
	@Test
	public void Q1_2(){
		System.out.println(fbn(3));
		System.out.println(fbn(4));
		System.out.println(fbn(5));
		System.out.println(fbn(6));
	}
	//斐波那数列
	public int fbn(int i){
		if(i>2) return fbn(i-1)+fbn(i-2);
		else return 1;
	}
	
	

}
