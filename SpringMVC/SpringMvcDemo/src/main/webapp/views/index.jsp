<%@page language="java" contentType="text/html; charset=UTF-8" %>

<!DOCTYPE html>
<html>
<head>
    <title>School Student Details</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>

<div class="card">
    <h2>✨ School Student Details ✨</h2>

    <form action="addAlien" method="post">
        
        <div class="input-group">
            <label for="aid">Enter ID</label>
            <input type="number" id="aid" name="aid" required>
        </div>

        <div class="input-group">
            <label for="aname">Enter Name</label>
            <input type="text" id="aname" name="aname" required>
        </div>

        <button type="submit">Fetch Details</button>

    </form>
</div>

</body>
</html>
