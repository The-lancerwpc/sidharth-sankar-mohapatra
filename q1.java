import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc= new Scanner(System.in);
		int t= sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int a=sc.nextInt();
		    switch(a%12)
		    {
		        case 0:
		            System.out.println(a-11+" WS");
		            break;
		       case 1:
		            System.out.println(a+11+" WS");
		            break;
		       case 2:
		            System.out.println(a+9+" MS");
		            break;
		        case 3:
		            System.out.println(a+7+" AS");
		            break;
		        case 4:
		            System.out.println(a+5+" AS");
		            break;
		       case 5:
		            System.out.println(a+3+" MS");
		            break;
		       case 6:
		            System.out.println(a+1+" WS");
		            break;
		        case 7:
		            System.out.println(a-1+" WS");
		            break;
		       case 8:
		            System.out.println(a-3+" MS");
		      
		            break;
		       case 9:
		            System.out.println(a-5+" AS");
		            break;
		       case 10:
		            System.out.println(a-7+" AS");
		            break;
		       case 11:
		            System.out.println(a-9+" MS");
		            break;
		    }
		}
	}
}
