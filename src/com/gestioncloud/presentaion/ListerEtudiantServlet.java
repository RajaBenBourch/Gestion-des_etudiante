package com.gestioncloud.presentaion;

import java.io.IOException;
import java.util.Collection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncloud.dao.EtudiantDao;
import com.gestioncloud.entities.Etudiant;
import com.gestioncloud.metier.IEtudiant;

/**
 * Servlet implementation class ListerEtudiantServlet
 */
@WebServlet("/listerEtudiant")
public class ListerEtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListerEtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IEtudiant service = new EtudiantDao();
		Collection<Etudiant> etudiants = service.findAll();
		request.setAttribute("etudiants", etudiants);
		RequestDispatcher rd = request.getRequestDispatcher("listerEtudiant.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
