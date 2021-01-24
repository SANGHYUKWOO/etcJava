/**
 * 인풋을 정수 n으로 받았을때, n 이하까지의 피보나치 수열을 출력
 */
package com.rest.exam;

import java.util.Scanner;

public class FibonacciSequence {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);

        System.out.print("피보나치 수열을 구할 정수 N을 입력하세요: ");
        
        int n = scanner.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print(fibonacci(i) + " ");
        }
    }
    
    public static int fibonacci(int i){
        if(i <= 1){
            return i;
        }else{
            return fibonacci(i-2) + fibonacci(i-1);
        }
    }

}
