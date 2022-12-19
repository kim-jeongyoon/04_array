package edu.kh.array.practice.service;

import java.util.Scanner;
import java.util.Arrays;

public class PracticeService {

	public void practice1() {
		
		/*길이가 9인 배열을 선언 및 할당하고, 
		 1부터 9까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

			[실행 화면]
			1 2 3 4 5 6 7 8 9
			짝수 번째 인덱스 합 : 25
		 */
	
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+ " ");	
			
			if(i%2 == 0) {
				sum += arr[i];		
			}		
		}
		
		System.out.print("\n짝수 번째 인덱스 합 : " + sum);
	
		//System.out.println(Arrays.toString(arr)); 배열확인용
		
	}
	
	public void practice2() {
		
		/*길이가 9인 배열을 선언 및 할당하고, 
		 9부터 1까지의 값을 반복문을 이용하여 순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		 홀수번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)

			[실행 화면]
			9 8 7 6 5 4 3 2 1
			홀수 번째 인덱스 합 : 20
		 */
		
		int arr[] = new int[9];
		
		int sum = 0;
		
		for(int i = 8; i >=0; i--) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+ " ");	
			
			if(i%2 == 1) {
				sum += arr[i];		
			}		
		}
		
		System.out.print("\n홀수 번째 인덱스 합 : " + sum);

		//System.out.println(Arrays.toString(arr)); //배열확인용	
	}
	
	public void practice3() {
		/*사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.

			[실행 화면]
			양의 정수 : 5
			1 2 3 4 5
		
		 */
	
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = i+1;
			
			System.out.print(arr[i]+ " ");	
		}
			
		
	}

	public void practice4() {
		/*정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 "일치하는 값이 존재하지 않습니다" 출력
		
		[실행 화면 1]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 8
		인덱스 : 1

		[실행 화면 2]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 1
		일치하는 값이 존재하지 않습니다.
				
*/
		
		Scanner sc = new Scanner(System.in);
		
		int arr[] = new int[5];
		
		for(int i =0; i < 5; i++) {
			
			System.out.print("입력" + i +" : ");
			int input = sc.nextInt();		
			arr[i] = input;
		}
		
		//System.out.println(Arrays.toString(arr)); 
		
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		boolean flag = false;
		for(int i = 0; i < arr.length; i++) {
			if(search == arr[i]) {
				System.out.println("인덱스 : " + i);
				
				flag = true;
			} 			
		}
		
		if(!flag) {
			System.out.println("존재하지 않음");
		}
			
	}

	public void practice5() {
		
		/* 문자열을 입력 받아 문자 하나하나를 배열에 넣고 검색할 문자가 문자열에 몇 개 들어가 있는지
		개수와 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.

		[실행 화면]
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8
		i 개수 : 2
		
		 */
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String input = sc.nextLine(); //(1) 문자열을 입력받음 
		
		// (2) 입력받은 문자 하나하나를 배열에 넣음
		char [] arr = new char[input.length()]; 
		
		for(int i = 0; i < arr.length; i++) {
			
			arr[i] = input.charAt(i);
			
		}
		// 중간확인과정
		//System.out.println(Arrays.toString(arr));
		
		System.out.print("문자 : ");
		char ch = sc.nextLine().charAt(0); // 문자 하나를 넣었으니 무조건 heap영역에 하나만 생성
									   	//무조건 charAt(0) 일 수 밖에 없음
		
		int count = 0; // 같은 글자 개수 셈하기 위한 변수
		
		System.out.print(input + "에 " + ch +"가 존재하는 위치(인덱스) : ");
		
		for(int i = 0; i < arr.length; i++) {
		
			if(arr[i] == ch) {
				count++;
				System.out.print(i + " ");
			}
			
		}
		
		if(count > 0) {
			System.out.println(ch + " 개수 :" + count);
		} else {
			System.out.println("일치하는 값이 없음");
		}
	}	

	public void practice6() {
		
		/*메소드 명 : public void practice6(){}
		
			사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
			배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
			그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.

		[실행 화면]
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2
		총 합 : 2
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int arr[] = new int[input];
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.print("배열" + i +"번째 인덱스에 넣을 값 : "
					+ "");
			arr[i] = sc.nextInt();
		}
		
		System.out.println(Arrays.toString(arr));
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			sum += arr[i];
		}
		
		System.out.print("총 합 : " + sum);
	
	}

	public void practice7() {
		
		/*주민등록번호 번호를 입력 받아 성별을 나타내는 숫자 이후부터 *로 가리고 출력하세요.

			[실행 화면]
			주민등록번호(-포함) : 123456-1234567
			123456-1****** 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주민등록번호(-포함) : ");
		String input = sc.nextLine();
		
		char [] arr = new char[input.length()]; 
		
		for(int i = 0; i < 8; i++) {
			
			arr[i] = input.charAt(i);
			System.out.print(arr[i]);
			
		}
			
		for(int i = 8; i < arr.length; i++) {
			
			System.out.print("*");
		
		}
	}
}
