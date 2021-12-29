package br.com.school.escola.infra.indicacao;

import br.com.school.escola.dominio.aluno.Aluno;
import br.com.school.escola.aplicacao.indicacao.EnviarEmailIndicacao;

public class EnviarEmailIndicacaoComJavaMail implements EnviarEmailIndicacao {
    @Override
    public void enviarPara(Aluno indicado) {
        // Lógica de envio de e-mails com a lib Java Mail
        System.out.println("Enviando e-mail");
    }
}
