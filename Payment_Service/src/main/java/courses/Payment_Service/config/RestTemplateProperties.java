package courses.Payment_Service.config;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

@RequiredArgsConstructor
@Getter
@ConfigurationProperties("integration")
public class RestTemplateProperties {
    private final String url;
    private final Duration connectTimeout;
    private final Duration readTimeout;
}
