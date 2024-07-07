package dev.manyroads.soap.fault;

import jakarta.xml.ws.WebFault;

import java.io.Serial;

/**
 * If an error occurs during message processing, the response to a soap message will be soap fault
 * in the body of the message. This soap fault will be sent back to the caller
 */
@WebFault(name = "FaultElement", faultBean = "dev.manyroads.soap.fault.FaultElement")
public class FaultMessage extends Exception {

    @Serial
    private static final long serialVersionUID = -5716772139104716690L;
    private FaultElement faultElement;

    // Default constructor
    public FaultMessage() {
    }

    public FaultMessage(FaultElement faultElement) {

        // Constructs a new exception with the specified detail message in the super class
        super(faultElement.getErrorMessage());
        this.faultElement = faultElement;
    }
    public FaultMessage(String message, FaultElement faultElement) {

        // Constructs a new exception with the specified detail message in the super class
        super(message);
        this.faultElement = faultElement;
    }
}
