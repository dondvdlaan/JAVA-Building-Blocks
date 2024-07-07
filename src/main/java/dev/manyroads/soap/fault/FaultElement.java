package dev.manyroads.soap.fault;

import java.io.Serial;
import java.io.Serializable;

/**
 * This class will send error specific details
 */
public class FaultElement implements Serializable {

    // an explicit serial version UID in every serializable class
    @Serial
    private static final long serialVersionUID = 5201528263606270479L;

    // application specific error code, not to be confused w predefined <faultcode>
    private int errorCode;
    private String errorMessage;

    public int getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(int errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
