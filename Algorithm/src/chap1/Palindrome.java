package chap1;

import java.util.Scanner;

public class Palindrome {

	public String solution(String str){
		String answer="YES";
		
		str=str.toUpperCase();
		
		int len=str.length();
		
		for(int i=0; i<len/2; i++){
			if(str.charAt(i)!=str.charAt(len-i-1)) answer="NO";
		}
		return answer;
	}

	public static void main(String[] args){
		
		Palindrome pd = new Palindrome();
		
		Scanner kb = new Scanner(System.in);
		
		String str=kb.next();
		
		System.out.print(pd.solution(str));
	}
}
