import java.util.Scanner;
public class Bintodec {

	public static void main(String[] args) {
		int num;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "Enter the binary number? :" );
		 num = keyboard.nextInt();
		 
		 int sum=0;
		 int power=1;
		 int decimal=0;
		 while(num>0){
			 decimal +=(num%10)*power;
			 num =num/10;
			 power =power*2;
		 }
		 System.out.print( "The decimal number? :" +decimal);
		 
		 }
	}


