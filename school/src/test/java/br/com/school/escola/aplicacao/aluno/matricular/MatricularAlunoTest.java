package br.com.school.escola.aplicacao.aluno.matricular;

import br.com.school.escola.dominio.aluno.Aluno;
import br.com.school.escola.dominio.aluno.CPF;
import br.com.school.escola.infra.aluno.RepositorioDeAlunosEmMemoria;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatricularAlunoTest {

    @Test
    void alunoDeveriaSerPersistido() {
        // Mock -> Mockito
        RepositorioDeAlunosEmMemoria repositorio = new RepositorioDeAlunosEmMemoria();
        MatricularAluno useCase = new MatricularAluno(repositorio);

        MatricularAlunoDTO dados = new MatricularAlunoDTO(
                "Fulano",
                "123.456.789-00",
                "fulano@outlook.com");
        useCase.executa(dados);

        Aluno alunoEncontrado = repositorio.buscarPorCPF(new CPF("123.456.789-00"));
        assertEquals("Fulano", alunoEncontrado.getNome());
        assertEquals("123.456.789-00", alunoEncontrado.getCpf());
        assertEquals("fulano@outlook.com", alunoEncontrado.getEmail());
    }
}