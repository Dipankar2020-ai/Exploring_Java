/*The class contains main method is called Mainclassand java 
allowes to declaremultiple main class  in a single source file*/

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
}
class Test1
{
    public static void main(String args[])
    {
        System.out.println("Hi Test1!");
    }
} 
class Test2
{
    public static void main(String args[])
    {
        System.out.println("Hi Test2!");
    }
}   
class Test3
{
    public static void main(String args[])
    {
        System.out.println("Hi Test3!");
    }
} 
/*
D:\morn11>java Test1
Test1 World!
D:\morn11>java Test2
Test2 World!
D:\morn11>java Test3
Test3 World!
 */
