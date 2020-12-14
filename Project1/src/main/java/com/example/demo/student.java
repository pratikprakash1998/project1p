package com.example.demo;

import org.springframework.stereotype.Component;




@Component
@Scope("prototype")
public class student {
	
	private int Roll_Number;
	private int Class;
	private String stream;
	private String Grade;
	private String feeback;
	
	public student() {
		System.out.println("Inside student Constructor");
	}
	public int getRoll_Number() {
		return Roll_Number;
	}
	public void setRoll_Number(int roll_Number) {
		Roll_Number = roll_Number;
		
	}
	public int getClass() {
		return Class;
	}
	public void setClass(int class1) {
		Class = class1;
	}
	public String getStream() {
		return stream;
	}
	public void setStream(String stream) {
		this.stream = stream;
	}
	public String getGrade() {
		return Grade;
	}
	public void setGrade(String grade) {
		Grade = grade;
	}
	public String getFeeback() {
		return feeback;
	}
	public void setFeeback(String feeback) {
		this.feeback = feeback;
	}
	public void display() {
		System.out.println("we will get student object");
	}
	

}
