package courses.Payment_Service.error;

import lombok.Getter;

@Getter
public class IntegrationException extends RuntimeException {
    private final String errorCode;

    public IntegrationException(String message, String errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

}
