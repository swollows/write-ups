
<%@ page language="java" contentType="text/html; charset=UTF-8"

pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
  </head>
  <body>
    <h1>Login Page</h1>
    <form action="/loginProcess" method="post">
      <table>
        <tr>
          <td>username</td><td><input type="text" name="username" placeholder="username"></td>
        </tr>
        <tr>
          <td>password</td><td><input type="password" name="password" placeholder="password"></td>
        </tr>
        <tr>
          <td colspan="2" align="right"><button type="submit">Login</button></td>
        </tr>
      </table>
    </form>
  </body>
</html>