package test;

import org.junit.Test;


public class Question010 {
	
	@Test
	public void Q10(){
		int school[] = new int[7];//初始化分数
		int manNum[] = new int[7];//初始化分数
		int womNum[] = new int[7];//初始化分数
		int manXM = 12;
		int womXM = 34;
		System.out.println("男子比赛：");
		int manSum[] =	tongji(manNum,manXM);
		System.out.println("女子比赛：");
		int womSum[] = tongji(womNum,womXM);
		
		for(int i=0;i<manNum.length;i++){
			school[i] = manSum[i] +  womSum[i];
		}
		System.out.println("总分统计：");
		for(int i=0;i<manNum.length;i++){
			System.out.print(school[i]+",");
		}
	}
	
	
	public int[] tongji(int[] schoolNum,int manXM){
		int length = schoolNum.length;
		int random;
		for(int i=1;i<=manXM;i++){
			if(i%2 != 0){
				schoolNum[getRandom(length)] += 7;//(int)Math.random()*length  0,1,2,3
				schoolNum[getRandom(length)] +=5;
				schoolNum[getRandom(length)] +=3;
				schoolNum[getRandom(length)] +=2;
				schoolNum[getRandom(length)] +=1;
				
				System.out.print("第"+i+"场比赛的分数统计是：");
				for(int j=0;j<length;j++){
					System.out.print(schoolNum[j]+",");
				}
				System.out.println("");
			}else{
				schoolNum[getRandom(length)] +=5;
				schoolNum[getRandom(length)] +=3;
				schoolNum[getRandom(length)] +=2;
				
				System.out.print("第"+i+"场比赛的分数统计是：");
				for(int j=0;j<length;j++){
					System.out.print(schoolNum[j]+",");
				}
				System.out.println("");
			}
			
		}
		return schoolNum;
		
	}
	
	public int getRandom(int i){
		
		return Integer.parseInt((Math.random()*i+"").split("\\.")[0]);
	}
	
}
