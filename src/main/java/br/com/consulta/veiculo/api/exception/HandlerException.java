package br.com.consulta.veiculo.api.exception;

import br.com.consulta.veiculo.api.vo.ApiError;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class HandlerException {

    @ExceptionHandler(Exception.class)
    public ResponseEntity handleException(Exception e) {
        ApiError apiError = new ApiError(e.getMessage(), 400);
        return ResponseEntity.badRequest().body(apiError);
    }
}
