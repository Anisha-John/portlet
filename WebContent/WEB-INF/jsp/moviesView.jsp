<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<table border ="2">
    <tr>
        <th>Id</th>
        <th>Name</th>
    </tr>
   <c:forEach items = "${movies}" var = "movie">
        <tr>
            <td>${movie.id}</td>
            <td>${movie.name}</td>
        </tr>
    </c:forEach>
</table>