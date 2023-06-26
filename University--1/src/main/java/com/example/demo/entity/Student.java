package com.example.demo.entity;

import jakarta.persistence.Id;

public class Student {
	String Name;
	@Id
	int RollNumber;
	String Subject;
	double Score;
	
	public Student(String name, int rollNumber, String subject, double score) {
		super();
		Name = name;
		RollNumber = rollNumber;
		Subject = subject;
		Score = score;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}
	public String getSubject() {
		return Subject;
	}
	public void setSubject(String subject) {
		Subject = subject;
	}
	public double getScore() {
		return Score;
	}
	public void setScore(double score) {
		Score = score;
	}
	
	

}
