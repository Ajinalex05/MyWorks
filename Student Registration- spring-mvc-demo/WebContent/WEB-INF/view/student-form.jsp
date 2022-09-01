<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html><head><title>Student Form</title></head>
<body>
 <form:form action="processForm" modelAttribute="student"> 
 First Name : <form:input type="text" path="firstName"  />
 
 <br><br>
 Last Name : <form:input type="text" path="lastName"  />
 
 <br><br>
 Country:
 <form:select path="country">
     <form:option value="USA"  label="usa"></form:option>
     <form:option value="india"  label="india"></form:option>
     <form:option value="USE"  label="use"></form:option>
     <form:option value="china"  label="china"></form:option>
 </form:select>
 
 <br><br>
 Favorite Language: 
  java<form:radiobutton path="favLanguage" value="java"/>
  c#<form:radiobutton path="favLanguage" value="c###"/>
  php<form:radiobutton path="favLanguage" value="php"/>
  python<form:radiobutton path="favLanguage" value="python"/>
  
  <br><br>
  Operating System used:
  Linux <form:checkbox path="os"  value="linux"/>
  mac <form:checkbox path="os"  value="mac"/>
  ms Windows <form:checkbox path="os"  value="ms Win"/>
 
 
 <br><br>
 <input type="submit" value="submit" />
 
 
 
 </form:form>

</body>

</html>
