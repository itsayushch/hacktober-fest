class Hello 
{ 
    void display()
    {
    	System.out.println("Hello World");
    }
} 

public class ArrayOfObject 
{ 
    public static void main (String[] args) 
    {  
        Hello[] arr = new Hello[5];  
        for (int i = 0; i < arr.length; i++) {
        	arr[i].display();
        }
             
    } 
} 
