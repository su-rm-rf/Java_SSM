<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/4/8 0008
  Time: 23:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <div>
        <a href="/todo/addTodo.do">添加Todo</a>
        <ul class="todo_list"></ul>
    </div>

    <script>
        function ajax(method, url, cb) {
            let xhr = new XMLHttpRequest()
            xhr.open(method, url, true)
            xhr.send()
            xhr.onreadystatechange = function () {
                if (xhr.readyState === 4) {
                    cb(xhr.responseText)
                }
            }
        }

        ajax("get", "/todo/queryTodoList.do", function (data) {
            const ul = document.querySelector(".todo_list")
            JSON.parse(data).map(function (todo) {
                const li = document.createElement("li")
                li.innerHTML = todo.text
                ul.appendChild(li)
            })
        })
    </script>
</body>
</html>
