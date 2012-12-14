package test;

import org.junit.Test;

/**
 * 有n个学校 参加某运动会 其中 男子项目有x 个，女子项目有 y
 * 因为每个项目根据参与人数不同 ，每个项目取名次也不同
 * 现在假设 奇数项目取前7名，偶数项目取前5名
 * 前7名的 积分分别是 7, 5, 3, 2, 1
 * 前5名的 积分分别是 5，3，2
 * 请计算每个学校的 男女积分排名 和总积分排名
 * 请自行设计 测试参数*/
public class Question010 {
	
	@Test
	public void Q10(){
		int school[] = new int[7];//初始化学校总分数
		int manNum[] = new int[7];//初始化男子分数
		int womNum[] = new int[7];//初始化女子分数
		int manXM = 12;//初始化 男子项目数
		int womXM = 34;//初始化 女子项目数
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
				schoolNum[getRandom(length)] += 7;//模拟得分情况
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
