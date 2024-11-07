package courses.Payment_Service.config;

import courses.Payment_Service.error.RestTemplateResponseErrorHandler;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
@RequiredArgsConstructor
@EnableConfigurationProperties(RestTemplateProperties.class)
public class AppConfig {
    private final RestTemplateProperties restTemplateProperties;

    @Bean
    public RestTemplate restTemplate(RestTemplateResponseErrorHandler errorHandler) {
        return new RestTemplateBuilder()
                .rootUri(restTemplateProperties.getUrl())
                .setConnectTimeout(restTemplateProperties.getConnectTimeout())
                .setReadTimeout(restTemplateProperties.getReadTimeout())
                .errorHandler(errorHandler)
                .build();
    }
}
