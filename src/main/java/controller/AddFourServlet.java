package controller;

import java.io.IOException;

import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.AddFourNumbers;



/**
 * Servlet implementation class AddFourServlet
 */
@WebServlet("/AddFourServlet")
public class AddFourServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddFourServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//getting input from AddFourIndex
		
		
		String userNum1 = request.getParameter("userNum1");
		String userNum2 = request.getParameter("userNum2");
		String userNum3 = request.getParameter("userNum3");
		String userNum4 = request.getParameter("userNum4");
		
		//parse to int
		AddFourNumbers userTotal = new AddFourNumbers(Integer.parseInt(userNum1), (Integer.parseInt(userNum2)), (Integer.parseInt(userNum3)), ((Integer.parseInt(userNum4))));

		
		//create objects to pass to addFourResult
		request.setAttribute("addFourNumbers", userTotal);



		getServletContext().getRequestDispatcher("/addFourResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		
		//to string
		//writer.println(userTotal.toString());

		
		//writer.close();

		//getServletContext().getRequestDispatcher("/addFourResult.jsp").forward(request, response);
		
		//PrintWriter writer = response.getWriter();
		
		//to string
		//writer.println(userTotal.toString());

		
		//writer.close();

		

		
		
		
	}

}
