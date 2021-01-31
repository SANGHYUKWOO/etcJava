package com.rest.exam;

public class ConvertStringUtil {
	public static void main(String args[]){
    
        String text = "1	2";       

        System.out.println("text1   >"+convertTabToSpace4(text));
        System.out.println("text2   >"+convertSpace4ToTab(convertTabToSpace4(text)));
    }
	
	/*
	 * A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
	 * A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
	 */
	private static String convertTabToSpace4(String text) {
		String rtnText="";
		
		rtnText = text.replaceAll("\t", "    "); 
		
		return rtnText;
	}
	
	/*
	 * A씨는 개발된 소스코드를 특정업체에 납품하려고 한다. 개발된 소스코드들은 탭으로 들여쓰기가 된것, 공백으로 들여쓰기가 된 것들이 섞여 있다고 한다. A씨는 탭으로 들여쓰기가 된 모든 소스를 공백 4개로 수정한 후 납품할 예정이다.
	 * A씨를 도와줄 수 있도록 소스코드내에 사용된 탭(Tab) 문자를 공백 4개(4 space)로 바꾸어 주는 프로그램을 작성하시오.
	 * 반대로 4개의 스페이스를 탭으로 바꾸는 프로그램을 작성 하시요
	 */
	private static String convertSpace4ToTab(String text) {
		String rtnText="";
		
		rtnText = text.replaceAll( "    " , "\t"); 
		
		return rtnText;
	}

}
