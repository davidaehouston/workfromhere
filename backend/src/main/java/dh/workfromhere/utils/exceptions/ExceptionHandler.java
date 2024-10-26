package dh.workfromhere.utils.exceptions;

import dh.workfromhere.spaces.exception.SpaceResourceException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class ExceptionHandler extends ResponseEntityExceptionHandler {

    @org.springframework.web.bind.annotation.ExceptionHandler(SpaceResourceException.class)
    public ResponseEntity<ApiErrorResponse> handleSpaceResourceException(
            SpaceResourceException ex, WebRequest webRequest)
    {
        ErrorCode errorCode = ex.getErrorCode();
        ApiErrorResponse errorResponse = new ApiErrorResponse(errorCode.getCode(), errorCode.getMessage());

        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
