import java.util.*;
public class EvenAndOdd {
	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int n = obj.nextInt(); 
		int rem;
		int even =0, odd=0;
		int even_sum =0, odd_sum=0;
		while(n != 0) // 
		{		
			rem = n%10;
			if(rem%2 ==0)
			{
				even++;
				even_sum = even_sum + rem;
			}
			else
			{			
				odd++;
				odd_sum = odd_sum +rem;
			}
			n = n/10; 			
		}
System.out.println("Even Digits  = "+even);
System.out.println("Even sum  = "+even_sum);
System.out.println("Odd Digits  = "+odd);
System.out.println("odd sum  = "+odd_sum);
	} }