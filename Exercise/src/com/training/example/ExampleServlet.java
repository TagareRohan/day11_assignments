package com.training.example;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.training.dao.Report;
import com.training.models.Marks;

/**
 * Servlet implementation class ExampleServlet
 */
@WebServlet(urlPatterns= {"/ExampleServlet","/example"})
public class ExampleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Report report=null;

    /**
     * Default constructor. 
     */
    public ExampleServlet() {
        // TODO Auto-generated constructor stub
    	report=new Report();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session=request.getSession();
		
		boolean flag=request.getParameter("input")!=null;
		
		
		if(flag)
		{
			session.setAttribute("studentList", report.getAllStudents());
			RequestDispatcher disp=request.getRequestDispatcher("welcome.jsp");
			disp.forward(request, response);
		}
		
		String studentName=request.getParameter("value");
		
		if(studentName!=null)
		{
			
			System.out.println(studentName);
			session.setAttribute("name", studentName);
			
			Marks marks=report.getDetails(studentName);
			System.out.println(marks);
			
			session.setAttribute("marks", marks);
			
			RequestDispatcher dispatcher=request.getRequestDispatcher("marks.jsp");
			dispatcher.forward(request, response);
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		doGet(request, response);
	}

}
