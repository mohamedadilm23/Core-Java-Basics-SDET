package day3;

public class Terniaryoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//var=exp? result1:result2;
		
		//case:1
		int a=1000,b=2000;
		int x= (a<b)? a:b;
		System.out.println(x);
		
		//case:2
		int v=(1==2)?200:300;
		System.out.println(v);
		
		int y=(1==1)?200:300;
		System.out.println(y);
		
		//case:3
		int voteage=17;
		String result=(voteage>=18)? "Eligble vote adil":"Not eligble vote Adil your age below 18";
		System.out.println(result);
		
	}

}
