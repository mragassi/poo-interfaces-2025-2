package application;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NotificacaoEmail extends Notificacao {
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
}
