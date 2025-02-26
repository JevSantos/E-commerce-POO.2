package Model;

import java.time.LocalDate;

public class  PagamentoCartao extends Pagamento {
    private StatusPedido status;

    public PagamentoCartao(String nome, int codigo, double valor, LocalDate vencimento) {
        super(nome, codigo, valor, vencimento);
       this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
       this.status = StatusPedido.FINALIZADO;

    }
}



