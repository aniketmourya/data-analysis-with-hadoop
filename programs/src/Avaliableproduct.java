

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class database
 */
@WebServlet("/Avaliableproduct")
public class Avaliableproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Avaliableproduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<! DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<title>show data</title>");
		out.println("</head>");
		out.println("<body bgcolor=aliceblue>");
	
		Connection con;
		Statement st;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			out.println("connect to database");
			con=DriverManager.getConnection("jdbc:mysql://localhost/webcrawl?","root","root");
			st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from Avaliableproduct");
			
			out.println("<table border=1>");
    		out.println("<th>id</th>");
    		out.println("<th>name</th>");
    		out.println("<th>tc</th>");
    		out.println("<th>weburl</th>");
    		out.println("<th>webname</th>");
    		out.println("<th>reprize</th>");
    		out.println("<th>sealprize</th>");
    		out.println("<th> rebper</th>");
    		out.println("<th>stokinfo</th>");
			while(rs.next()){
				
				
	    		out.println("<tr>");
        		out.println("<td>"+ rs.getString("id")+"</td>");
        		out.println("<td>"+ rs.getString("name")+"</td>");
        		out.println("<td>"+ rs.getString("types_crawal")+"</td>");
        		out.println("<td>"+ rs.getString("web_url")+"</td>");
        		out.println("<td>"+ rs.getString("product_name")+"</td>");
        		out.println("<td>"+ rs.getString("reg_prise")+"</td>");
        		out.println("<td>"+ rs.getString("seal_prise")+"</td>");
        		out.println("<td>"+ rs.getString("percentage")+"</td>");
        		out.println("<td>"+ rs.getString("stock_info")+"</td>");
        		
        		out.println("</tr>");
        		
			}
			out.println("</table>");
		}catch(Exception e){
			out.println(e);
		}
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}