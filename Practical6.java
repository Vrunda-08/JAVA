import java.util.Scanner;

class Practical6 
{
    	public static void main(String[] args) 
	{

        	Scanner sc = new Scanner(System.in);

        	System.out.print("Enter a five-digit number: ");
        	int num = sc.nextInt();
        	int originalNum = num;

        	int result = 0;
        	int place = 1; 

        	for (int i = 0; i < 5; i++) 
		{
            		int digit = num % 10;  // Get last digit
            		digit = (digit + 1) % 10; // Add 1, if 10 becomes 0
            		result = digit * place + result; // Build new number
            		place *= 10; // Move to next place
            		num = num / 10; // Remove last digit
        	}

        	System.out.println("Original number: " + originalNum);
        	System.out.println("New number: " + result);

        	sc.close();
    	}
}