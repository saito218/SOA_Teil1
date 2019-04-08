package servletpkg;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Preisbean;

/**
 * Servlet implementation class Bruttoservlet
 */
@WebServlet("/Bruttoservlet")
public class Bruttoservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Bruttoservlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		PrintWriter out = response.getWriter();

		String n = request.getParameter("netto");

		double netto = Double.parseDouble(n);

		String steuerklasse = request.getParameter("steuerklasse");

		Preisbean pb = new Preisbean();

		pb.setNetto(netto);
		pb.setSteuerklasse(steuerklasse);

		out.println("<html>");
		out.println("<body>");
		out.println("<h3>Nettopreis</h3>");
		out.println(pb.getNetto() + " EUR");
		out.println("<h3>Steuerklasse</h3>");
		out.println(pb.getSteuerklasse());

		out.println("<h3>Bruttopreis</h3>");
		out.println(pb.getBrutto() + " EUR");

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
