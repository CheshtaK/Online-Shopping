/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author KAPIL
 */
@WebServlet(urlPatterns = {"/To_cart_from_wish"})
public class To_cart_from_wish extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter pw=null;
        String id=request.getParameter("id");
        String id2=request.getParameter("id2");
        String s2=null,s5=null,s6=null,s7=null,s8=null,s9=null,s10=null,s3=null,s4=null ;
        int no = Integer.parseInt(id);
        int cnt=0,cnt1=0;
        //pw.println(id2);
        
                try
                {
                    Connection con;
                    Statement st;
                    PreparedStatement st1;
                    ResultSet rs;
                    Class.forName("com.mysql.jdbc.Driver");
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "K@pil1998");
                    
                    st = con.createStatement();
                    rs = st.executeQuery("select * from Wishlist where S_No ='"+no+"'"); 
                    while(rs.next())
                    {
                        //s3=rs.getString(3);
                        s2=rs.getString(2);//link
                        s3=rs.getString(3);//desc
                        s4=rs.getString(4);//act
                        s5=rs.getString(5);//discp
                        s6=rs.getString(6);//disc
                        s7=rs.getString(7); //quan
                        s8=rs.getString(8); //fixa
                        s9=rs.getString(9); //fixb
                        s10=rs.getString(10); //cat
                    }
                    cnt = no+1;
                    cnt1 = cnt + 1;
                    st.executeUpdate("delete from Wishlist where S_No='"+no+"' ");
                    //st.executeUpdate("update Wishlist SET S_No = '"+no+"'where S_No='"+cnt+"' ");
                    //st.executeUpdate("alter table Wishlist drop 'S_NO' ");
                    //st.executeUpdate("alter table Wishlist auto_increment='"+cnt+"'");
                 
                    st1 = con.prepareStatement("insert into Cart(Link,Description,Actual_Price,Discounted_Price,Discount,Size,Quantity,fixedA,fixedB,Category) values(?,?,?,?,?,?,?,?,?,?)");
                    st1.setString(1,s2);
                    //st1.setString(2,s3);
                    st1.setString(2,s3);
                    st1.setString(3,s4);
                    st1.setString(4,s5);
                    st1.setString(5,s6);
                    st1.setString(6,id2);
                    st1.setString(7,s7);
                    st1.setString(8,s8);
                    st1.setString(9,s9);
                    st1.setString(10,s10);
                    boolean ctr = st1.execute();
                    response.sendRedirect("http://localhost:8080/Project/Wishlist.jsp");
                }
                catch(Exception e){
                    pw.println(e);
                }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
