package com.yogesh.studentinfo;

import java.util.Scanner;

import com.yogesh.studentinfomodel.StudentinfoModule;

public class StudentinfoMain {
	
	StudentinfoModule studentinfoModel = new StudentinfoModule();
	

	public void setData()
	{
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Roll No :");
		studentinfoModel.setRollno(scanner.nextInt());
		
		System.out.print("Enter Student Name :");
		studentinfoModel.setStudName(scanner.next());
		
		System.out.print("Enter Student Mobile No :");
		studentinfoModel.setMobileno(scanner.next());
		
		System.out.print("Enter Fees :");
		studentinfoModel.setFees(scanner.nextDouble());
	}
	
	public void getData()
	{
		System.out.println("Roll No :" + studentinfoModel.getRollno() +"\nStudent name :" + studentinfoModel.getStudName() + "\nMobile No :" + studentinfoModel.getMobileno() + "\nFees :" + studentinfoModel.getFees());
		 		
	}


	public static void main(String[] args) { 

		StudentinfoMain studentinfomain = new StudentinfoMain();
		studentinfomain.setData();
		studentinfomain.getData();		
	}

}
