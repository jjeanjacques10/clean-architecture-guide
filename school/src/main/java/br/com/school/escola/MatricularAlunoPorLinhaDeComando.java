package br.com.school.escola;

import br.com.school.escola.aplicacao.aluno.matricular.MatricularAluno;
import br.com.school.escola.aplicacao.aluno.matricular.MatricularAlunoDTO;
import br.com.school.escola.infra.aluno.RepositorioDeAlunosEmMemoria;

public class MatricularAlunoPorLinhaDeComando {

    public static void main(String[] args) {
        String nome = "Jean Jacques";
        String cpf = "123.456.789-00";
        String email = "jean@gmail.com";

        MatricularAluno matricularAluno = new MatricularAluno(new RepositorioDeAlunosEmMemoria());
        matricularAluno.executa(new MatricularAlunoDTO(nome, cpf, email));
    }
}
