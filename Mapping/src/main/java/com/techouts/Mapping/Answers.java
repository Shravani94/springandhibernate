package com.techouts.Mapping;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;

@Entity
@Table(name="Answers")
public class Answers {
	@Id
    @GeneratedValue(strategy=GenerationType.TABLE)  
	private int id;
	private String setOfAnswers;
	private String postedBy;
	public Answers() {
		super();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSetOfAnswers() {
		return setOfAnswers;
	}
	public void setSetOfAnswers(String setOfAnswers) {
		this.setOfAnswers = setOfAnswers;
	}
	public String getPostedBy() {
		return postedBy;
	}
	public void setPostedBy(String postedBy) {
		this.postedBy = postedBy;
	}
	
	

}
