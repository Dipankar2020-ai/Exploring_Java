//-inside switch the case labelsmust be within the range of provided argumentdata typeotherwise compiler will raise compilation error  “possible loss of precision”


public class Main
{
	public static void main(String[] args) {
		byte b=125;
		switch(b)
		{
		    case 125:System.out.println("10");
		    case 126: System.out.println("20");
		     case 127: System.out.println("30");
		     case 128: System.out.println("40");
		}
		
	    
	}
}
