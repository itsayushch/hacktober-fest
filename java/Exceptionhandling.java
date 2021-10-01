class illegalNumberOfArguments extends Exception
{
    public String toString()
    {
        return "No of argument are less than three.";
    }
}
class InvalidOperatorException extends Exception
{
    public String toString()
    {
        return "Operator is not an airthematic operator.";
    }
}

class NegativeResultException extends Exception
{
    public String toString()
    {
        return "Result is Negative.";
    }
}

public class ExceptionHandling
{
    public static void main(String[] args) 
    {
        // write in command line in the format of operand1 operand2 operator
		System.out.println("Rakhi jha CSE 3B 1105");
        try
        {
            if(args.length<3)
            {
                throw new illegalNumberOfArguments();
            }
        }
        catch(illegalNumberOfArguments e)
        {
            System.out.println(e);
        }
		    double a=Double.valueOf(args[0]);
            double b=Double.valueOf(args[1]);
            double d;
        try
        {
            
            if(!(args[2].equals("+") || args[2].equals("-") || args[2].equals("*") || args[2].equals("/")|| args[2].equals("%")))
            {
                throw new InvalidOperatorException();
            }
        }

        catch(InvalidOperatorException e)
        {
            System.out.println(e);
        }
        try
        {


            switch(args[2])
            {
                case"+" :
                {
                    d=a+b;
                    System.out.println("Result after Addition is : " +d);
                    if(d <0)
                    {
                        throw new NegativeResultException();
                    }
                    break;
                }
                case"-" :
                {
                    d=a-b;
                    System.out.println("Result after Subtraction is : " +d);
                    if(d <0)
                    {
                        throw new NegativeResultException();
                    }
                    break;
                }
                case"*" :
                {
                    d=a*b;
                    System.out.println("Result after Multiplication is : "+d);
                    if(d <0)
                    {
                        throw new NegativeResultException();
                    }
                    break;
                }
                case"/" :
                {
                    d=a/b;
                    if(d <0)
                    {
                        throw new NegativeResultException();
                    }
                    System.out.println("Result after Division is : "+d);
                    break;
                }
                case"%" :
                {
                    d=a%b;
                    if(d <0)
                    {
                        throw new NegativeResultException();
                    }
                    System.out.println("Result after Remainder is : "+d);
                    break;
                }
            }


        } catch(NegativeResultException e)
       {
        System.out.println(e);
       }
    }	
}
	
