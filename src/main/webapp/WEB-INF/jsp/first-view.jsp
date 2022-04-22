<!DOCTYPE html>
<html>
<head>
    <style>
        table {
            margin: 13% auto;
        }
        th, td {
            border-collapse: collapse;
            border-radius: 10px;
            text-align: center;
        }
        input[type=text] {
            border: 1px solid #9b9696;
            border-radius: 10px;
            padding: 12px 20px;
        }
        input[type=button], input[type=submit], input[type=reset] {
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
    <link rel="icon" href="court.png">
</head>

<body>
<form action="showPlayers" method="post">
    <table>
        <tr>
            <th colspan="2">
                <IMG  src="/court.png" style="height:90px;width:90px">
                <h1>Tennis Scoreboard</h1>
            </th>
        </tr>
        <tr>
            <td>
                <input type="text" name="player1Name" placeholder="Enter Player_1 name"/>
            </td>
            <th rowspan="2">
                <input type="submit" value="Start new match" style="height:90px;width:200px"/>
            </th>
        </tr>
        <tr>
            <td>
                <input type="text" name="player2Name" placeholder="Enter Player_2 name"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>