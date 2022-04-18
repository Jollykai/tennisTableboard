<!DOCTYPE html>
<html>
<body>
<h1>Match page</h1>
<br><br>
<%--<input type = "button" value = "Start match" onclick="window.location.href='/match'">--%>
Place where game begin
<br><br>

<table border="1">
    <tr>
        <td>${match.player1Name}</td>
        <td style="text-align: center;">${match.points[match.player1Points]}</td>
        <td style="text-align: center;">${match.player1Set1Games}</td>
        <td style="text-align: center;">${match.player1Set2Games}</td>
        <td style="text-align: center;">${match.player1Set3Games}</td>
        <td><form action="match" modelAttribute= "match" method="post">
            <input type="submit" name="1point" value="Player1 take a point">
        </form> </td>
    </tr>
    <tr>
        <td>PLAYER</td><td>POINTS</td><td>SET 1</td><td>SET 2</td><td>SET 3</td>
    </tr>
    <tr>
        <td>Player 2</td>
        <td style="text-align: center;">${match.points[match.player2Points]}</td>
        <td style="text-align: center;">${match.player2Set1Games}</td>
        <td style="text-align: center;">${match.player2Set2Games}</td>
        <td style="text-align: center;">${match.player2Set3Games}</td>
        <td><form action="match" modelAttribute= "match" method="post">
            <input type="submit" name="2point" value="Player2 take a point">
        </form> </td>
    </tr>
</table>

<%! int clicks = 0; %>

<%
    String param = request.getParameter("integer");

    try
    {
        int i = Integer.parseInt(param);

        clicks ++;
    }
    catch (NumberFormatException e)
    {
    }
%>
<p>Number of clicks untill now: <%= clicks %> </p>

<form action="">
    <input name="integer" value="1"/>
    <input type="submit" value="submit" />
</form>

</body>
</html>