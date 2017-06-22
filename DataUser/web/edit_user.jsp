<%-- 
    Document   : edit_user
    Created on : Jun 22, 2017, 1:41:53 AM
    Author     : ARIPH
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datauser.model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tambah Data User Member</title>
    </head>
    <body>
        <center><h1>Tambah Data User Member</h1></center>
        <form action="UserController?data=user&proses=update-user" method="post">
            <table style="margin:20px auto;">
            <%
                String id = request.getParameter("id");
                UserModel km = new UserModel();
                km.setId(id);
                List<UserModel> data = new ArrayList<UserModel>();
                data = km.cariID(); 
                if (data.size() > 0) {

            %>
                <tr>
                    <td>Username</td>
                    <td><input type="text" name="username" value="<%=data.get(0).getUsername()%>"></td>
		</tr>
		<tr>
                    <td>Password</td>
                    <td><input type="text" name="password" value="<%=data.get(0).getPassword()%>"></td>
		</tr>
                <tr>
                    <td>Nama</td>
                    <td><input type="text" name="nama" value="<%=data.get(0).getNama()%>"></td>
		</tr>
		<tr>
                    <td>Alamat</td>
                    <td><input type="text" name="alamat" value="<%=data.get(0).getAlamat()%>"></td>
		</tr>
		<tr>
                    <td>Tanggal Lahir</td>
                    <td><input type="text" name="tanggal" value="<%=data.get(0).getTanggal()%>"></td>
		</tr>
		<tr>
                    <td>Email</td>
                    <td><input type="text" name="email" value="<%=data.get(0).getEmail()%>"></td>
		</tr>
                <tr>
                    <td>Telp</td>
                    <td><input type="text" name="telp" value="<%=data.get(0).getTelp()%>"></td>
                    <td><input type="hidden" name="id" value="<%=data.get(0).getId()%>"></td>
		</tr>
		<tr>
                    <td></td>
                    <td><input type="submit" value="Update"></td>
		</tr><%}%>
            </table>
	</form>	
    
    </body>
</html>
