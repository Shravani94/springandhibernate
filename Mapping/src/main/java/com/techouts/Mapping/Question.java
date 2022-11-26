package com.techouts.Mapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OrderColumn;
import javax.persistence.Table;
@Entity
@Table(name="Question")
public class Question {
	@Column(name="Question")
	private String question;
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE)
	private int id;
	@OneToMany(cascade = CascadeType.ALL)  
	@JoinColumn(name="qid")  
	@OrderColumn(name="type") 
	private List<Answers> answers;
	public Question() {
		super();
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Answers> getAnswers() {
		return answers;
	}
	public void setAnswers(List<Answers> answers) {
		this.answers = answers;
	}
	

}
