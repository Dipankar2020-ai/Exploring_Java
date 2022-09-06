public class Main
{
    
	
	    
	    public static void main(String[] args)
	    {   int i=0;
	        for (foo('A');foo('B')&&(i<2);foo('C'))
	        {
	            i++;foo('D');
	        
	        }
	        
	      }
	    
	
	static boolean foo(char ch)
	    {System.out.println(ch);
	    return true;
	        
	    }
		
	    
	
}
/* output
A
B
D
C
B
D
C
B 
*/
