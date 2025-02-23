package Notificacao;

public class EmailService implements ComunicacaoService {


    @Override
    public void sendMenssage(String mensagem) {

        System.out.println("Enviando Email " + mensagem);
    }
}
