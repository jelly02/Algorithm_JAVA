package chap1;

import java.util.Scanner;

public class StringInWord {

	public String solution(String str) {
		
		String answer="";
		
		//가장 작은 값으로 초기화 
		int m = Integer.MIN_VALUE;
		
		//띄어쓰기를 기준으로 배열 변환
		String[] s = str.split(" ");
		
		for(String x : s) {
			
			//각각의 단어 길이가 len에 들어감
			int len = x.length();
			
			//글자 수가 최소값보다 클 경우
			if(len>m) {
				m = len;
				//글자수가 제일 긴 단어로 대입
				answer = x;
			}
		}
			
		return answer;
	}
	
	//index, subString()으로 풀기	
	public String solution2(String str) {
		
		String answer="";
		int m = Integer.MIN_VALUE, pos;
		
		//띄어쓰기가 있는 위치(index)를 리턴
		// 									> 띄어쓰기를 발견 못하면 -1 리턴
		while((pos=str.indexOf(' '))!=-1){
			
												//0부터 pos까지 자르기
			String tmp=str.substring(0, pos);
			
			int len=tmp.length();
			if(len>m){
				m=len;
				answer=tmp;
			}
			str=str.substring(pos+1);
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		
		StringInWord sw = new StringInWord();
		Scanner in=new Scanner(System.in);
		    
		//입력 문자열 한 줄 가져오기
		String str = in.nextLine();
		    
		System.out.println(sw.solution(str));
	}

	
}
