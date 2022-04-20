<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<body>
<h1>TEST page!</h1>
<br><br>
<br><br>

<table border="1">
    <tr>
        <th>PLAYER</th><th>POINTS</th><th>SET 1</th><th>SET 2</th><th>SET 3</th><th>TAKE POINT</th>
    </tr>
    <c:forEach var="player" items="${match.getPlayersList()}">
        <tr>
            <td>${player.getName()}</td>
            <td style="text-align: center;">${match.getPointsList().get(player.getPointsTaken())}</td>
            <c:forEach var="score" items="${player.getPlayerSetsScores()}">
                <td style="text-align: center;">${score}</td>
            </c:forEach>
            <td><form action="showPlayers" method="put">
                <input type="submit" name="${match.getPlayersList().indexOf(player)}" value="Take a point">
            </form> </td>
        </tr>


    </c:forEach>

<%--    <c:forEach var="lang" items="${employee.languages}">--%>
<%--    <li>    ${lang} </li>--%>
<%--    </c:forEach>--%>
<%--    <tr>--%>
<%--        <td></td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>$${match.getPlayersList().get(0).getName()}</td>--%>
<%--        <td style="text-align: center;">${match.getPoints().get(match.getPlayer1().getPointsTaken())}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(0)}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(1)}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(2)}</td>--%>
<%--        <td><form action="match" modelAttribute= "match" method="post">--%>
<%--            <input type="submit" name="1point" value="Player1 take a point">--%>
<%--        </form> </td>--%>
<%--    </tr>--%>
<%--    <tr>--%>
<%--        <td>${match.getPlayersList().get(1).getName()}</td>--%>
<%--        <td style="text-align: center;">${match.getPoints().get(match.getPlayer2().getPointsTaken())}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(0)}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(1)}</td>--%>
<%--        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(2)}</td>--%>
<%--        <td><form action="match" modelAttribute= "match" method="post">--%>
<%--            <input type="submit" name="2point" value="Player2 take a point">--%>
<%--        </form> </td>--%>
<%--    </tr>--%>
</table>

</body>
</html>