package Rec_21;

import java.util.*;
public class Generate_Parentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String> ll=new ArrayList<>();
		Parentheses(n,0,0,"",ll);
		
		System.out.print(ll);
		

	}

	public static void Parentheses(int n, int open, int close, String ans,List<String> ll) {
		if(open==n && close==n) {
			ll.add(ans);
			return;
		}
		// TODO Auto-generated method stub
		if(open<n) {
			Parentheses(n,open+1,close,ans+"(",ll);
		}
		if(close<open) {
			Parentheses(n,open,close+1,ans+")",ll);
		}
		
	}
	

}
