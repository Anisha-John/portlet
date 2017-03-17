<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@taglib prefix = "c" uri ="http://java.sun.com/jsp/jstl/core" %>

<table border ="2">

    <tr>
        <th>Scores</th>
    </tr>

    <c:forEach items = "${liveScoreCards}" var = "liveScoreCard">
        <tr>
           <td>${liveScoreCard.teamOneName} (${liveScoreCard.teamOneScore}) Vs ${liveScoreCard.teamTwoName} (${liveScoreCard.teamTwoScore})</td>
        </tr>
    </c:forEach>

</table>

</body>
</html>