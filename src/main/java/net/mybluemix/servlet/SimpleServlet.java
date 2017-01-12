package net.mybluemix.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServlet
 */
@WebServlet("/SimpleServlet")
public class SimpleServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException,NumberFormatException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");  
		String operation = request.getParameter("operation");
		PrintWriter out = response.getWriter();
		RequestDispatcher rd;

		 if(operation.equals("login")){
			
			String username = request.getParameter("username");
			String password = request.getParameter("password");
		
			
			
			
			
			if (username.equals("Keerthika") && password.equals("1234")) {
				
				System.out.println("Welcome" +username);
				
				rd=request.getRequestDispatcher("LoginSuccess.html");
				rd.forward(request, response);
				
				
			} else if (username.equals("Jayapradha") && password.equals("5678")) {
				
				System.out.println("Welcome" +username);
				rd=request.getRequestDispatcher("LoginSuccess.html");
				rd.forward(request, response);
				
		}
			else{
				rd=request.getRequestDispatcher("LoginFailed.html");
				rd.forward(request, response);
			}
		 }
	}
}
}
