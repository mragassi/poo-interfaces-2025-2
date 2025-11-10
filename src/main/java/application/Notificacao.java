package application;

import java.time.LocalDateTime;
import lombok.Getter;

@Getter
public abstract class Notificacao {
    private LocalDateTime dataEnvio;
    private String remetente;

    public Notificacao(String remetente) {
        this.remetente = remetente;
        this.dataEnvio = LocalDateTime.now();
    }

    public void exibirInformacoesRemetente() {
        System.out.println(
            "-- Notificação de " + this.remetente + " em " + this.dataEnvio);
    }

    public abstract void enviar();
    public abstract void registrarLog();
}
