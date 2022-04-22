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
        tr, td, th {
            border-collapse: collapse;
            border-radius: 10px;
            text-align: center;
            padding: 8px 16px;
            text-decoration: none;
            margin: 2px 2px;
        }
    </style>
    <title>Tennis Scoreboard</title>
    <link rel="icon" href="trophy.png">
</head>
<body>
<table>
    <tr>
        <td colspan="6">
            <IMG  src="/trophy.png" style="height:90px;width:90px">
            <h1>Winner is</h1>
            <h1>${match.getWinner().getName()}</h1>
        </td>
    </tr>
    <tr>
        <td>
            <table>
                <tr>
                    <th>PLAYER</th><th>POINTS</th><th>SET 1</th><th>SET 2</th><th>SET 3</th>
                </tr>
                <c:forEach var="player" items="${match.getPlayersList()}">
                    <tr>
                        <td>${player.getName()}</td>
                        <td style="text-align: center;">${match.getPointsList().get(player.getPointsTaken())}</td>
                        <c:forEach var="score" items="${player.getPlayerSetsScores()}">
                            <td style="text-align: center;">${score}</td>
                        </c:forEach>
                    </tr>
                </c:forEach>
            </table>
        </td>
    </tr>
</table>
</body>
</html>