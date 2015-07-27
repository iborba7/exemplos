package Excecoes;

import javax.servlet.ServletException;

public class DadosInvalidosException extends ServletException {
    
    public DadosInvalidosException() {
        super("Dados inválidos!");
    }
    
}
