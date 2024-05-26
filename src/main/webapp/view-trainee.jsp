<%@page import="com.wiley.traineesapp.model.Trainee" %>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
</head>
<body>
<button><a href="index.jsp">Main Menu</a></button>
   <div>
       <h2>Trainee Saved Successfully</h2>
       <p>ID: ${trainee.getId()}</p>
       <p>Name: ${trainee.getName()}</p>
       <p>Email:${trainee.getEmail()}</p>
        <p>Location:${trainee.getLocation()}</p>
       </div>
</body>
</html>