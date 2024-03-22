package baekjoon;
import java.util.Arrays;
import java.util.Scanner;

public class no2693 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int caseNo = scanner.nextInt();			//케이스의 개수 입력받기
		int intArray[][] = new int[caseNo][10];		//입력된 10개의 숫자들을 저장할 배열 생성

		//입력한 숫자들을 배열에 저장
		for (int i=0; i<caseNo; i++) {
			for (int n=0; n<10; n++) {
				intArray[i][n] = scanner.nextInt();
			}
		}

		//Arrays.sort()로 배열의 숫자들을 오름차순으로 정렬
		for (int i=0; i<caseNo; i++) {
			Arrays.sort(intArray[i]);
		}

		//반복문으로 8번째 숫자(3번째로 큰 값)를 출력
		for (int i=0; i<caseNo; i++) {
			System.out.print(intArray[i][7] + "\n");
		}
	}

}

/*
N번째 큰 수
https://www.acmicpc.net/problem/2693
배열 A가 주어졌을 때, N번째 큰 값을 출력하는 프로그램을 작성하시오.
배열 A의 크기는 항상 10이고, 자연수만 가지고 있다. N은 항상 3이다.
*/
