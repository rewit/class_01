package com.biz.exec;

import java.util.Random;

import com.biz.model.Student;

public class Exec_04 {

	public static void main(String[] args) {

		Student[]stdScore = new Student[10];
		//Student 클래스 객체 배열 10개를 예약하라
		//아직 예약만 되어있고 
		//사용할 준비가 되지 않은 상태
		stdScore[0] = new Student ();
		//객체 배열은 사용(읽기,쓰기) 전에 
		//각 배열 요소를 개별적으로 초기화하는 코드가 수행되어야 한다
		
		Random rnd = new Random();
		//가상의 성적을 만들기 위해 난수발생기를 사용
		for(int i = 0; i < stdScore.length; i++) {
			stdScore[i] = new Student();
			//for 반복문을 사용하여 같은 코드를 10번 수행
			
			stdScore[i].intNum = i +1 ;
			stdScore[i].intKor  = rnd.nextInt(50) + 51;
			stdScore[i].intEng  = rnd.nextInt(50) + 51;
			stdScore[i].intMath = rnd.nextInt(50) + 51;
			
		}
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


