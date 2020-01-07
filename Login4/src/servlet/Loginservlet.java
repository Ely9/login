package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Content;
import model.LoginLogic;
import model.Mainlogic;
import model.User;

/**
 * Servlet implementation class Welcomesrvlet
 */
@WebServlet("/Loginservlet")
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

		Mainlogic mainlogic = new Mainlogic();
		List<Content> contentlist = mainlogic.execute();
		ServletContext application = this.getServletContext();
		application.setAttribute("contentlist", contentlist);





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
		HttpSession session = request.getSession();
		session.setAttribute("loginuser", user);
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
