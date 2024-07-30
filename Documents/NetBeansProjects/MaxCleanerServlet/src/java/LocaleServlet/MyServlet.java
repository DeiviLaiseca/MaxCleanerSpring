/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package LocaleServlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.ArrayList;

/**
 *
 * @author TATO
 */
public class MyServlet extends HttpServlet {
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response, String msg)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                        
            //response.sendRedirect("../mostrarDatos.jsp?lista="+list);
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyServlet at " + msg + "</h1>");
            out.println("</body>");
            out.println("</html>");
                        
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
        
            String email = request.getParameter("email");
            String password = request.getParameter("password");
        
            if( "deivi@maxcleaner.com".equals(email) && "123456".equals(password) ){
                
                processRequest(request, response, "Ingreso correcto");
                
            }
            else {
                
                processRequest(request, response, "Usuario o clave incorrecta");
                
            }            
            
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
        
         
            String name = request.getParameter("name");
            int id = Integer.parseInt(request.getParameter("id"));
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            
            Users user = new Users(name, id, email, password);                    
            
            ArrayList<Users> list = (ArrayList<Users>) request.getSession().getAttribute("list");
            
            if ( list == null) {
                
                list = new ArrayList<Users>();
                list.add(user);
                request.getSession().setAttribute("list", list);
                
                processRequest(request, response, "Registro exitoso primer usuario");
                
                               
            }
            else{
                
                list.add(user);
                request.getSession().setAttribute("list", list);
                
                processRequest(request, response, "Registro exitoso usuario");
                
                
                
            }
       // processRequest(request, response);
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
