package br.com.school.escola.infra.aluno;

import br.com.school.escola.dominio.aluno.Aluno;
import br.com.school.escola.dominio.aluno.CPF;
import br.com.school.escola.dominio.aluno.RepositorioDeAlunos;
import br.com.school.escola.dominio.exception.AlunoNaoEncontrado;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {

    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCPF(CPF cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getNumero()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontrado(cpf));
    }

    @Override
    public List<Aluno> listarTodosAlunosMatriculados() {
        return this.matriculados;
    }
}
