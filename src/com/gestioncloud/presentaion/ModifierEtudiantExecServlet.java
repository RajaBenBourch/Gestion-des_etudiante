package com.gestioncloud.presentaion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import com.gestioncloud.dao.*;
import com.gestioncloud.entities.Etudiant;
import com.gestioncloud.metier.IEtudiant;


/**
 * Servlet implementation class ModifierEtudiantExecServlet
 */
@WebServlet("/modifierEtudiantExec")
public class ModifierEtudiantExecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierEtudiantExecServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		double note = Double.parseDouble( request.getParameter("note"));
		HttpSession Session = request.getSession();
		int id =Integer.parseInt((String) Session.getAttribute("id"));
		Etudiant etudiant=new Etudiant(id,nom,prenom,note);
		IEtudiant service = new EtudiantDao();
		service.update(etudiant);
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
