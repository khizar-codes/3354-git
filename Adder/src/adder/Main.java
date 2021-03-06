package adder;

public class Main 
{

    public static void main(String[] args) 
    {
        try 
        {
            int result = addArguments(args);
            System.out.println(result);
        } 
        catch (Exception e) 
        {
        	if (!args[0].matches("^[0-9]+$"))
        	{
        		System.err.println("Invalid Character");
        	}
        	else
        	{
        		System.err.println("Not enough arguments");
        	}
        
        }
    }

    private static int addArguments(String[] args) 
    {
    	int total = 0;
    	
    	if(args[0].contains("-"))
    	{
    		for(int i = 1; i < args.length; i++)
        	{
        		total = total + Integer.valueOf(args[i]);
        	}
    		
    		total = (total * -1);
    	}
    	else
    	{
    		for(int i = 0; i < args.length; i++)
        	{
        		total = total + Integer.valueOf(args[i]);
        	}
    	}
        
    	return total;
    }
}
