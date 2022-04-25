<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            margin: 13% auto;
        }
        th{
            background-color: #cecbcb;
        }
        th, td {
            border-collapse: collapse;
            border-radius: 10px;
            text-align: center;
            padding: 8px 16px;
            text-decoration: none;
            margin: 2px 2px;
        }
        button {
            background-color: #5dc462;
            border: none;
            border-radius: 12px;
            color: white;
            padding: 16px 32px;
            text-decoration: none;
            margin: 2px 2px;
            cursor: pointer;
        }
    </style>
    <title>Tennis Scoreboard</title>
    <link rel="icon" href="tennis-ball.png">
</head>
<body>
<table>
    <tr>
        <td colspan="6">
            <IMG  src="/tennis-ball.png" style="height:90px;width:90px">
            <h1>Match page</h1>
        </td>
    </tr>
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
            <td style="text-align: center;"><form action="showScoreboard" method="post" >
                <button type="submit" name="whoGetPoint" value="${match.getPlayersList().indexOf(player)}">
                    Take a point</button>
            </form> </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>