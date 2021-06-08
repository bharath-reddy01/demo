package com.mindtree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Library {
	static Scanner sc = new Scanner(System.in);
	static ArrayList<Book> book = new ArrayList<Book>();
	static Book b = new Book();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean flag = true;
		do {
			System.out.println("Enter Your Choice");
			displayMenu();
			Byte ch = sc.nextByte();
			switch (ch) {
			case 1: {
				addBookDetails(b);
				break;
			}
			case 2: {
				searchBookByName(book);
				break;
			}
			case 3: {
				sortBooksByAuthor(book);
				break;
			}
			case 4: {
				updateNoOfCopiesForABook(book);
				displayBooks(book);
				break;
			}
			case 5: {
				System.out.println("Thank You!");
				flag = false;
				break;
			}
			default:
				System.out.println("Invalid Choice");
			}
		} while (flag);
	}

	private static void updateNoOfCopiesForABook(ArrayList<Book> book) {
		// TODO Auto-generated method stub
		System.out.println("Enter the book id to update");
		int id = sc.nextInt();
		System.out.println("Enter new no of copies");
		int copies = sc.nextInt();
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getId() == id) {
				book.get(i).setNoOfCopies(copies);
			}
		}
	}

	private static void sortBooksByAuthor(ArrayList<Book> book) {
		// TODO Auto-generated method stub
		Collections.sort(book);
		for (Book bo : book) {
			System.out.println(bo);
		}
	}

	private static void searchBookByName(ArrayList<Book> book) {
		// TODO Auto-generated method stub
		System.out.println("Enter Book name to be searched");
		String searchBook = sc.next();
		String str = "";
		String str1 = "";
		for (int i = 0; i < book.size(); i++) {
			if (book.get(i).getName().equals(searchBook)) {
				str = book.get(i).getName();
			}
		}
		for (int i = 0; i < str.length(); i++) {
			if (i % 2 == 0) {
				if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
						|| str.charAt(i) == 'u') {
					str1 = str1 + (char) (str.charAt(i) + 1);
				} else {
					str1 = str1 + str.charAt(i);
				}
			}
		}
		System.out.println(str1);
	}

	private static void addBookDetails(Book b) {
		System.out.println("Enter the no of books");
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// TODO Auto-generated method stub
			System.out.println("Enter Id ");
			int id = sc.nextInt();
			System.out.println("Enter Name");
			String name = sc.next();
			System.out.println("Enter Publishers");
			String publishers = sc.next();
			System.out.println("Enter Author");
			String author = sc.next();
			System.out.println("Enter no of copies");
			int noOfCopies = sc.nextInt();
			b = new Book(id, name, publishers, author, noOfCopies);
			book.add(b);
		}
		displayBooks(book);
	}

	private static void displayMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.Add Books Details and Diaplay");
		System.out.println("2.Search Book by name");
		System.out.println("3.Sort Book by Author");
		System.out.println("4.Update no of copies for a book");
		System.out.println("5.Exit");
	}

	private static void displayBooks(ArrayList<Book> book) {
		Iterator<Book> itr = book.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
