package com.training.dao;

import java.util.*;

import com.training.ifaces.ReportCard;
import com.training.models.Marks;
import com.training.models.Student;

public class Report implements ReportCard{

	private List<Student> studentList;
	private Map<String,Marks> markList;
	
	public Report()
	{
		studentList=new ArrayList<>();
		markList=new TreeMap<>();
		
		studentList.add(new Student(100,"ram","CS","2020"));
		studentList.add(new Student(101,"sam","IT","2019"));
		studentList.add(new Student(102,"vikram","EE","2018"));
		studentList.add(new Student(103,"raj","EE","2017"));
		
		
		markList.put("ram",new Marks(80,70,90));
		markList.put("sam",new Marks(70,70,90));
		markList.put("vikram",new Marks(80,80,90));
		markList.put("raj",new Marks(90,70,70));
	}
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentList;
	}

	@Override
	public Marks getDetails(String studentName) {
		// TODO Auto-generated method stub
		
		Marks mark=null;
		
		mark=markList.get(studentName);
		
		return mark;
	}

	
	
}
