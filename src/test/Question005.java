package test;

import org.junit.Test;

/***
 * 题目:利用条件运算符的嵌套来完成此题:学习成绩> =90分的同学用A表示,60-89分之间的用B表示,60分以下的用C表示。
*/
public class Question005 {

	public char switchGrade(int grade){
		return grade>=90?'A':(grade>=60&&grade<90)?'B':'C';
	}
	
	@Test
	public void Q1(){
		int s = 0;
		for(int i = 0 ;i<=100;i++){
			s = (int)(Math.random()*100);
			System.out.println(s+":"+switchGrade(s));
		}
		
	}
	
}
