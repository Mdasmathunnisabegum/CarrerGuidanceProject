<%@ page contentType="text/html; charset=ISO-8859-1" isELIgnored="false"%> 
<%@ taglib uri="jakarta.tags.core" prefix="c"%> 

<!DOCTYPE html>
 <html lang="en" title="Coding design">
 
 <head>
     <meta charset="UTF-8">
     <meta name="viewport" content="width=device-width, initial-scale=1.0">
     <meta http-equiv="X-UA-Compatible" content="ie=edge">
     <title>View All Projects</title>
     <link rel="stylesheet" href="css/table.css">
 </head>
 
 <body>
 
     <main class="table">
         <section class="table__header">
             <h1><a onclick="history.back()">View All Projects</a></h1>
             <div class="input-group">
                 <input type="search" placeholder="Search Data...">
                 <img src="img/magnifying-glass.jpg" alt="">
             </div>
             <div class="export__file">
                 <label for="export-file" class="export__file-btn" title="Export File"></label>
                 <input type="checkbox" id="export-file">
                 <div class="export__file-options">
                     <label>Export As &nbsp; &#10140;</label>
                     <label for="export-file" id="toPDF">PDF <img src="images/pdf.png" alt=""></label>
                     <label for="export-file" id="toJSON">JSON <img src="images/json.png" alt=""></label>
                     <label for="export-file" id="toCSV">CSV <img src="images/csv.png" alt=""></label>
                     <label for="export-file" id="toEXCEL">EXCEL <img src="images/excel.png" alt=""></label>
                 </div>
             </div>
         </section>
         <section class="table__body">
             <table>
                 <thead>
                     <tr>
                         <th> Id <span class="icon-arrow">&UpArrow;</span></th>
                         <th> Name <span class="icon-arrow">&UpArrow;</span></th>
                         <th> Action <span class="icon-arrow">&UpArrow;</span></th>
                     </tr>
                 </thead>
                 <tbody>
                 <c:forEach items="${projectlist}"  var="m">
                     <tr>
                         <td> ${m.id} </td>
                         <td> <img src=" " alt="">${m.name}</td>
                         <td> <a href="viewprojectbyid/${m.id}"><strong> View </strong></a></td>
                     </tr>
                     
                      </c:forEach> 
                     
                 </tbody>
             </table>
         </section>
     </main>
 </body>
 <script src="js/table.js">
    </script>



</html>	