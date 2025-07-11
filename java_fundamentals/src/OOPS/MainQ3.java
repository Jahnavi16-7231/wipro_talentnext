package OOPS;
import java.util.*;
public class MainQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter author's name: ");
        String authorName = sc.nextLine();

        System.out.print("Enter author's email: ");
        String email = sc.nextLine();

        System.out.print("Enter author's gender (M/F): ");
        char gender = sc.next().charAt(0);

        sc.nextLine(); 

        AuthorQ3 author = new AuthorQ3(authorName, email, gender);

        System.out.print("Enter book name: ");
        String bookName = sc.nextLine();

        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity in stock: ");
        int qtystock = sc.nextInt();

        BookQ3 book = new BookQ3(bookName, author, price, qtystock);

        // Print book + author details
        System.out.println("\n--- Book Details ---");
        System.out.println(book);

        sc.close();
    }


	}


