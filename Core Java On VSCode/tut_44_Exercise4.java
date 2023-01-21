import java.util.Scanner;
class Library
{
	private String availableBooks[]=new String[100];
	private String issuedBooks[]=new String[100];
	
	Library()
	{
		availableBooks[0]="The Jungle Book";
		availableBooks[1]="Maha Bharat";
		availableBooks[2]="Ramayan";
		availableBooks[3]="The Merchant of Venice";
		availableBooks[4]="The Invisible Man";
		availableBooks[5]="Harry Potter";
		availableBooks[6]="Believe It or Not";
		availableBooks[7]="Maths";
		availableBooks[8]="Computer";
	}
	
	void showAvailableBooks()
	{
		int c=0;
		for(String i:availableBooks)
		if(i!=null)
		System.out.println(++c+". "+i);
		if(c==0)
		System.out.println("None!");
	}
	
	void showIssuedBooks()
	{
		int c=0;
		for(String i:issuedBooks)
		if(i!=null)
		System.out.println(++c+". "+i);
		if(c==0)
		System.out.println("None!");
	}
	
	
	void addBook(String x)
	{
		int c=0;
		for(String i:availableBooks)
		{
			if(i==null)
			{
				availableBooks[c]=x;
				break;
			}
			c++;
		}
		System.out.println("Successfully Done.");
	}
	
	void issueBook(String x)
	{
		int c=0,c2=-1;
		for(String i:availableBooks)
		{
			if(i!=null)
			if(i.compareToIgnoreCase(x)==0)
			{
				for(String j:issuedBooks)
				{
					c2++;
					if(j==null)
					{
						issuedBooks[c2]=availableBooks[c];
						break;
					}
				}
				availableBooks[c]=null;
				System.out.println("The book \""+x+"\" is issued for you.");
				break;
			}
			c++;
		}
		if(c2==-1)
		System.out.println("Book Not Found!!");
	}
	
	void returnBook(String x)
	{
		int c=0,d=0;
		for(String i:issuedBooks)
		{
			if(i!=null)
			if(i.compareToIgnoreCase(x)==0)
			{
				d=1;
				addBook(i);
				issuedBooks[c]=null;
				break;
			}
			c++;
		}
		if(d==0)
		System.out.println("Check your entry");
	}
}

public class tut_44_Exercise4
{
	public static void main(String args[])
	{
		// Library Management System

		int n=-1;
		Scanner sc=new Scanner(System.in);
		Scanner sc2=new Scanner(System.in);
		Library l=new Library();
		System.out.println("Enter your choice:\n"+
						"0-To exit.\n"+
						"1-To display available books.\n"+
						"2-To Issue a book.\n"+
						"3-To return back an issued book.\n"+
						"4-To add a book.\n"+
						"5-To display issued books.\n");
		
		while(n!=0)
		{
			n=sc.nextInt();
			System.out.println();
			
			switch(n)
			{
				case 0:
					System.out.println("Exiting finish!!");
					break;
				case 1:
					l.showAvailableBooks();
					break;
				case 2:
					System.out.println("Enter the book's name you want to issue.");
					l.issueBook(sc2.nextLine());
					break;
	 			case 3:
					System.out.println("Enter the book's name you want to return.");
					l.returnBook(sc2.nextLine());
					break;
				case 4:
					System.out.println("Enter the book's name you want to add.");
					l.addBook(sc2.nextLine());
					break;
				case 5:
					l.showIssuedBooks();
					break;
				default:
					System.out.println("Invalid Choice!!");
			}
			if(n!=0)
			System.out.print("\nEnter your choice again: ");
	 	}

         sc.close();
         sc2.close();
	}
}



