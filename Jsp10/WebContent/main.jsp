<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<body>
        <%!
          int id;
        String name;
        
        %>
        <%
        id=Integer.parseInt(request.getParameter("id"));
        name=request.getParameter("name");
        %>
        <jsp:useBean id="be" class="Jsp10.Bean" scope="application"/>
        
        <jsp:setProperty property="id" name="be" value="<%=id %>"/>
        <jsp:setProperty property="name" name="be" value="<%=name %>"/>
        
        Employee id:<jsp:getProperty property="id" name="be"/>
        Employee name:<jsp:getProperty property="name" name="be"/>
</body>
</html>