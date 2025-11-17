package application;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao implements Priorizavel, Arquivavel {
    private String destinatario;
    private String assunto;
    private String corpo;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private int nivelPrioridade;

    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private boolean estaArquivado;

    public NotificacaoEmail(
        String remetente, String destinatario, String assunto,
        String corpo, int prioridade
    ) {
        super(remetente);
        this.destinatario = destinatario;
        this.assunto = assunto;
        this.corpo = corpo;
        this.nivelPrioridade = prioridade;
        this.estaArquivado = false;
    }

    @Override
    public void enviar() {
        System.out.println(
            "Enviando E-Mail (Prioridade " +
            this.nivelPrioridade +
            ") para " +
            this.destinatario);
    }

    @Override
    public void registrarLog() {
        System.out.println(
            "[LOG] E-Mail ("+
            "Prioriade " +
            this.nivelPrioridade +
            ") para " +
            this.destinatario);
    }

    @Override
    public int obterNivelPrioridade() {
        return this.nivelPrioridade;
    }

    @Override
    public void definirPrioridade(int nivel) {
        if(nivel >= 1 && nivel <= 10) {
            this.nivelPrioridade = nivel;
            System.out.println("Prioridade Redefinida: " + this.nivelPrioridade);
        } else {
            System.out.println("Nível de Prioridade Inválido (1-10)");
        }
    }

    @Override
    public boolean estaArquivado() {
        return this.estaArquivado;
    }

    @Override
    public void arquivar() {
        if(!this.estaArquivado) {
            this.estaArquivado = true;
            System.out.println("E-Mail arquivado");
        } else {
            System.out.println("E-Mail já está arquivado");
        }
    }

    @Override
    public void desarquivar() {
        if (estaArquivado) {
            this.estaArquivado = false;
            System.out.println("E-mail desarquivado.");
        } else {
            System.out.println("E-mail não está arquivado.");
        }
    }
}
