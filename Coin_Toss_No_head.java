package Rec_21;

public class Coin_Toss_No_head {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		String ans="";
		Toss(n,ans);

	}
	public static void Toss(int n, String ans) {
		if(n==0) {
			System.out.print(ans+" ");
			return;
		}
		if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') {
			Toss(n-1,ans+'H');
		}
		Toss(n-1,ans+'T');
	}

}
