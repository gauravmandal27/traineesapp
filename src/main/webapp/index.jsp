<%@ page import="com.wiley.traineesapp.dto.TraineeDto" %>
<%@ page import="java.util.List" %>
<%@page isELIgnored="false" %>
<html>
<head>
<style>
.main{
  font-family: consolas;
  border: 2px solid #73AD21;
  border-radius: 25px;
  align-contents:center;
  text-align: center;
  width: 500px;
  margin: 0 auto;
  background: #000;
  color: #fff;
}
table, th, td {
  border: 1px solid white;
  border-collapse: collapse;
}
th, td {
  background-color: #96D4D4;
}
</style>
</head>
<body>
<div class=main>
<h1 >Welcome To Wiley!!!</h1>
<h3><a href="view-all">View All Trainees</a> | <a href="add-trainee.jsp">Register Trainees</a></h3>

</div>
<div>
<h1></h1>
    <form action="add-trainee" method="post">
              <label for="name">Name :</label>
            <input type="text" id="name" name="name" required>
            <label for="email">Email :</label>
            <input type="email" id="email" name="email" required>
             <label for="location">Location :</label>
             <input type="text" id="location" name="location" required>
            <button type="submit">Add Trainee</button>
        </form>
</div>
<form action="search-trainee" method="post">
<input type="number" id="id" name="id" placeholder="Enter ID" required>
<button type="submit">Search</button>
</form>
<h2> List of Trainees</h2>
  <div>
           <% List<TraineeDto> trainees =(List<TraineeDto>)request.getAttribute("trainees"); %>
           <%if(trainees!=null){%>
           <h2>Trainees</h2>
                  <table>
                      <thead>
                      <tr>
                          <th>ID</th>
                          <th>Name</th>
                          <th>Email</th>
                          <th>Location</th>
                      </tr>
                      </thead>
                      <tbody>
          <%for(TraineeDto trainee : trainees) { %>
               <tr>
                   <td><%= trainee.id()%></td>
                   <td><%= trainee.name() %></td>
                   <td><%= trainee.email() %></td>
                   <td><%= trainee.location() %></td>
                    <td><button onclick="deleteTrainee(<%= trainee.id() %>)" class="btn btn-danger">Delete</a></td>
               </tr>
           <% }}%>
           </tbody>
       </table>
       </div>
</body>
       <script>
         let deleteTrainee = (id)=>{
                   if(confirm("Deleting trainee with id: "+id)){
                       window.location.href = "delete-trainee?id=" + id;
                   }
               }
       </script>
</html>
