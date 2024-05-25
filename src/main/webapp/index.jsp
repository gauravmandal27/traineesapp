
<html>
<head>
<style>
.main{
  font-family: consolas;
  border: 2px solid #73AD21;
  border-radius: 25px;
  align-contents:center;
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
<form action="search-trainee" method="post">
<input type="text" id="name" name="name" placeholder="Enter Name " required>
<button type="submit">Search</button>
</form>
<h2> List of Trainees</h2>
    <form action="add-trainee" method="post">
        <label for="id">ID :</label>
        <input type="number" id="id" name="id" required>
          <label for="name">Name :</label>
        <input type="text" id="name" name="name" required>
        <label for="email">Email :</label>
        <input type="email" id="email" name="email" required>
        <button type="submit">Add Trainee</button>
    </form>
</div>


</body>
</html>
