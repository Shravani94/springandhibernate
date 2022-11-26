package com.techouts.crud_Operation1;

import java.util.List;
import java.util.Scanner;

import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
//this is util class here we can perform crud operation
public class BookUtil {
	Scanner sc = new Scanner(System.in);
	char ch;
//saveBook() method for inseting new book inti database
	public void saveBook() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		do {
			Book book = new Book();
			//System.out.println("enter book number");
			//int number = sc.nextInt();
			//book.setBookNo(number);
			System.out.println("enter book name");
			String name = sc.next();
			book.setBookName(name);
			System.out.println("enter author name");
			String author = sc.next();
			book.setAuthorName(author);
			session.save(book);
			t.commit();
			System.out.println("added successfully");
			System.out.println("If you to continue enter y else enter n");
			this.ch = sc.next().charAt(0);
		} while (ch != 'n');
		session.close();

	}
//delteBook() method is for deleting the book from database
	public void deleteBook() {

		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
		System.out.println("enter book no");
		int num = sc.nextInt();
		Book book = new Book();
		book.setBookNo(num);
		session.delete(book);
		t.commit();
		System.out.println("deleted successfully");
		}catch(Exception e) {
			System.out.println("this book is not availbe");
		}
		finally {
		session.close();
		}

	}
//updateBook() is for performing modifications on book
	public void updateBook() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try {
		System.out.println("enter book number");
		int bookNumber = sc.nextInt();
		Book bookdetails = (Book) session.load(Book.class, bookNumber);
		System.out.println("enter book name");
		String bookName = sc.next();
		bookdetails.setBookName(bookName);
		System.out.println("enter Author name");
		String author = sc.next();
		bookdetails.setAuthorName(author);
		session.update(bookdetails);
		t.commit();
		System.out.println("updated successfully");
		}catch(Exception e) {
			System.out.println("this bok is not available");
			
		}
		finally {
			session.close();
	
		}

	}
	//showBook() method is for retrieving one particular book from database
	public void showBook() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();
		try{
		System.out.println("enter book number");
		int num=sc.nextInt();
		Book book=new Book();
		book=session.get(Book.class, num);
		System.out.println("BookNumber :"+book.getBookNo()+" , BoonName :"+book.getBookName()+" , AuthorName :"+book.getAuthorName());
	}catch(Exception e) {
		System.out.println("this number is not availabe");
	}
		finally {
			session.close();
		}
		
	}
//showAllBooks() is used for dispalying all books from database
	public void showAllBooks() {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();

		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		Transaction t = session.beginTransaction();

		CriteriaBuilder builder = session.getCriteriaBuilder();

		CriteriaQuery<Book> criteria = builder.createQuery(Book.class);

		criteria.from(Book.class);

		List<Book> bookList = session.createQuery(criteria).getResultList();

		for (Book e : bookList) {
			System.out.print("BookNumber :"+e.getBookNo()+" , ");
			System.out.print("BookName :"+e.getBookName()+" , ");
			System.out.println("AuthorName :"+e.getAuthorName());
		}

	}
//this is main method
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch;

		do {
		BookUtil bookUtil = new BookUtil();
		System.out.println("enter 1 for adding");
		System.out.println("enter 2 for update");
		System.out.println("enter 3 for delete");
		System.out.println("enter 4 for showAllBooks");
		System.out.println("enter 5 for particular book");
		int n=scan.nextInt();
		switch(n) {
		case 1:bookUtil.saveBook();
		break;
		case 2:bookUtil.updateBook();
		break;
		case 3:bookUtil.deleteBook();
		break;
		case 4:bookUtil.showAllBooks();
		break;
		case 5:bookUtil.showBook();
		break;
		default:System.out.println("enter valid number");
		}
		System.out.println("do you want to  exit enter n");
		ch=scan.next().charAt(0);
		}while(ch!='n');
		
		
	}

	/*
	 * public void showAllBooks() { SessionFactory sessionFactory =
	 * HibenateUtil.getSessionFactory(); //getting session object from session
	 * factory Session session = sessionFactory.openSession(); //getting transaction
	 * object from session object session.beginTransaction(); Query query =
	 * session.createQuery("from Book"); List Books = ((org.hibernate.query.Query)
	 * query).list(); for(Book book : Books) {
	 * System.out.println("Book Number: "+book.getBookNo()+", Book Name: "+book.
	 * getBookName()+", Author: "+book.getAuthorName()); }
	 * session.getTransaction().commit(); sessionFactory.close();
	 * 
	 * 
	 * }
	 */

}
