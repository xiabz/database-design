package edu.neu.cs5200.eims.servlets;

import java.io.IOException;
//import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import edu.neu.cs5200.eims.dao.*;
import edu.neu.cs5200.eims.models.*;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request,response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if ("register".equals(action)){
			response.sendRedirect("../EmployeeSystem/regist.jsp");
		}
		else if("login".equals(action)){
			String userid = request.getParameter("userid");
			String username = request.getParameter("username");
			String password = request.getParameter("password");
			String type = request.getParameter("type");
			//Process data
			Integer id = Integer.parseInt(userid);
			if ("employee".equals(type)){
				RegistEmployee user = new RegistEmployee(id,username,password);
				RegistEmployeeDAO dao = new RegistEmployeeDAO();
				int a = dao.checkuser(user);
				if (a==1)
				{
					response.sendRedirect("../EmployeeSystem/hello.jsp?id="+id);
				}
				else{
					//PrintWriter out = response.getWriter();
					response.sendRedirect("../EmployeeSystem/login.jsp?msg=1");
				}
			}
			else if("manager".equals(type)){
				RegistManager user = new RegistManager(id,username,password);
				RegistManagerDAO dao = new RegistManagerDAO();
				int a = dao.checkuser(user);
				if(a==1)
				{
					response.sendRedirect("../EmployeeSystem/hello.jsp?id="+id);
				}
				else{
					//PrintWriter out = response.getWriter();
					response.sendRedirect("../EmployeeSystem/login.jsp?msg=1");
				}
			}
		}

	}
//	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("Hello from LoginServlet!");
//		//response.sendRedirect("../hello.jsp");
//	}
	public void init() throws ServletException{		
	}
	
}
