package br.com.school.escola.aplicacao.indicacao;

import br.com.school.escola.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
