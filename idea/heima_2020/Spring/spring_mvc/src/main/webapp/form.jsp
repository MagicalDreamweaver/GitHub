<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/quick14" method="post">
    用户名：<input type="text" name="userList[0].username" /> <br/>
    年龄：<input type="text" name="userList[0].age" /><br/>
    用户名：<input type="text" name="userList[1].username" /><br/>
    年龄：<input type="text" name="userList[1].age" /><br/>
    <input type="submit" value="提交" /><br/>
</form>
</body>
</html>
