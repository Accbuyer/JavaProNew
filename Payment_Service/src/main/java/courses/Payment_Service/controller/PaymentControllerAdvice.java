package courses.Payment_Service.controller;


import courses.Payment_Service.error.ErrorResponse;
import courses.Payment_Service.error.IntegrationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class PaymentControllerAdvice {

    @ExceptionHandler(IntegrationException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ErrorResponse handleInternalError(IntegrationException integrationException) {
        return new ErrorResponse(integrationException.getMessage(), integrationException.getErrorCode());
    }
}
