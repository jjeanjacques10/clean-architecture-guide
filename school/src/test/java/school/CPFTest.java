package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void deveriaCriarCPFValido() {
        var cpfExpected = "703.787.270-95";
        var cpf = new CPF(cpfExpected);
        assertEquals(cpfExpected, cpf.getNumero());
    }

    @Test
    void naoDeveriaCriarCPFInValido() {
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(null));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF(""));
        assertThrows(IllegalArgumentException.class,
                () -> new CPF("123.123.123..123"));
    }
}