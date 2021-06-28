/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author 850354
 */
public class ShoppingListServlet extends HttpServlet {

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
      
        //initialize a session 
        HttpSession sesh =request.getSession();
        
        //get the username parameter
        String userName = request.getParameter("username");
        //get the key parameter (action)
        String action = request.getParameter("action");
        
        //this if statement will see if the user has pressed on logout
        if (action != null && action.equals("logout")){
            //u want to delete the session because they are logging out so 
            sesh.invalidate();
            //and then where do u wanna send them 
            response.sendRedirect("ShoppingList");
        }
        
        //now checking if they inputted a username or not
        if (userName !=null ){
         //show the registration 
         
         getServletContext().getRequestDispatcher("/WEB-INF/register.jsp").forward(request, response);
        }
        
        else{ 
            //show shoppinglist page
            getServletContext().getRequestDispatcher("/WEB-INF/shoppingList.jsp").forward(request, response);
        }
        
    }
    

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    

}
