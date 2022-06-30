package br.com.lastmilepay.shared.errors;

public class ApiException extends RuntimeException {

    private ErrorMessages errorMessages;

    private String messageParam;

    public ApiException(ErrorMessages errorMessages, String messageParam) {
        super(getMessageFromParam(errorMessages, messageParam));
        this.errorMessages = errorMessages;
        this.messageParam = messageParam;
    }

    public ErrorMessages getErrorMessages() {
        return errorMessages;
    }

    public String getMessageParam() {
        return messageParam;
    }

    private static String getMessageFromParam(ErrorMessages errorMessages, String messageParam) {
        return String.format(errorMessages.getMessageErrorTemplate(), messageParam);
    }

    @Override
    public String toString() {
        return "RestApiException{" +
                "message=" + errorMessages +
                ", messageParam='" + messageParam + '\'' +
                "} " + super.toString();
    }

}
