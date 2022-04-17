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
        <td style="text-align: center;">${match.points[1]}</td>
        <td style="text-align: center;">0</td>
        <td style="text-align: center;">0</td>
        <td style="text-align: center;">0</td>
        <td><input type="button" name="point1">Player1 take a point</td>
        <td><form action="">
            <input type="submit" name="point1" value="Player1 take a point">
        </form> </td>
    </tr>
    <tr>
        <td>PLAYER</td><td>POINTS</td><td>SET 1</td><td>SET 2</td><td>SET 3</td>
    </tr>
    <tr>
        <td>Player 2</td>
        <td style="text-align: center;">00</td>
        <td style="text-align: center;">0</td>
        <td style="text-align: center;">0</td>
        <td style="text-align: center;">0</td>
        <td><button>Player2 take a point</button></td>
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