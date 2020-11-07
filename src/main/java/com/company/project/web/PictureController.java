package com.company.project.web;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import static com.company.project.common.Constants.IMAGES_PATH;

@Controller
@RequestMapping("/picture")
public class PictureController {
    @RequestMapping(value = "/get", produces = MediaType.ALL_VALUE)
    public void getImage(HttpServletResponse response) throws IOException {
        response.setContentType("image/jpg");
        BufferedImage img = ImageIO.read(new FileInputStream(new File(IMAGES_PATH + "static/images/.jpg")));
        ImageIO.write(img, "jpg", response.getOutputStream());
    }
}
