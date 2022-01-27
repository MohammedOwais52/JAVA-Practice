package thread;

public class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 

    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("Exception"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("Custom"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}
 