package br.com.school.escola.dominio.aluno;

public class FabricaDeAluno {

    private Aluno aluno;

    public FabricaDeAluno comNomeCPFEmail(String nome, String cpf, String email) {
        this.aluno = new Aluno(new CPF(cpf), nome, new Email(email));
        return this;
    }

    public FabricaDeAluno comTelefone(String ddd, String numero) {
        this.aluno.adicionarTelefone(ddd, numero);
        return this;
    }

    public Aluno criar() {
        return this.aluno;
    }

    /* Retornando o tipo FabricaDeAluno é possível fazer esse encadeamento */
    public static void main(String[] args) {
        FabricaDeAluno fabrica = new FabricaDeAluno();
        Aluno aluno = fabrica.comNomeCPFEmail("", "", "")
                .comTelefone("", "")
                .criar();
    }

}
