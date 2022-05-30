import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Display extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public Display() {
        super();
    }

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		PrintWriter out = res.getWriter();  
        res.setContentType("text/html");  
        out.println("<html><body>"); 
        out.println("<a href=index.jsp><h3>Back</h3></a>");
        out.println("<div align=center>");
        try 
        {  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sales", "root", "insert_password");  
            Statement stmt = con.createStatement();  
            String id = req.getParameter("id");
            ResultSet rs = stmt.executeQuery("select * from product where id = '" + id + "'"); 
                      
            if (rs.next()) 
            {  
            	out.println("<h2 style=color:magenta>Product Details</h2>");
                out.println("<table align=center border=1 width=50% height=15%>");  
                out.println("<tr align=center><th>ProductId</th><th>ProductName</th><th>Brand</th><th>Madein</th><th>Price</th><tr>");  
                
                int m = rs.getInt("id");  
                String n = rs.getString("name");
                String o = rs.getString("brand");
                String p = rs.getString("madein");
                int q = rs.getInt("price");
                
                out.println("<tr align=center><td>" + m + "</td><td>" + n + "</td><td>" + o + "</td><td>" + p + "</td><td>" + q + "</td></tr>"); 
                out.println("</table>"); 
                out.println("</div>"); 
                out.println("</html></body>"); 
                con.close(); 
            }  else {
            	out.println("<h1 style=color:red>PRODUCT NOT FOUND!!!</h1>");
            }             
        }catch (Exception e) {  
            out.println("error");  
        }  
    }  

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
