package day3;

public class Airthmeticoperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//case:1
		int a=100;
		a=a+1;
		System.out.println("the sum of a value is:"+a);
		//case2:
		int b=200;
			b++;
		System.out.println(b);

		//case:3
		int c=5000;
		int res=c++;//post increment
		System.out.println(res);
		System.out.println(c);

		//case:4
		int d=500;
		int solutions=++d;//preincrement
		System.out.println(solutions);

//decrement operator
		//case:1
		int e=300; //post increment
		int digi=e--;
		System.out.println(digi);
		System.out.println(e);
		
		
		int g=900; //post increment
		int digisystem=--g;
		System.out.println(digisystem);
	}

}
