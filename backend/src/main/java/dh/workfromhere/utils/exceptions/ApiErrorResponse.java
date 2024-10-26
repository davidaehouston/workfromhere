package dh.workfromhere.utils.exceptions;

import lombok.Getter;

@Getter
public class ApiErrorResponse {

    private final String errorCode;
    private final String message;

    public ApiErrorResponse(String errorCode, String message) {
        this.errorCode = errorCode;
        this.message = message;
    }
}
