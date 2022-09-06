//Inside the switch statement break is optional. If we are not providing break statement at that situation fromthe matched case onwards up to break statement is executed if no break is available up to the end of the switch is executed. This situation is called as fall though inside the switch case.



public class Main
{
	public static void main(String[] args) {
      int a=10;
      switch(a)
      {
          case 10: System.out.println("10");
          case 20:System.out.println("20");
          
          case 30:System.out.println("30");
                  break;
          default:
              System.out.println("Deafault");
      }
   
	    
	}
}
