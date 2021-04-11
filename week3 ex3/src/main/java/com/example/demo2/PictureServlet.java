package com.example.demo2;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

@WebServlet(name = "PictureServlet", value = "/PictureServlet")
public class PictureServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServletContext sc = getServletContext();
        String filename = sc.getRealPath("/image/P3.jpg");
        String mimeType = sc.getMimeType(filename);
        if (mimeType == null) {
            sc.log("Could not get MIME type of "+filename);
            response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            return;
        }
        response.setContentType(mimeType);
        File file = new File(filename);
        response.setContentLength((int)file.length());
        FileInputStream in = new FileInputStream(file);
        OutputStream out = response.getOutputStream();
        byte[] buf = new byte[1024];
        int count = 0;
        while ((count = in.read(buf)) >= 0) {
            out.write(buf, 0, count);
        }
        in.close();
        out.close();

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
