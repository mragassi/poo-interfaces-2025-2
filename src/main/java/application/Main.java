package application;

import java.util.ArrayList;
import java.util.List;

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

        objPriorizavel = new NotificacaoEmail(
            "Beltrano", "beltrano@email.com", "Teste", "Olá Mundo", 3);

        Arquivavel objArquivavel = new NotificacaoEmail(
            "Marco", "marco@email.com", "Novo Teste", "Olá Mundo", 3);

        ((Notificacao) objArquivavel).enviar();

        System.out.println("=========");
        List<Priorizavel> objetos = new ArrayList<Priorizavel>();

        objetos.add(objPriorizavel);
        objetos.add(new NotificacaoSms(
            "Ciclano", "1343234567", "Novo Teste", 2));
        objetos.add(new NotificacaoSms(
            "Maria", "1343234567", "Testando", 4));

        for(Priorizavel item : objetos) {
            System.out.println(item.obterNivelPrioridade());
        }
    }
}

