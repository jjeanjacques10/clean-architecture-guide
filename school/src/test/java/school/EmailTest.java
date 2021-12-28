package school;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmailTest {

    @Test
    void deveriaCriarEmailsComEnderecosValido() {
        var emailExpected = "jjean@gmail.com";
        var email = new Email(emailExpected);

        assertEquals(emailExpected, email.getEndereco());
    }

    @Test
    void naoDeveriaCriarEmailsComEnderecosInvalidos() {
        assertThrows(IllegalArgumentException.class,
                () -> new Email(null));
        assertThrows(IllegalArgumentException.class,
                () -> new Email(""));
        assertThrows(IllegalArgumentException.class,
                () -> new Email("emailInvalido"));
    }

}