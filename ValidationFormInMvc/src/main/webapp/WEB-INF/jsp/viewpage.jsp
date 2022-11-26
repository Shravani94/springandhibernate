<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<html>  
<head>  
<style>  
.error{color:red}  
</style>  
</head>  
<body>  
<form:form action="helloagain" modelAttribute="emp">  
UserName: <form:input path="name"/> <br><br>  
<form:errors path="name" cssClass="error"></form:errors><br><br>
MobileNumber(*): <form:input path="mobileNumber"/>    
<form:errors path="pass" cssClass="error"/><br><br>  
MailId(*):<form:input path="MailId"/><br><br>
<form:errors path="MailId" cssClass="error"/><br><br>
<input type="submit" value="submit">  
</form:form>  
</body>  
</html>  