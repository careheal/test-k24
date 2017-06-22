<%-- 
    Document   : index
    Created on : 21 Jun 17, 20:51:43
    Author     : ARIPH
--%>

<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="datauser.model.UserModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Data User Member</title>
    </head>
    <body>
    <center><h1>Data User Member</h1></center>
  <table style="margin:20px auto;" border="1">
	<tr>
            <th>Id</th>
            <th>Username</th>
            <th>Password</th>
            <th>Nama</th>
            <th>Alamat</th>
            <th>Tanggal Lahir</th>
            <th>Email</th>
            <th>Telp</th>
	</tr>
        <%
            UserModel km = new UserModel();
            List<UserModel> data = new ArrayList<UserModel>();
            String ket = request.getParameter("ket");
            if (ket == null) {
                data = km.tampil();
            } 
            for (int x = 0; x < data.size(); x++) {
        %>
        <tr>
            <td><%=data.get(x).getId()%></td>
            <td><%=data.get(x).getUsername()%></td>
            <td><%=data.get(x).getPassword()%></td>
            <td><%=data.get(x).getNama()%></td>
            <td><%=data.get(x).getAlamat()%></td>
            <td><%=data.get(x).getTanggal()%></td>
            <td><%=data.get(x).getEmail()%></td>
            <td><%=data.get(x).getTelp()%></td>
            <td>
                <a href="UserController?proses=edit-user&id=<%=data.get(x).getId()%>">Edit</a>
                <a href="UserController?proses=hapus-user&id=<%=data.get(x).getId()%>">Hapus</a>
            </td>
        </tr>
        <%}%>
    </table>
    <center>
        <a class="tambah" href="UserController?proses=input-user">Tambah</a>
    </center>
    </body>
</html>
