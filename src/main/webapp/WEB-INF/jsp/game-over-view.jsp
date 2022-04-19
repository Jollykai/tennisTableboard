<!DOCTYPE html>
<html>
<body>
<h1>Match page</h1>
<br><br>
<br><br>

<table border="1">
    <tr>
        <td>${match.player1Name}</td>
        <td style="text-align: center;">${match.points[match.player1Points]}</td>
        <td style="text-align: center;">${match.player1SetScores[0]}</td>
        <td style="text-align: center;">${match.player1SetScores[1]}</td>
        <td style="text-align: center;">${match.player1SetScores[2]}</td>
    </tr>
    <tr>
        <td>PLAYER</td><td>POINTS</td><td>SET 1</td><td>SET 2</td><td>SET 3</td>
    </tr>
    <tr>
        <td>Player 2</td>
        <td style="text-align: center;">${match.points[match.player2Points]}</td>
        <td style="text-align: center;">${match.player2SetScores[0]}</td>
        <td style="text-align: center;">${match.player2SetScores[1]}</td>
        <td style="text-align: center;">${match.player2SetScores[2]}</td>
    </tr>
</table>

<h1>GAME OVER</h1><br>
Winner is - ${match.winner}!
</body>
</html>