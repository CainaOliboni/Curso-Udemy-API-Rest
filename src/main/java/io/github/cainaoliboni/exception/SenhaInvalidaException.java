package io.github.cainaoliboni.exception;

public class SenhaInvalidaException extends RuntimeException {
    public SenhaInvalidaException(){
        super("Senha Inválida");
    }
}
