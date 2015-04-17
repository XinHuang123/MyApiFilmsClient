<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="edu.neu.cs5200.rest.client.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
      <%
      String idIMDB=request.getParameter("idIMDB");
      MyApiFilmsClient client=new MyApiFilmsClient();
      Movie movie=client.findMovieById(idIMDB);
      %>
      <h1><%=movie.getTitle() %></h1>
      <p>
      <img src="<%=movie.getUrlPoster() %>"/>
      <%=movie.getPlot() %>
      </p>

</body>
</html>