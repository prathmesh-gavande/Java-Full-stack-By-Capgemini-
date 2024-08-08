package com.to1Hibernate.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Answer {
	
	@Id
	@Column(name = "aid")
	private int aid;
	
	@Column(unique = true)
	private String ans;
	
	@Column(nullable = false)
	private double obtained_marks;
	
	@OneToOne
	private Question question;
	
	
	public int getAid() {
		return aid;
	}
	public String getAns() {
		return ans;
	}
	public double getObtained_marks() {
		return obtained_marks;
	}
	public Question getQuestion() {
		return question;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public void setObtained_marks(double obtained_marks) {
		this.obtained_marks = obtained_marks;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	@Override
	public String toString() {
		return "Answer [aid=" + aid + ", ans=" + ans + ", obtained_marks=" + obtained_marks + ", question=" + question
				+ "]";
	}
	public Answer(int aid, String ans, double obtained_marks, Question question) {
		super();
		this.aid = aid;
		this.ans = ans;
		this.obtained_marks = obtained_marks;
		this.question = question;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
