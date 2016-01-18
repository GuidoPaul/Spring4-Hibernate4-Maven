<%-- 
    Document   : home
    Created on : Feb 10, 2015, 12:14:48 AM
    Author     : guido
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set var="cp" value="${pageContext.request.servletContext.contextPath}" scope="request"/>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div align="center">
            <h1>Add User</h1>

            <sf:form commandName="user" action="${cp}/saveUser">
                Username:<sf:input path="username"/><br/>
                Password:<sf:input path="password"/><br/>
                Email:<sf:input path="email"/><br/>
                <input type="submit"/>
            </sf:form>

        </div>
    </body>
</html>
