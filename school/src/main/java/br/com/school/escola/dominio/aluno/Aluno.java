package br.com.school.escola.dominio.aluno;

import java.util.ArrayList;
import java.util.List;

/* Entidade: Temos como diferenciar 2 objetos com base em um atributo */
public class Aluno {

    private CPF cpf;
    private String nome;

    private Email email;

    private List<Telefone> telefone = new ArrayList<>();

    public Aluno(CPF cpf, String nome, Email email) {
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
    }

    public void adicionarTelefone(String ddd, String numero) {
        this.telefone.add(new Telefone(ddd, numero));
    }

}
