package br.com.school.escola.aplicacao.aluno.matricular;

import br.com.school.escola.dominio.aluno.Aluno;
import br.com.school.escola.dominio.aluno.RepositorioDeAlunos;

public class MatricularAluno {

    private final RepositorioDeAlunos repositorio;

    public MatricularAluno(RepositorioDeAlunos repositorio) {
        this.repositorio = repositorio;
    }

    // COMMAND - Possível de ser utilizado neste caso
    public void executa(MatricularAlunoDTO dados) {
        Aluno novo = dados.criarAluno();
        repositorio.matricular(novo);
    }

}
