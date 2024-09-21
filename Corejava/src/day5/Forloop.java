package day5;

import java.util.Iterator;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*for (int i = 0; i<=10; i++) {
			System.out.println(i);

		}*/
		
		
		
		//even numbers
		/*for (int i =10; i<=100; i+=2) {
			System.out.println(i);
			
		}*/
		
		
		for (int i =0; i<=200; i++) 
		{
			if (i%2==0) {
			System.out.println(i  +"even number");	
			} else {
          System.out.println(i   +"odd number");
			}
		}
	}

}
