<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
  <%@page import="model.TblProductocl2" %>

  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
  <%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1 align="center">Listado de Productos</h1>

<h2 align="center">
<a href="InsertarProducto.jsp">Registrar Producto</a>
</h2>

<table border="2" align="center">

<tr>
<td>Codigo</td>
<td>Nombre</td>
<td>Precio Venta</td>
<td>Precio Compra</td>
<td>Estado</td>
<td>Descripcion</td>
</tr>

<%
List<TblProductocl2> listadoproducto = (List<TblProductocl2>)request.getAttribute("listadoproductos");
if(listadoproducto !=null){
    for(TblProductocl2 pro:listadoproducto){
        %>
        <tr>
        <td><%=pro.getIdproductocl2() %></td>
        <td><%=pro.getNombrecl2() %></td>
        <td><%=pro.getPrecioventacl2() %></td>
        <td><%=pro.getPreciocompcl2() %></td>
        <td><%=pro.getEstadocl2() %></td>
        <td><%=pro.getDescripcl2() %></td>
        </tr>

        <% 
    }//fin del for
    %>
    <%
}//fin de la condicion
%>

</table>
</body>
</html>