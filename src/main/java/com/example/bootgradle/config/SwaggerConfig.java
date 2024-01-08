/*
package com.example.bootgradle.config;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// Bean을 등록할 때 싱글톤이 되도록 보장한다.
// 스프링 컨테이너에서 Bean을 관리할 수 있게 됨
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi getItemApi() {

        return GroupedOpenApi
                .builder()
                .group("item")
                .pathsToMatch("/api/item/**")
                .build();

    }

    @Bean
    public GroupedOpenApi getMemberApi() {

        return GroupedOpenApi
                .builder()
                .group("member")
                .pathsToMatch("/api/member/**")
                .build();

    }

    @Bean
    public OpenAPI getOpenApi() {

        return new OpenAPI().components(new Components())
                .info(getInfo());

    }

    private Info getInfo() {
        return new Info()
                .version("1.0.0")
                .description("COMMERCE REST API DOC")
                .title("COMMERCE");
    }
}
*/
