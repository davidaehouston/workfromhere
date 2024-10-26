package dh.workfromhere.spaces.exception;

import dh.workfromhere.utils.exceptions.ErrorCode;
import lombok.Getter;

@Getter
public class SpaceResourceException extends RuntimeException {

    private final ErrorCode errorCode;

    public SpaceResourceException(ErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }
}
