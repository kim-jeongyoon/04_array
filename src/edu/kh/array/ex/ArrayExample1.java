package edu.kh.array.ex;

import java.util.Arrays;
import java.util.Scanner;
public class ArrayExample1 {
	
	/* 배열(Array)
	 * 같은 자료형의 변수를 하나의 묶음으로 다루는 것. (자료구조)
	 * 묶여진 변수들은 하나의 배열명으로 불려짐
	 * (index는 0부터 시작하는 정수)
	 */

	//(복습O)
	public void ex1() {
		//변수 vs 배열
		
		//1-1. 변수 선언
		int num;
		//stack 영역에 int 자료형을 저장할 수 있는 공간 4byte를 생성(할당)하고
		//그 공간에 num이라는 이름을 부여
		
		//1-2 변수 대입
		num = 10; 
		//생성된 num이라는 변수 공간에 10을 대입
		
		//1-3. 변수 사용 
		System.out.println("num에 저장된 값 : " + num);
		//num 에 작성된 자리에 num에 저정된 값을 읽어와서 출력
		
		//2-1. 배열 선언
		int [] arr;
		// stack 영역에 int[] (int 배열) 자료형 공간을 4byte 할당하고
		// 그 공간에 arr 이라는 이름을 부여
		//*** 해당 변수는 참조형으로 주소 값(4byte) 만을 저장할 수 있음.
		
		//2-2. 배열 할당
		arr = new int[3]; 
		//new : "new 연산자" 라고 하며, Heap 메모리 영역에 새로운 공간(배열, 객체)을 할당
		//int[3] : int 자료형 변수 3개를  하나의 묶음으로 나타냄
		//new int[3]: Heap 영역에 int 3칸 짜리 int[]를 생성(할당)
		//**생성된 int[]에는 시작주소가 지정된다!!!**
		
		//2-3. 배열 요소 값 대입
		// arr은 int[ ] 참조형 변수이지만
		// arr[0] ~[2] int 자료형 변수이기 때문에 정수 값을 대입할 수 있다.
		
		arr[0] = 10;
		arr[1] = 50;
		arr[2] = 1000;
		
		//2-4. 배열 요서 값 읽어오기
		
		System.out.println(arr); 
		System.out.println(arr [0]); 
		System.out.println(arr [1]); 
		System.out.println(arr [2]); 
		
		
		
		
		
	
	
	}

	//(복습O)
	public void ex2() {
		//배열 선언 및 할당
		int[] arr = new int[4];
		// 1) stack 영역에 int[] 자료형 참조형 변수 arr 선언
		// 2) heap 영역에 int 자료형 4개묶음으로 다루는 int[] 할당
		// 3) 생성된 int[]의 주소를 arr에 대입하여 참조하는 형태를 만듬
		
		// 배열 길이(몇 칸 인가?) : 배열명.length
		System.out.println("배열 길이 : " + arr.length); // 4칸 
		
		arr[0] = 100;
		arr[1] = 300;
		arr[2] = 500;
		arr[3] = 1000;
		
		for(int i = 0; i < arr.length; i++) {
			// 0 1 2 3
			
			System.out.printf("arr[%d]에 저장된 값 : %d\n", i, arr[i]);
			
		}
	}

	//(복습O)
	public void ex3() {
		// 5명의 키(cm)를 입력 받고 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 184.3
		// 4번 키 입력 : 190.2
		// 5번 키 입력 : 174.4
		
		//입력 받은 키 : 170.5 165.7 184.3 190.2 174.4
		//평균 : 177.02cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] height = new double[5];
		
		for(int i =0; i < height.length; i++) {
			System.out.print((i + 1) + "번 키 입력 : ");
			height [i] = sc.nextDouble(); // 각 인덱스에 입력받은 값을 대입(초기화)
		}
		
		System.out.println();// 줄바꿈
		
		double sum = 0;
		
		for(int i = 0; i <height.length; i++) {
			
			System.out.print(height[i] + " ");
			
			sum += height[i];
		}
		
		System.out.printf("\n평균 : %.2f\n", sum / height.length); 
		// %d 는 정수형 , %f 실수형
	
	}
	
	public void ex4() { 
		//입력 받은 인원 수 만큼의 정수를 입력 받아 배열에 저장
		//입력이 완료되면 정수 합계, 평균, 최고점, 최저점 출력
		
		//ex
		//입력 받을 인원 수 :4 
		//1번 점수 입력 : 100
		//2번 점수 입력 : 80
		//3번 점수 입력 : 50
		//4번 점수 입력 : 60
		
		//합계 : 290
		//평균 : 72.5
		//최고점: 100
		//최저점: 50
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 인원 수 : ");
		int people = sc.nextInt();
		
		int[] score = new int[people];
		double sum = 0;
		
		for(int i =0; i < score.length; i++) {
			System.out.print((i + 1) + "번 점수 입력 : ");			
			score [i] = sc.nextInt(); 
	
			sum += score[i];
		}
		
		int max = score[0];
		int min = score[0];

		for(int i = 0; i < score.length; i++) {
			if(max < score[i]) {
				max = score[i];
			} else if (min > score[i]) {
				min = score[i];
			}
		}
		
		System.out.printf("\n합계 : %.2f", sum); 
		System.out.printf("\n평균 : %.2f\n", sum / score.length);
		System.out.println("최고점 : " + max); 
		System.out.println("최저점 : " + min);
	}

	public void ex5() {
		
		char[] arr = new char[5];
		
		//char[] arr이 참조하는 배열 요소에 A, B, C, D, E 대입하기 65
		
		for(int i = 0; i < arr.length; i++ ) {
			
			arr[i] = (char)('A' + i);
			// A == 65	
			
		}
		//** Arrays 클래스 --> Java에서 제공하는 배열과 관련된 기능을 모아둔 클래스
		// Arrays.toString(배열명) : 모든 요소 값 출력
		int[] arr2 = new int[4];
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0,] int 기본값
		
		// 배열 선언과 동시에 초기화
		char[] arr3 = {'A', 'B', 'C', 'D', 'E'};
		
		// char[] 참조 변수 arr3를 선언하고
		// heap영역에 char 5칸 짜리 char[]을 생성하고 
		// 각각 'A' 'B' 'C' 'D' 'E' 로 초기화 후 주소를 arr3에 대입
		
		System.out.println(Arrays.toString(arr3));
		
	}
	
	//다시
	public void ex6() {
		//배열을 이용한 검색 
		//입력받은 정수가 배열에 있는지 없는지 확인
		//만약 있다면 몇 번 인덱스에 존재하는지 출력
		
		int[] arr = {100,200,300,400,500,600,700,800,900,1000};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		int input = sc.nextInt();
		
		//신호를 나타내기 위한 변수
		//flag == false : 일치하는 값이 존재하지 않음
		//flag== true : 일치하는 값이 있음
		
		boolean flag = false; //검사 전에는 없다고 가정
		
		//arr 배열 요소 순차 접근
		for(int i = 0; i > arr.length; i++) {
			if(arr[i] == input) {
				
				System.out.println(i + "번째 인덱스에 존재");
				
				flag = true;// 일치하는 값이 있으므로  true로 변경
			}
		
	
		}
	
		//flag 상태를 검사
		if(!flag) {
			System.out.println("존재하지 않음");

		}
		
	}
	
	public void ex7() {
		//입력 받은 값과 일치 값이 있으면 인덱스 번호 출력
		//없으면 "존재하지 않음"
		String[] arr = {"사과", "딸기", "바나나","키위", "멜론", "아보카도"}; 
		//equals() ==> 배열명[i].equals(비교할 값)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("과일 입력: ");
		String input = sc.next();
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i].equals(input)) {
				System.out.println(i + "번 인덱스에 존재");
				
				flag = true;
			}
			
		}
		
	}

	public void ex8() {
		//문자열을 입력 받아 한 글자씩 잘라내어 char 배열에 순서대로 저장
		//문자 하나를 입력 받아 일치하는 문자가 char 배열에 몇개 존재하는지 확인 
		//단, 일치하는 문자가 없을 경우 "존재하지 않습니다." 출력
		
		//[사용 해야되는 기술, 기능]
		//배열검색
		//String.length() : 문자열의 길이
		//String.charAt(index) : 문자열에서 특정 index에 위치한 문자 하나를 열어옴
		// ex) "hello".charAt(1) --> 'e'
		//      01234
		//count 숫자세기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String input = sc.nextLine();
		
		char [] arr = new char[input.length()]; //공간생성
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = input.charAt(i);
			
		}
		// 중간확인과정
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("검색할 문자 입력 : ");
		char ch = sc.nextLine().charAt(0); // 문자 하나를 넣었으니 무조건 heap영역에 하나만 생성
										//무조건 charAt(0) 일 수 밖에 없음
		
		int count = 0; // 같은 글자 개수 셈하기 위한 변수
		
		for(int i = 0; i < arr.length; i++) {
			
			if(arr[i] == ch) {
				count++;		
			}
		}
		
		if(count > 0) {
			System.out.println(count + "개 있음");
		} else {
			System.out.println("존재하지 않음");
		}
	}	
}
