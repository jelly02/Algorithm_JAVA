package chap2;

import java.util.Scanner;

public class SeeStudent {

	public int solution(int n, int[] arr){
		
		int answer=1, max=arr[0];
		
		for(int i=1; i<n; i++){
			if(arr[i]>max){
				max=arr[i];
				answer++;
			}
		}
		
		return answer;
	}
	public static void main(String[] args){
		
		SeeStudent ss = new SeeStudent();
		
		Scanner kb = new Scanner(System.in);
		
		int n=kb.nextInt();
		
		int[] arr=new int[n];
		
		for(int i=0; i<n; i++){
			arr[i]=kb.nextInt();
		}
		
		System.out.print(ss.solution(n, arr));
	}
}
