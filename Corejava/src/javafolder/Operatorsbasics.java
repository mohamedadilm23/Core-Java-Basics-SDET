package javafolder;

public class Operatorsbasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//Arithmetic operators +,-,*,/,%	
		
     int a=5,b=10;
     //model1
     int publish=a+b;
     System.out.println("the sum of add a and b value:"+publish);
     
     //model2
     System.out.println("the sum of add a and b value:"+(a+b));
     System.out.println("the subraction of a and b value:"+(a-b));
     System.out.println("the multiplication of a and b value:"+(a*b));
     System.out.println("the division of a and b value:"+(a/b)); //quotient value taken
     System.out.println("the moduls of a and b value:"+(a%b));//remainder value taken
     
     
     //relational/comparison operators > >= < <= !=	==
     //return boolean value-true/false
     //a=5,b=10
     a=100;
     System.out.println(a>b);//true
     System.out.println(a<b);//false
     System.out.println(a>=b);//true
     System.out.println(a<=b);//false
     System.out.println(a!=b);//true
     System.out.println(a==b);//False
     
    boolean res=a>b;
    System.out.println(res);
    
    //3. logical operators && || !
    //return boolean value=true/false
    //works between 2 boolean values
    boolean x=true;
    boolean  y=false;
     System.out.println(x&&y); //false
     System.out.println(x||y);//true
     System.out.println(!y);//true
     System.out.println(!x);//false
    
     System.out.println((70>80)&&(80<70));//f,t
     
	}

}
