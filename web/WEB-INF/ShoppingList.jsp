<%-- 
    Document   : ShoppingList
    Created on : Jun 27, 2021, 8:15:20 PM
    Author     : 850354
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>My List</title>
    </head>
    <body>
        <h1>Shopping List</h1>
        <form>
            <label>Hello, ${username} </label> 
            <form method="post" action="">
                <a href="ShoppingList?action=logout"> Logout </a>
                <h3> List </h3>
                <label> Add item: </label>
                <input type="text" name="userInput" value=""> 
                <input type="hidden" name="action" value="add">
                <input type="submit" value="Add">
                
                
            </form>
           
            <!--this will show the items to the users-->
            <form action="" method="post">
                <c:forEach items="${myItem}" var="myList">
                   
                    <input type="radio" name="theItem" value="${myItem}"> ${myItem}
                    
                </c:forEach>
                    <br>
                    
                    <input type="hidden" name="action" value="delete">
                    <input type="submit" value="Delete">
                    
                
            </form>
            
            
  
    </body>
</html>
