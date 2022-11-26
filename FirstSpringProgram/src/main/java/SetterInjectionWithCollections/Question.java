package SetterInjectionWithCollections;

import java.util.Iterator;
import java.util.List;

public class Question {
	private int number;
	private String question;
	private List<String>answers;
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public List<String> getAnswers() {
		return answers;
	}
	public void setAnswers(List<String> answers) {
		this.answers = answers;
	}
	public Question() {
		super();
	}
public void display() {
	System.out.println(number+" "+question);
	Iterator itr=answers.iterator();
	while(itr.hasNext()) {
	System.out.println(itr.next());
}
}
}
