package chap1;

import java.util.Scanner;

public class ChangeUpperCase {
	
	public String solution(String str) {
		
		String answer="";
		
		for(char x : str.toCharArray()) {
			
			//x가 소문자인지 대문자인지 판별
			
			//(1) x가 소문자인가요? 소문자면 참, 아니면 false
			if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
			else answer += Character.toLowerCase(x);
		}
		
		//ASCII 버전 : 대문자는 65~90, 소문자는 97~122 *같은 알파벳간 대소문자 차이는 32*
		for(char x : str.toCharArray()) {
			
			//Char 타입이지만 정수 변환 자동
			
			//(1) 대문자 판별 if(x>=65 && x<= 90)
			//(2) 소문자 판별								대문자로 변환
			if(x>=97 && x<=122) answer +=(char)(x-32);
			else answer +=(char)(x+32);
			
		}
		
		return answer;
	}
	
	

	public static void main(String[] args) {
		
		ChangeUpperCase cc = new ChangeUpperCase();
		
		Scanner in=new Scanner(System.in);
		    
		//입력 문자열 가져오기
		String str = in.next();
		    
		System.out.println(cc.solution(str));
	}

}
