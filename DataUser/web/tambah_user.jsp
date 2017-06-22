<%-- 
    Document   : tambah_user
    Created on : Jun 21, 2017, 10:23:52 PM
    Author     : ARIPH
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data User Member</title>
    </head>
    <body>
        <center><h1>Tambah Data User Member</h1></center>
        <form action="UserController?data=user&proses=input-user" method="post">
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
                    <td>Nama</td>
                    <td><input type="text" name="nama"></td>
		</tr>
		<tr>
                    <td>Alamat</td>
                    <td><input type="text" name="alamat"></td>
		</tr>
		<tr>
                    <td>Tanggal Lahir</td>
                    <td><input type="text" name="tanggal"></td>
		</tr>
		<tr>
                    <td>Email</td>
                    <td><input type="text" name="email"></td>
		</tr>
                <tr>
                    <td>Telp</td>
                    <td><input type="text" name="telp"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Tambah"></td>
		</tr>
            </table>
	</form>	
    
    </body>
</html>
