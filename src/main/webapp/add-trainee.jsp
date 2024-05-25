<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<form action="add-trainee" method="post">
          <label for="name">Name :</label>
        <input type="text" id="name" name="name" required>
        <label for="email">Email :</label>
        <input type="email" id="email" name="email" required>
         <label for="location">Location :</label>
         <input type="text" id="location" name="location" required>
        <button type="submit">Add Trainee</button>
    </form>
</body>
</html>