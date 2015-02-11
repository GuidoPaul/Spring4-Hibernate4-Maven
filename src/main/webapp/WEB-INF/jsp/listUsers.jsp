<%-- 
    Document   : home
    Created on : Feb 10, 2015, 12:14:48 AM
    Author     : guido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>User List</h1>
            <table border="1">
                <tr>
                    <th>Username</th>
                    <th>Email</th>
                </tr>
                <c:forEach items="${userLists}" var="user">
                    <tr>
                        <td>${user.username}</td>
                        <td>${user.email}</td>
                    </tr>
                </c:forEach>
            </table>
        </div>
    </body>
</html>
