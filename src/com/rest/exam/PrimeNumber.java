// 2이상 1000이하 자연수의 집합에서 소수의 개수를 구하는 알고리즘을 작성하시오.
package com.rest.exam;

public class PrimeNumber {
	public static void main(String[] args) {
        primeNumber1000();
    }

	public static void primeNumber1000() {
		int count;
        int allCount = 0;
        for (int i = 2; i <= 1000; i++) { 
            count = 0;
            for (int j = 2; j < i; j++) { // j는 나누는 수
                if (i % j == 0)  // 나머지가 0이란건 소수가 아니라는 것.
                    count++;  //count가 올라갔다는건 소수가 아니라는것.
            }
                if (count == 0)
                	//System.out.println(i+"는 소수 입니다.");
                    allCount++;
            }

        System.out.println("1000 이하 소수의 갯수 == "+allCount);
	}
}
