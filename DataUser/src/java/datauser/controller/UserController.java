/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datauser.controller;

import datauser.model.UserModel;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author ARIPH
 */
public class UserController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String proses=request.getParameter("proses");
        String action=request.getParameter("action");
        if (proses.equals("input-user")){
            response.sendRedirect("tambah_user.jsp");
            return;
        }else if(proses.equals("edit-user")){
            response.sendRedirect("edit_user.jsp?id="+request.getParameter("id"));
            return;
        }else if(proses.equals("hapus-user")){
            UserModel hm = new UserModel();
            hm.setId(request.getParameter("id"));
            hm.hapus();
            response.sendRedirect("");
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String data = request.getParameter("data");
        String proses = request.getParameter("proses");
        
        if (data != null){
            if(data.equals("user")){
                UserModel um = new UserModel();
                um.setId(request.getParameter("id"));
                um.setUsername(request.getParameter("username"));
                um.setPassword(request.getParameter("password"));
                um.setNama(request.getParameter("nama"));
                um.setAlamat(request.getParameter("alamat"));
                
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
                String dateInString = request.getParameter("tanggal");

                try {

                    java.util.Date utilStartDate = formatter.parse(dateInString);
                    java.sql.Date sqlStartDate = new java.sql.Date(utilStartDate.getTime());

                    um.setTanggal(sqlStartDate);
                } catch (ParseException e) {
                    e.printStackTrace();
                }

                
                um.setEmail(request.getParameter("email"));
                um.setTelp(request.getParameter("telp"));
                
                if (proses.equals("input-user")){
                    um.simpan();
                }else if (proses.equals("update-user")){
                    um.update();
                }else if(proses.equals("hapus-user")){
                    um.hapus();
                }
                response.sendRedirect("index.jsp");
            }else if(data.equals("login")){
                if(proses.equals("login-user")){
                    int hasil = 0;
                    UserModel um = new UserModel();
                    um.setUsername(request.getParameter("username"));
                    um.setPassword(request.getParameter("password"));
                    hasil = um.cek();
                    if (hasil>0){
                        response.sendRedirect("index.jsp");
                    }else{
                        response.getWriter().print("Maaf, Username dan Password anda salah.");
                    }
                }
            }
        }
    }

}