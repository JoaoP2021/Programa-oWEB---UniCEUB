package Atividade02;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletAgenda
 */
@WebServlet("/ServletAgenda")
public class ServletAgenda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletAgenda() {
        super();
        // TODO Auto-generated constructor stub
    }
@Override
public void init() throws ServletException {
	super.init();
	log("ServletDataHora " + format.format(new Date()));
}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
