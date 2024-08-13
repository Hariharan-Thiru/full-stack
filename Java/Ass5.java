package com.harry;

class Book{
	String title;
	String author;
	int ISBN;
	
	Book(String title,String author,int ISBN){
		this.title=title;
		this.author=author;
		this.ISBN=ISBN;
	}
	
	void display() {
		System.out.println("Title: "+title);
		System.out.println("Author: "+author);
		System.out.println("ISBN: "+ISBN);
	}
}
public class Ass5 {

	public static void main(String[] args) {
		Book obj=new Book("Little","Harry",1005);
		obj.display();
	}

}
