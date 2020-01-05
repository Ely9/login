package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Welcomesrvlet
 */
public class Loginservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Loginservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {



		request.setCharacterEncoding("UTF-8");
		String userId = request.getParameter("userId");
		String password = request.getParameter("password");


		User user = new  User(userId,password);
		LoginLogic bo = new LoginLogic();

		boolean result = bo.execute(user);

		if(result) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/loginOK.jsp");
			dispatcher.forward(request, response);

		}else {
			response.sendRedirect("login.jsp");
		}



	}

}
