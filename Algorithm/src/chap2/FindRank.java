package chap2;

import java.util.Scanner;

public class FindRank {
	
	public int[] solution(int n, int[] arr){
		
		int[] answer = new int[n];
		
		for(int i=0; i<n; i++){
			int cnt=1;
			for(int j=0; j<arr.length; j++){
				if(arr[j]>arr[i]) cnt++;
			}
			
			answer[i]=cnt;
		}
		
		return answer;
	}
	
	public static void main(String[] args){
		
		FindRank fr = new FindRank();
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		
		for(int x :fr.solution(n, arr)) System.out.print(x+" ");
	}

}
