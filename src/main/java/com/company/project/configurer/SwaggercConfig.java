package com.company.project.configurer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

import static springfox.documentation.service.ApiInfo.DEFAULT_CONTACT;

/**
 * @author wangtao
 * @date 2020/11/7 10:24
 * @desc
 */
@Configuration
@EnableSwagger2 // 开始swagger
public class SwaggercConfig {

    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo());
    }

    //配置swagger信息
    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Tolk Swagger Api",
                "Api Documentation",
                "1.0",
                "urn:tos",
                DEFAULT_CONTACT,   //作者信息
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
