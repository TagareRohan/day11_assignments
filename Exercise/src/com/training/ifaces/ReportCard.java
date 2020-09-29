package com.training.ifaces;

import java.util.*;

import com.training.models.Marks;
import com.training.models.Student;

public interface ReportCard {

	public List<Student> getAllStudents();
	
	public Marks getDetails(String studentName);
	
}
