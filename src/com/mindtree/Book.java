package com.mindtree;

public class Book implements Comparable<Book> {
	private int id;
	private String name;
	private String publishers;
	private String author;
	private int noOfCopies;

	public Book() {
		super();
	}

	public Book(int id, String name, String publishers, String author, int noOfCopies) {
		super();
		this.id = id;
		this.name = name;
		this.publishers = publishers;
		this.author = author;
		this.noOfCopies = noOfCopies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublishers() {
		return publishers;
	}

	public void setPublishers(String publishers) {
		this.publishers = publishers;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getNoOfCopies() {
		return noOfCopies;
	}

	public void setNoOfCopies(int noOfCopies) {
		this.noOfCopies = noOfCopies;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", publishers=" + publishers + ", author=" + author
				+ ", noOfCopies=" + noOfCopies + "]";
	}

	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		if (this.getAuthor().compareTo(arg0.getAuthor()) > 0) {
			return 1;
		} else
			return -1;
	}
}
