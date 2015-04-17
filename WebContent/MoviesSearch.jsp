<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="edu.neu.cs5200.rest.client.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <table>
     <%
     MyApiFilmsClient client=new MyApiFilmsClient();
     Movie[] movies=client.findMovieByTitle("star wars");
     for(Movie movie: movies)
     {
    	 %>
    	 <tr>	    
             <td><a href="MovieDetails.jsp?idIMDB=movie.getIdIMDB"> <%=movie.getTitle() %></a></td>    	     
    	     <td><%=movie.getPlot() %></td>
    	     <td><%=movie.getIdIMDB() %></td>
    	     <td><%=movie.getTitle() %></td>
    	     <td><img src="<%=movie.getUrlPoster() %>"/></td>
    	     
    	     
       
    	        	     
    	 </tr>
    	 <%
     }
     %>
     </table>
</body>
</html>