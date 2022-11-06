package com.gestioncloud.presentaion;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.gestioncloud.dao.EtudiantDao;
//import com.gestioncloud.entities.Etudiant;
import com.gestioncloud.metier.IEtudiant;

/**
 * Servlet implementation class SupprimerEtudiantExecServlet
 */
@WebServlet("/supprimerEtudiantExec")
public class SupprimerEtudiantExecServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerEtudiantExecServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		HttpSession Session = request.getSession();
		int id =Integer.parseInt((String) Session.getAttribute("id"));
		IEtudiant service = new EtudiantDao();
		service.delete(id);
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
