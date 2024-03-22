package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class no2693 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caseNo = scanner.nextInt();					    //케이스의 개수 입력받기
		int intArray[][] = new int[caseNo][10];			//숫자들을 저장할 배열 생성

		for (int i=0; i<caseNo; i++) {					    //입력한 숫자들을 배열에 저장
			for (int n=0; n<10; n++) {
				intArray[i][n] = scanner.nextInt();
			}
		}
			
		for (int i=0; i<caseNo; i++) {					    //Arrays.sort()로 배열을 오름차순으로 정렬
			Arrays.sort(intArray[i]);
		}
		
		for (int i=0; i<caseNo; i++) {					    //반복문으로 8번째 숫자(3번째로 큰 값)를 출력
			System.out.print(intArray[i][7] + "\n");
		}
	}

}

//https://www.acmicpc.net/problem/2693
