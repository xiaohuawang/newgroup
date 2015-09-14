package main1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.HccourseDB;
import model.Hccourse;
import model.Hcdept;

/**
 * Servlet implementation class Hc3
 */
@WebServlet("/Hc3")
public class Hc3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hc3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		System.out.println("hc3 doget");
		String departmentstr=request.getParameter("department");
		long departmentid = Long.parseLong(departmentstr);
		System.out.println(departmentid);
		System.out.println("1");
		Hcdept hcdept=new Hcdept();
		hcdept.setId(departmentid);
		hcdept.setName("aa");
		System.out.println("2");
		
		List <Hccourse>list=HccourseDB.getinstructor(hcdept);
		
		
		request.setAttribute("list", list);
		getServletContext().getRequestDispatcher("/3.jsp").forward(request, response);
		
		
		
		
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
