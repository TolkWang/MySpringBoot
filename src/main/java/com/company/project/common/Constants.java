package com.company.project.common;

import org.springframework.util.ClassUtils;

public interface Constants {
    public static final String IMAGES_PATH = ClassUtils.getDefaultClassLoader().getResource("").getPath() + "static/images";
    public static final String IMAGES_PATH_HTTP = "http://localhost:8081/images";
    public static final String IMAGES_LINK = "https://www.baidu.com/";
}
