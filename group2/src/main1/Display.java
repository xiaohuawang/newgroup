package main1;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DB.HcclassDB;
import model.Goshuser;
import model.Hcclass;
import model.Hcuser;

/**
 * Servlet implementation class Display
 */
@WebServlet("/Display")
public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Display() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		System.out.println("doget display");
		
		String semester=request.getParameter("semester");
		String instructor=request.getParameter("instructor");
		
		//Hcclass hcclass=new Hcclass();
		
		
		
		
		Hcuser hcuser=new Hcuser();
		hcuser.setUserid(2);
		hcuser.setType(3);
		
		
		
		//HttpSession session = request.getSession();
		//session.setAttribute("user", hcuser);
		
	//	Hcuser user = (Hcuser) session.getAttribute("user");
		
		List<Hcclass> list=HcclassDB.getinstructor(hcuser);
		
		
		System.out.println(semester);
		System.out.println(instructor);
		
		
		//List<Hcclass> list=HcclassDB.getAllProducts();
		
		
	
		//List<Hcclass> list=HcclassDB.getsomeClass(semester);
		
		
		System.out.println(list);
		
	//	System.out.println(goshitem.getItemName());
	//	System.out.println(goshitem.getItemName());
	//	System.out.println(goshitem.getItemName());
	/*	
		for(int i=0;i<list.size();i++){
		    Hcclass hcclass=list.get(i);
			
		    System.out.println(hcclass.getDaytime() +"11111<<<<<<<<<<<<<<<<<<<");
		    System.out.println(hcclass.getEnable());
		}
	*/	
		

		System.out.println("addpro doGet");
		
		request.setAttribute("list", list);
		getServletContext().getRequestDispatcher("/display.jsp").forward(request, response);
		
	
		
		
		
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
