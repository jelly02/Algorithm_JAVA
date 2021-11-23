package chap1;

import java.util.Scanner;

public class RemoveDeduplication {
	
	public String solution(String str){
		
		String answer="";
		
		for(int i=0; i<str.length(); i++){
			//System.out.println(str.charAt(i)+" "+i+" "+str.indexOf(str.charAt(i)));
			if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		}
		
		return answer;
	}

	public static void main(String[] args){
		
		RemoveDeduplication rd = new RemoveDeduplication();
		
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.print(rd.solution(str));
	}

}
