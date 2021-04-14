package com.example.avatar;

import com.talanlabs.avatargenerator.Avatar;
import com.talanlabs.avatargenerator.IAvatarInfo;
import com.talanlabs.avatargenerator.TriangleAvatar;


import javax.imageio.ImageIO;
import javax.imageio.stream.ImageInputStream;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


@WebServlet(name = "AvatarServlet", value = "/AvatarServlet")
public class AvatarServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Avatar avatar = TriangleAvatar.newAvatarBuilder().build();
        BufferedImage image = avatar.create(123456L);
        ImageIO.write(image, "PNG", response.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
