package application;

public class Main {
    public static void main(String[] args) {
        NotificacaoSms notifSMS = new NotificacaoSms(
            "Marco", "1423456543", "Mensagem de Teste", 1);
        
        notifSMS.exibirInformacoesRemetente();
        notifSMS.enviar();
        notifSMS.registrarLog();

        notifSMS.definirPrioridade(8);
        System.out.println(notifSMS.obterNivelPrioridade());
        notifSMS.definirPrioridade(0);
        
        Notificacao notif = new NotificacaoSms(
            "Fulano", "1423456543", "Testando", 3);
        
        notif.exibirInformacoesRemetente();
        notif.enviar();

        Priorizavel objPriorizavel = new NotificacaoSms(
            "Ciclano", "1343234567", "Novo Teste", 2);

        objPriorizavel.definirPrioridade(6);
        
    }
}

