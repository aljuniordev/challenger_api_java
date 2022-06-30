package br.com.lastmilepay.shared.errors;

import org.springframework.http.HttpStatus;

public enum ErrorMessages {
    DATABASE_ERROR("Erro de banco", HttpStatus.BAD_REQUEST),
    VALIDATION_ERRORS("Erros de validação", HttpStatus.BAD_REQUEST),
    INVALID_PARAMETERS("Parametros inválidos", HttpStatus.BAD_REQUEST),
    SERVICE_ERROR("Erro no serviço", HttpStatus.BAD_REQUEST);

    private String messageErrorTemplate;

    private HttpStatus errorStatus;

    ErrorMessages(String messageErrorTemplate, HttpStatus status) {
        this.messageErrorTemplate = messageErrorTemplate;
        this.errorStatus = status;
    }

    public String getMessageErrorTemplate() {
        return messageErrorTemplate;
    }

    public HttpStatus getErrorStatus() {
        return errorStatus;
    }

    @Override
    public String toString() {
        return "ErrorType{" +
                "messageErrorTemplate='" + messageErrorTemplate + '\'' +
                ", status=" + errorStatus +
                "} " + super.toString();
    }

}
