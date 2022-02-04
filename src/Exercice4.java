

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercice1
 */
@WebServlet("/Exercice4")
public class Exercice4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int cp=0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Exercice4() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		cp++;
		PrintWriter out = response.getWriter();
		
		out.println("<html>");
		out.println("<head>");
		out.println("<title>");
		out.println("Mon premier Servlet");
		out.println("</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("Host : " + request.getRemoteHost());
		out.println("Addr : " + request.getRemoteAddr());
		out.println("</body>");
		out.println("</html>");
		
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
