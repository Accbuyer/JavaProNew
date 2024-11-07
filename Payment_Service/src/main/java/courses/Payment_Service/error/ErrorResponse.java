package courses.Payment_Service.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class ErrorResponse {
    private final String errorMessage;
    private final String errorCode;
}
