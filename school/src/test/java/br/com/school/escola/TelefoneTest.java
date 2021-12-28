package br.com.school.escola;

import br.com.school.escola.dominio.aluno.Telefone;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void deveriaCriarTelefoneComDDDsValidos() {
        var dddExpected = "11";
        var telefoneExpected = "29128488";
        var telefone = new Telefone(dddExpected, telefoneExpected);
        assertEquals("1129128488", telefone.getTelefone());
    }

    @Test
    void naoDeveriaCriarTelefoneComDDDsInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Telefone(null, "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("", "123456789"));

        assertThrows(IllegalArgumentException.class,
                () -> new Telefone("1", "123456789"));
    }

}