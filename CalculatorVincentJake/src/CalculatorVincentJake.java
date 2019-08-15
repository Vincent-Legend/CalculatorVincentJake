import java.io*;

public class CalculatorVincentJake {
    
    public static void main(String[] args) throws Exception{
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int x;
        int y;
        String Operation;
        
        System.out.println("Input your first number");
        x = Integer.parseInt(br.readLine());
        
        System.out.println("Input your second number");
        y = Integer.parseInt(br.readLine()); 
        	
        System.out.println("Choose your operation: + - * /: ");
        Operation = (br.readLine());
        
        if (Operation.equals("+"))
        {
        	System.out.println("First Number + Second Number is = " +(x+y));
        }
        
        if (Operation.equals("-"))     
        {
        	System.out.println("First Number + Second Number is = " +(x-y));
        }
    	
    	if (Operation.equals("*"))
    	{
    		System.out.println("First Number * Second Number is = " +(x*y));
    	}	
        
        if (Operation.equals("/"))
        {
        	System.out.println("First Number / Second Number is = " +(x/y));
        }	   
}