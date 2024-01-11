package com.example.bootgradle.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@OpenAPIDefinition(
        info = @Info(title = "User-Service API 명세서",
                description = "사용자 어플 서비스 API 명세서",
                version = "v1"))
@Configuration
// Bean을 등록할 때 싱글톤이 되도록 보장한다.
// 스프링 컨테이너에서 Bean을 관리할 수 있게 됨
//http://127.0.0.1:8088/swagger-ui/index.html 주소
public class SwaggerConfig {

}
