package com.biz.exec;

public class Exec_03 {

	public static void main(String[] args) {

		int[] intNum = new int[10];
		String[] strName = new String[10];
		
		int[] intKor  = new int[10];
		int[] intEng  = new int[10];
		int[] intMath = new int[10];

		intNum[0] = 1;
		strName[0] = "홍길동";
		
		intKor[0]  = 90;
		intEng[0]  = 70;
		intMath[0] = 70;

		intNum[1] = 2;
		strName[1] = "이몽룡";
		
		intKor[1]  = 80;
		intEng[1]  = 80;
		intMath[1] = 90;
		
		intNum[2] = 3;
		strName[2] = "성춘향";
		
		intKor[2]  = 77;
		intEng[2]  = 88;
		intMath[2] = 98;
		
		intNum[3] = 4;
		strName[3] = "임꺽정";
		
		intKor[3]  = 90;
		intEng[3]  = 70;                
		intMath[3] = 70;

		
		System.out.println("===========================================================");
		System.out.println("학번\t이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------------------------");
		for(int i = 0 ; i < 3; i++) {
			
			int intSum = intKor[i];
			intSum += intEng[i];
			intSum += intMath[i];
			
			intSum = intKor[i] + intEng[i] + intMath[i];
			
			float fAvg = intSum / 3.0f;
			
			
			System.out.print(intNum[i] + "\t" );  //학번
			System.out.print(strName[i] + "\t" ); //이름
			System.out.print(intKor[i] + "\t" );  //국어
			System.out.print(intEng[i] + "\t" );  //영어
			System.out.print(intMath[i] + "\t" ); //수학
			System.out.print(intSum + "\t" );     //총점                       
			System.out.print(fAvg + "\t" );       //평균
			System.out.println();
		}
		System.out.println("===========================================================");

		
	}

}
