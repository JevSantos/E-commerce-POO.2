package Services.Comunicacao;

public class notificacao  {
    private final ComunicacaoService comunicacaoService;

    public notificacao(ComunicacaoService comunicacaoService) {
        this.comunicacaoService = comunicacaoService;
    }
    public void notificar( String mensagem) {
        comunicacaoService.sendMenssage(mensagem);

    }

    }

