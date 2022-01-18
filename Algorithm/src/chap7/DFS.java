package chap7;

public class DFS {
	public void DFS(int n){
		if(n==0) return;
		else{
			DFS(n-1);
			System.out.print(n+" ");
		}
	}

	public void solution(int n){
		DFS(n);
	}
	public static void main(String[] args){
		DFS T = new DFS();
		T.solution(3);
		//System.out.println(T.solution(3));
	}	
}
