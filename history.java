import java.util.Scanner;
import java.lang.String;
public class history {
	static Scanner sc = new Scanner(System.in);
	static String [] remember = new String [100];
	static String response;

	public static void main(String[] args) {
		int counter=0;
		for( int i=0;i<remember.length;i++)
		{
			remember[i]="";
			
		}
		
		System.out.println("Enter a word");
		response = sc.next();
		while(!(response.equalsIgnoreCase("history")))
			{
			  if(!(counter>99))
			  {
				  remember[counter]=response;
				  counter++;
			  }
			  response =sc.next();
			}
		printHistory();

	}
	public static void printHistory()
	{
		
		for(int i=remember.length-1;i>0 ;i--)
		{
			if(!(remember.equals("")))
			{
				System.out.println(remember[i]);
			}
			
		}
	}

}
