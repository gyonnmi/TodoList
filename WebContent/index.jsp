<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<%@taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>To-do List</title>
<link rel="stylesheet" href="css/index.css" />
</head>
<body>

<!-- Connection, DB Connect -->
<sql:setDataSource
	var="connect"
	driver="com.mysql.jdbc.Driver"
	url="jdbc:mysql://localhost:3306/todo-list?useSSL=false"
	user="root"
	password="1234"
/>

<div class="wrap">

	<h1 class="title">TO-DO LIST</h1>
	
	<div class="addTodo">
		<form action="addTodos.do" method="post" id="todoForm">
			<input type="text" placeholder="할 일을 입력하세요." />
			<input type="submit" value="+" class="addBtn" />
		</form>
	</div>
	
	<sql:query var="result" dataSource="${connect }">
		select * from todo order by todo_id asc
	</sql:query>
	
	<c:forEach var="todo" items="${result.rows }" varStatus="status">
		<p>${todo.todo_id }</p>
		<p>${todo.todo_todos }</p>
		<input type="checkbox" />
	</c:forEach>
</div>

</body>
</html>