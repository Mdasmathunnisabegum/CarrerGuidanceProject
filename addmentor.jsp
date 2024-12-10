<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en" dir="ltr">
  <head>
    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Mentor</title>
      <link href="https://unpkg.com/tailwindcss@^1.0/dist/tailwind.min.css" rel="stylesheet">
     <style>
        @import url('https://fonts.googleapis.com/css2?family=Poppins:wght@200;300;400;500;600;700&display=swap');
*{
  margin: 0;
  padding: 0;
  box-sizing: border-box;
  font-family: 'Poppins',sans-serif;
}
body{
  height: 100vh;
  display: flex;
  justify-content: center;
  align-items: center;
  padding: 10px;
  background: rgb(17 24 39);
}
button
{
  top: 95px;
  right: 450px;
  height: 45px;
  width : 300px;
  outline: none;
  border-bottom-width: 2px;
  font-weight: 400;
  transition: all 0.5s ease;
	transition-duration: 0.4s;
	display: block;
  border-radius: 5px;
	font-size: 1.2rem;
	color: rgb(17 24 39);
  border: 1px solid #32be8f;
  border-bottom-width: 2px;
	font-family: 'Poppins', sans-serif;
	margin: 1rem 0;
	cursor: pointer;
	position: absolute; 
  }
  
button:hover {
  border:none;
  color: #32be8f;
  background-color: rgb(17 24 39);

  }
.container{
  max-width: 700px;
  width: 100%;
  background-color: #fff;
  padding: 25px 30px;
  border-radius: 5px;
  box-shadow: 0 5px 10px rgba(0,0,0,0.15);
}
.container .title{
  font-size: 25px;
  font-weight: 500;
  position: relative;
}
.container .title::before{
  content: "";
  position: absolute;
  left: 0;
  bottom: 0;
  height: 3px;
  width: 30px;
  border-radius: 5px;
  background: rgb(17 24 39);
}
.content form .user-details{
  display: flex;
  flex-wrap: wrap;
  justify-content: space-between;
  margin: 20px 0 12px 0;
}
form .user-details .input-box{
  margin-bottom: 15px;
  width: calc(100% / 2 - 20px);
}
form .input-box span.details{
  display: block;
  font-weight: 500;
  margin-bottom: 5px;
}
.user-details .input-box input{
  height: 45px;
  width: 100%;
  outline: none;
  font-size: 16px;
  border-radius: 5px;
  padding-left: 15px;
  border: 1px solid #32be8f;
  border-bottom-width: 2px;
  transition: all 0.3s ease;
}
.user-details .input-box input:focus,
.user-details .input-box input:valid{
  border-color: #32be8f;
}
 form .gender-details .gender-title{
  font-size: 20px;
  font-weight: 500;
 }
 form .category{
   display: flex;
   width: 80%;
   margin: 14px 0 ;
   justify-content: space-between;
 }
 form .category label{
   display: flex;
   align-items: center;
   cursor: pointer;
 }
 form .category label .dot{
  height: 18px;
  width: 18px;
  border-radius: 50%;
  margin-right: 10px;
  background: rgb(17 24 39);
  border: 5px solid transparent;
  transition: all 0.3s ease;
}
 #dot-1:checked ~ .category label .one,
 #dot-2:checked ~ .category label .two,
 #dot-3:checked ~ .category label .three{
   background: #32be8f;
   border-color: rgb(17 24 39);
 }
 form input[type="radio"]{
   display: none;
 }
 form .button{
   height: 45px;
   margin: 35px 0
 }
 form .button input{
   height: 100%;
   width: 100%;
   outline: none;
  border-bottom-width: 2px;
  font-weight: 400;
  transition: all 0.5s ease;
	transition-duration: 0.5s;
	display: block;
  border-radius: 5px;
	font-size: 1.2rem;
	color: rgb(17 24 39);
  border: 1px solid #32be8f;
  border-bottom-width: 2px;
	font-family: 'Poppins', sans-serif;
	margin: 1rem 0;
	cursor: pointer;
 }
 form .button input:hover{
  /* transform: scale(0.99); */
  border:none;
  color: #32be8f;
  background-color: rgb(17 24 39);
  }
 @media(max-width: 584px){
 .container{
  max-width: 100%;
}
form .user-details .input-box{
    margin-bottom: 15px;
    width: 100%;
  }
  form .category{
    width: 100%;
  }
  .content form .user-details{
    max-height: 300px;
    overflow-y: scroll;
  }
  .user-details::-webkit-scrollbar{
    width: 5px;
  }
  }
  @media(max-width: 459px){
  .container .content .category{
    flex-direction: column;
  }
}
#dept,#gender{
  width: 300px; 
  height: 45px; 
  font-size: 16px; 
  border-radius: 5px; 
  padding-left: 15px; 
  border: 1px solid #32be8f; 
  border-bottom-width: 2px; 
  transition: all 0.3s ease;
  font-family: 'Poppins','sans-serif';
}
     </style>
   </head>
<body>

  <div class="container">
    <div class="title">Add Mentor</div>
    
    <div class="content">
      <form method="post" action="insertmentor">
        <div class="user-details">
          <div class="input-box">
            <span class="details">Full Name</span>
            <input type="text" placeholder="Enter Project Guide name" required name="name">
          </div>
          <div class="input-box">
            <span class="details">ID</span>
            <input type="number" placeholder="Enter Project Guide ID" required name="id">
          </div>
          <div class="input-box">
            <span class="details">Email</span>
            <input type="email" placeholder="Enter Project Guide email" required name="email">
          </div>
          <div class="input-box">
            <span class="details">Phone Number</span>
            <input type="number" placeholder="Enter Project Guide number" required maxlength=10 minlength=10 name="contact">
          </div>
          <div class="input-box">
            <span class="details">Password</span>
            <input type="password" placeholder="Enter Project Guide password" required name="pwd">
          </div>
          <div class="input-box">
            <span class="details">Gender :</span>
            <select name = "gender" id = "gender" required="required">
              <option value="">---Select---</option>
              <option value="Male">MALE</option>
              <option value="Female">FEMALE</option>
              <option value="Others">Prefer Not To Say</option>
            </select>
          </div>
          <div class="input-box">
            <span class="details">Date of Birth</span>
            <input type="date" placeholder="Enter Your Date of Birth" required name="dob" max="1993-12-31">
          </div>
          <div class="input-box">
            <span class="details">Choose the Department :</span>
            <select name = "dept" id = "dept" required="required">
              <option value="">---Select---</option>
              <option value="cseh">CSE - HONORS</option>
              <option value="ece">ECE</option>
              <option value="cse">CSE</option>
              <option value="csit">CS&IT</option>
              <option value="mech">MECHANICAL</option>
              <option value="civil">CIVIL</option>
            </select>
          </div>
        </div>
        <div class="button">
          <input type="submit" value="Add Mentor">
        </div>     
      </form>
      <div class="button">
        <a href="adminhome"><button>Back Home</button></a>
      </div>
    </div>
  </div>
</body>
</html>