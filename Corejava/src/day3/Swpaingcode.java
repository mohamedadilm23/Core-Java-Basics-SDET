package day3;

public class Swpaingcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		        int a = 10;
		        int b = 20;
		        int c = 30;

		        // Print initial values
		        System.out.println("Before swapping: a = " + a + ", b = " + b + ", c = " + c);

		        // Swap values
		        a = a + b + c; // a now becomes 60
		        b = a - (b + c); // b becomes 10 (original value of a)
		        c = a - (b + c); // c becomes 20 (original value of b)
		        a = a - (b + c); // a becomes 30 (original value of c)

		        // Print swapped values
		        System.out.println("After swapping: a = " + a + ", b = " + b + ", c = " + c);
		    }
		

		
	}

