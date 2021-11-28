package chap1;

import java.util.Scanner;

public class EffectivePalindrome {
	
	public String solution(String s){
		
		String answer="NO";
		
		s=s.toUpperCase().replaceAll("[^A-Z]", "");
		
		String tmp=new StringBuilder(s).reverse().toString();
		
		if(s.equals(tmp)) answer="YES";
		
		return answer;
	}

	public static void main(String[] args){
		
		EffectivePalindrome ep = new EffectivePalindrome();
		
		Scanner kb = new Scanner(System.in);
		
		String str=kb.nextLine();
		
		System.out.print(ep.solution(str));
	}

}
