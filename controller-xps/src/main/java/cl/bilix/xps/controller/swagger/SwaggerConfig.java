package cl.bilix.xps.controller.swagger;

import java.time.LocalDateTime;
import java.util.Date;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableWebMvc
@EnableSwagger2
public class SwaggerConfig{
	
	@Bean
	public Docket newsApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.groupName("api-infos")
				.apiInfo(apiInfo())
				.directModelSubstitute(LocalDateTime.class, Date.class)
				.select()
				.paths(regex(".*/*.*"))
				.build();
	}
	
	private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("DOCUMENTACION API REST XPS")
                .description("Construido bajo estandares de Bilix Ltda.")
                .termsOfServiceUrl("http://bilix.cl")
                .contact("cguerra@bilix.cl")
                .version("1.0")
                .build();
    }
	
}