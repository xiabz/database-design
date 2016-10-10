package edu.neu.cs5200.eims.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.neu.cs5200.eims.dao.*;
import edu.neu.cs5200.eims.models.*;

//@WebServlet(name = "register", urlPatterns = { "/register" })
public class RegistServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. Receive Parameter
		String userid = request.getParameter("userid");
		Integer id = Integer.parseInt(userid);
		String name = request.getParameter("username");
		String password = request.getParameter("password");
		String department = request.getParameter("department");
		Integer depart = Integer.parseInt(department);
		String type = request.getParameter("type");
		String gender = request.getParameter("gender");//enum
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String edu = request.getParameter("edu");//enum
		String entry = request.getParameter("entry");//Entry date
		String tele = request.getParameter("tele");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		
		
		
		
		
	}
	public void init() throws ServletException{		
	}	
}
