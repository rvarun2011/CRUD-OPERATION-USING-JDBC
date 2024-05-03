package crud;

import java.sql.SQLException;
import java.util.Scanner;

public class LibraryManagement {

	public static void main(String[] args)throws SQLException {
		// TODO Auto-generated method stub
		Book db=new Book();
		Scanner sc=new Scanner(System.in);
		while(true) {
		System.out.println("---------Library Management Dashboard---------");
		System.out.println("1.ADD\n2.VIEW\n3.EDIT\n4.DELETE\n5.EXIT");
		System.out.println("Enter Your Choice");
		int ch=sc.nextInt();
				sc.nextLine();
				if(ch==1) {
					System.out.println("Enter the Book Id");
				    int Book_id=sc.nextInt();
				    sc.nextLine();
					System.out.println("Enter the Book Title ");
					String Title=sc.nextLine();
					System.out.println("Enter the Name of the Author  ");
					String Author=sc.nextLine();
					System.out.println("Enter the Genre of the Book ");
					String Genre=sc.nextLine();
					System.out.println("Enter the Publication Year of the Book");
					int Publication_Year=sc.nextInt();
					System.out.println("Enter the Quantity of the Book is Available ");
					int Quantity=sc.nextInt();
					int r=db.insert(Book_id,Title, Author, Genre, Publication_Year, Quantity);
					String res=(r>0)?"Added to db":"Not Added";
					System.out.println(res);
				}
				else if(ch==2) {
					System.out.println("Book_id\tTitle\tAuthor\tGenre\tPublication_Year\tQuantity");
					db.select(); 
				}
				else if(ch==3) {
					System.out.println("Enter the Book Title Whose Quantity to be Update");
					String Title=sc.next();
					System.out.println("Enter the New Quantity of Book ");
					int Quantity=sc.nextInt();
					int r=db.update(Title, Quantity);
					System.out.println((r>0)?"Updated":"Not Updated");
				}
				else if(ch==4) {
					System.out.println("Enter the Book Id To Deleted");
					int Book_id=sc.nextInt();
					int r=db.delete(Book_id);
					System.out.println((r>0)?"Deleted":"Not Deleted");
				}
				else if(ch==5) {
					System.out.println("Operation is Terminated");
				}

	}
	}

}
