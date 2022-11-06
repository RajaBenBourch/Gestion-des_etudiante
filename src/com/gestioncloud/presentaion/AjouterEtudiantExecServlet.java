package com.gestioncloud.presentaion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gestioncloud.dao.EtudiantDao;
import com.gestioncloud.entities.Etudiant;
import com.gestioncloud.metier.IEtudiant;

/**
 * Servlet implementation class AjouterEtudiantExecServlet
 */
@WebServlet("/ajouterEtudiantExec")
public class AjouterEtudiantExecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterEtudiantExecServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		double note = Double.parseDouble(request.getParameter("note"));
		
		Etudiant etudiant = new Etudiant(nom, prenom, note);
		
		IEtudiant service = new EtudiantDao();
		
		service.add(etudiant);
		
		response.sendRedirect("listerEtudiant");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
