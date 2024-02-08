package myProject23;
import java.util.Scanner;

public class FindingHarmonicSeries {
	public static void main(String[]args) {
		int number;
		double total=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Please enter a number:");
		number=input.nextInt();
		for(int i=1;i<=number;i++) {
			total+=1.0/i;
			
			}
		System.out.println("Harmonic series of number you entered:"+total);
		
		
	}

}
