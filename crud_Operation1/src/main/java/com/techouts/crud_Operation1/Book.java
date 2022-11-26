
package com.techouts.crud_Operation1;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
//perspective class contains deatils about object
public class Book {
	@Id
	@Column(name="Book_Id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int bookNo;
	@Column(name="Book_Name")
	private String bookName;
	@Column(name="Author_Name")
	private String authorName;
	public Book() {
	}
	public int getBookNo() {
		return bookNo;
	}
	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

}
