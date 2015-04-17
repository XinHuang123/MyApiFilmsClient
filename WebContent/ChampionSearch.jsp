<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="edu.neu.cs5200.rest.client.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Test</h1>
     <table>
     <%
     MyApiChampionsClient client=new MyApiChampionsClient();
    // champion champ = new champion();
    champion champ = client.findChampionById(50);
    //Champion champ = client.findChampionByName();
    final  String FIND_IMAGE_BY_NAME="http://ddragon.leagueoflegends.com/cdn/5.2.1/img/champion/champion_name.png ";
 	String url=FIND_IMAGE_BY_NAME.replace("champion_name",champ.getName());
 	//System.out.println(url);
    
    
    // for(champion champ: champions)
    	
     {
    	 %>
    	 <tr>
    	     <td><%=champ.getId() %></td> 
    	     <td><%=champ.getName() %></td>    	      
    	     <td><%=champ.getTitle() %></td>    	          	    
    	     <td><%=champ.getBlurb() %></td>
    	     <td><%=champ.getLore()%></td>      
    	     
    	         	       	      
    	         	      
    	     <td><img src="<%=url %>"/></td> 
    	     
    	     

    	       	        	         	        	     
    	 </tr>
    	 <%}
     %>
     </table>
</body>
</html>