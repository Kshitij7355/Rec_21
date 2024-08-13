package Rec_21;

public class Find_all_Permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		String ques="abc";
		String ans="";
		Permutation(ques,ans);

	}

	public static void Permutation( String ques, String ans) {
		if(ques.length()==0) {
			System.out.print(ans+" ");
			return;
					
		}
		for (int i = 0; i < ques.length(); i++) {
			char ch = ques.charAt(i);
			String s1 = ques.substring(0,i);
			String s2=ques.substring(i+1);
			Permutation(s1+s2,ans+ch);
			
			
		}

		
	}

}
