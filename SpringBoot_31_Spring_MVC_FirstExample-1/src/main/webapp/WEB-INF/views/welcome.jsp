<%@page import="java.util.Date"%>
<html>
<head>
<body bgcolor="pink">

<center>
<b>
<h2>WelCome To Naresh It</h2>
<%
 response.addHeader("Refresh", "1");
 out.print(new Date());
%></b>
</center>

</body>
</head>
</html>