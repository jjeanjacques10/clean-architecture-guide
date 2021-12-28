package br.com.school.escola.dominio.aluno;

/* Value Object */
public class CPF {

    private String numero;

    public CPF(String numero) {
        if (numero == null || !numero.matches("(^\\d{3}\\x2E\\d{3}\\x2E\\d{3}\\x2D\\d{2}$)")) {
            throw new IllegalArgumentException("CPF invalido!");
        }
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }
}
