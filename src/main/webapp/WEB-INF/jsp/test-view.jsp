<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tennis Scoreboard</title>
</head>
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
            <td style="text-align: center;"><form action="showPlayers" method="put" >
                <button type="submit" name="whoGetPoint" value="${match.getPlayersList().indexOf(player)}">
                    Take a point</button>
            </form> </td>
        </tr>
    </c:forEach>


</table>

</body>
</html>