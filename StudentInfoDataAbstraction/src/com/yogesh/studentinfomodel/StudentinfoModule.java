package com.yogesh.studentinfomodel;

public class StudentinfoModule {

	private int rollNo ;
	private String studentName ;
	private String mobileNo ;
	private double fees ;
	
	public void setRollno(int rollNo)
	{
		this.rollNo = rollNo ;
	}
	
	public void setStudName(String studentName)
	{
		this.studentName =  studentName ;
	}
	
	public void setMobileno(String mobileNo)
	{
		this.mobileNo =  mobileNo ;
	}
	
	public void setFees(double fees)
	{
		this.fees = fees;
	}
	
	public int getRollno()
	{
		return this.rollNo;
	}
	
	public String getStudName()
	{
		return this.studentName;
	}
	
	public String getMobileno()
	{
		return this.mobileNo;
	}
	
	public double getFees()
	{
		return this.fees;
	}
	
}
