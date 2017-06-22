<%-- 
    Document   : login
    Created on : Jun 22, 2017, 11:15:33 AM
    Author     : ARIPH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login User Member</title>
    </head>
    <body>
        <center><h1>Login User Member</h1></center>
        <form action="UserController?data=login&proses=login-user" method="post">
            <table style="margin:20px auto;">
		<tr>
                    <td>Username</td>
                    <td><input type="text" name="username"></td>
		</tr>
		<tr>
                    <td>Password</td>
                    <td><input type="text" name="password"></td>
		</tr>
                <tr>
                    <td></td>
                    <td><input type="submit" value="Login"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>

