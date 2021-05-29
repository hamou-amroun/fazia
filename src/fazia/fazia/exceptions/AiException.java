package fazia.fazia.exceptions;

public class AiException extends Exception {

    private ErrorLevel errorLevel;
    private ErrorMethode errorMethode;

    public AiException(String message, ErrorLevel errorLevel, ErrorMethode errorMethode) {
        super(message);
        this.errorLevel = errorLevel;
        this.errorMethode = errorMethode;
    }

    public AiException(String message, ErrorLevel errorLevel) {
        super(message);
        this.errorLevel = errorLevel;
    }

    @Override
    public String getMessage() {
        return "errorLevel : " + errorLevel + ",  errorMethode : " + errorMethode;
    }
}
