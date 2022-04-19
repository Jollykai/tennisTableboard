<!DOCTYPE html>
<html>
<body>
<h1>Match page</h1>
<br><br>
<br><br>
<%--${match.getPlayer1().getName()}--%>
<%--${match.getPoints().get(match.getPlayer1().getPointsTaken())}--%>
<%--${match.getPlayer1().getPlayerSetsScores().get(0)}--%>
<%--${match.getPlayer1().getPlayerSetsScores().get(1)}--%>
<%--${match.getPlayer1().getPlayerSetsScores().get(2)}--%>
<table border="1">
    <tr>
        <td>${match.getPlayer1().getName()}</td>
        <td style="text-align: center;">${match.getPoints().get(match.getPlayer1().getPointsTaken())}</td>
        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(0)}</td>
        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(1)}</td>
        <td style="text-align: center;">${match.getPlayer1().getPlayerSetsScores().get(2)}</td>
        <td><form action="match" modelAttribute= "match" method="post">
            <input type="submit" name="1point" value="Player1 take a point">
        </form> </td>
    </tr>
    <tr>
        <td>PLAYER</td><td>POINTS</td><td>SET 1</td><td>SET 2</td><td>SET 3</td>
    </tr>
    <tr>
        <td>${match.getPlayer2().getName()}</td>
        <td style="text-align: center;">${match.getPoints().get(match.getPlayer2().getPointsTaken())}</td>
        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(0)}</td>
        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(1)}</td>
        <td style="text-align: center;">${match.getPlayer2().getPlayerSetsScores().get(2)}</td>
        <td><form action="match" modelAttribute= "match" method="post">
            <input type="submit" name="2point" value="Player2 take a point">
        </form> </td>
    </tr>
</table>

</body>
</html>