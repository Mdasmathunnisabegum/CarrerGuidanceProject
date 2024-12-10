<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Admin Home</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <style>
    
      body{
      margin: 0;
      padding: 0;
      min-height: 100vh;
      background: rgb(17 24 39);
      justify-content: center;
      align-items: center;
      font-family: consolas;
  }
  
  .container1{
      display: flex;
      justify-content: center;
      
  }
  
  .container1 .card{
      position: relative;
      cursor: pointer;
      padding: 30px;
  }
  
  .container1 .card .face{
      height: 300px;
      transition: 0.5s;
  }
  
  .container1 .card .face.face1{
      position: relative;
      background: rgb(17 24 39);
      display: flex;
      justify-content: center;
      align-items: center;
      z-index: 1;
      transform: translateY(200px);
  }
  
  .container1 .card:hover .face.face1{
      background: #32be8f;
      transform: translateY(0);
  }
  
  .container1 .card .face.face1 .content{
      opacity: 0.2;
      transition: 0.5s;
  }
  
  .container1 .card:hover .face.face1 .content{
      opacity: 1;
  }
  
  .container1 .card .face.face1 .content img{
      max-width: auto;
  }
  
  .container1 .card .face.face1 .content h3{
      margin: 10px 0 0;
      padding: 10px;
      color: #fff;
      text-align: center;
      font-size: 1.5em;
  }
  
  .container1 .card .face.face2{
      position: relative;
      background: #fff;
      display: flex;
      justify-content: center;
      align-items: center;
      padding: 20px;
      box-shadow: 0 20px 20px rgba(255, 255, 255, 0.764);
      transform: translateY(-100px);
  }
  
  .container1 .card:hover .face.face2{
      transform: translateY(0);
  }
  
  .container1 .card .face.face2 .content p{
      margin: 0;
      padding: 0;
  }
  
  .container1 .card .face.face2 .content a{
      margin: 15px 0 0;
      display:  inline-block;
      text-decoration: none;
      font-weight: 900;
      color: rgb(17 24 39);
      padding: 5px;
      border: 1px solid #32be8f;
  }
  
  .container1 .card .face.face2 .content a:hover{
      background: rgb(17 24 39);
      color: #32be8f;
  }
  .projectlogo
  {
  width : 50%;
  }
    </style>
</head>
<body>
    <jsp:include page="adminheader.jsp"/>

<img src="/img/adminhome.jpg" alt="Admin Home" width="1500px">


<div class="container1">
      <div class="card">
          <div class="face face1">
              <div class="content">
                  <img src="">
                  <h3>Mentor</h3>
              </div>
          </div>
          <div class="face face2">
              <div class="content">
                  <p>view all the project guides,<br> who are involved in your organization</p>
                      <a href="viewallmentors">View</a>
              </div>
          </div>
      </div>
      <div class="card">
          <div class="face face1">
              <div class="content">
                  <img src=" ">
                  <h3>Students</h3>
              </div>
          </div>
          <div class="face face2">
              <div class="content">
                  <p>view all the Students,<br> who are involved in your organization</p>
                      <a href="viewallstudents">View</a>
              </div>
          </div>
      </div>
      <div class="card">
          <div class="face face1">
              <div class="content">
                  <img class = "projectlogo"src=""><br>
                  <h3>Projects</h3>
              </div>
          </div>
          <div class="face face2">
              <div class="content">
                  <p>view all the projects,<br> which needs a solution from students.</p>
                      <a href="viewallprojects">View</a>
              </div>
          </div>
      </div>
  </div>

<jsp:include page="footer.jsp"/>
</body>
</html>