package java_8_featueres;

interface Vote{
	String checkVote(int x);
}

public class VoteCheckWithLamda {

	public static void main(String[] args) {
		
		Vote v=(x)->{if(x>=18)
		return "can vote";
		else
			return "can,t vote";};
			
			System.out.println(v.checkVote(14));
	}
}
