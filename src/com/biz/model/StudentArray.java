package com.biz.model;

import java.util.Random;

import com.biz.model.Student;

public class StudentArray {

	/*
	 *Student 클래스를 객체배열로 생성하고
	 *가상의 학생 성적데이터를 만들어서
	 *return하는 배열을 생성 
	 */
	
	public Student[] makeScore(int stdLen) {

		int[] intA = new int[10];
		//숫자형 배열은 배열을 초기화하면 각 개별값이 0으로 생성
		String[] strA = new String[10];
		//문자형 배열은 배열을 초기화하면 각 개별값이 ""으로 생성

		
		Student[]stdScore = new Student[stdLen];
		
		stdScore[0] = new Student ();
		
		Random rnd = new Random();
		for(int i = 0; i < stdScore.length; i++) {
			stdScore[i] = new Student();
			
			stdScore[i].intNum = i +1 ;
			stdScore[i].intKor  = rnd.nextInt(50) + 51;
			stdScore[i].intEng  = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
		}
		return stdScore;
	}//makeScore끝나는 부분
		public void viewScore(Student[] stdScore) {

			
			System.out.println("===========================================================");
			System.out.println("학번\t국어\t영어\t수학\t총점\t평균");
			System.out.println("-----------------------------------------------------------");
			for(int i = 0 ; i < stdScore.length; i++) {
				
				int intSum = stdScore[i].intKor;
				intSum += stdScore[i].intEng;
				intSum += stdScore[i].intMath;
				
				intSum = stdScore[i].intKor + stdScore[i].intEng + stdScore[i].intMath;
				
				float fAvg = intSum / 3.0f;
				
				
				System.out.print(stdScore[i].intNum + "\t" );  //학번
				
				System.out.print(stdScore[i].intKor + "\t" );  //국어
				System.out.print(stdScore[i].intEng + "\t" );  //영어
				System.out.print(stdScore[i].intMath + "\t" ); //수학

				System.out.print(intSum + "\t" );     //총점                       
				System.out.print(fAvg + "\t" );       //평균
				System.out.println();
			
			}

		}
	}


