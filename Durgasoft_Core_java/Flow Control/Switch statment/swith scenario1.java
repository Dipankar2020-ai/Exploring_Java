//inside the switch the case label must match with provided argument data type otherwise compiler will raise compilation error  “incompatibletypes”.
public class Main
{
	public static void main(String[] args)
	{
  char ch='a';
	switch (ch)
	{
    case "aaa":System.out.println("samantha");
	     break;
	   case   65:
	    System.out.println("anu");
	    break;
	   case 'a':System.out.println("ubanu");
	    break;
	   default:System.out.println("default");
	    break;
	    
	}
	    
	}

}
