/**
 * 1차원의 점들이 주어졌을 때, 그 중 가장 거리가 짧은 것의 쌍을 출력하는 함수를 작성하시오. (단 점들의 배열은 모두 정렬되어있다고 가정한다.)
 * 예를들어 S={1, 3, 4, 8, 13, 17, 20} 이 주어졌다면, 결과값은 (3, 4)가 될 것이다
 */
package com.rest.exam;

public class ShortestLine {

	public static void main(String[] args) {
		int[] s={1, 3, 4, 8, 13, 17, 20};
        System.out.println(ShortestLine(s));
	}
	
	private static String ShortestLine(int[] input) {
        int val = 0;
        String result = null;
        for(int i=0;i<input.length-1;i++){
            int tempVal = input[i+1] - input[i]; 
            if(result != null){
                if(tempVal < val){
                	val = tempVal; 
                    result = "(" + input[i] + "," + input[i+1] +")";
                }
            }else{
            	val = tempVal; 
                result = "(" + input[i] + "," + input[i+1] +")";
            }
        }
        return result;
    }
}
