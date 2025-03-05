package Model.Pagamento;

import Model.Pedido.StatusPedido;

import java.time.LocalDate;
import java.util.UUID;

public class PagamentoPix extends Pagamento {
private String qrCode;
private String Chave;
private StatusPedido status;

    public PagamentoPix(String nome, int codigo, double valor, LocalDate vencimento,  String qrCode) {
        super(nome, codigo, valor, vencimento);
        this.qrCode =  UUID.randomUUID().toString();
        this.Chave = qrCode.substring(0,4);
        this.status = StatusPedido.AGUARDANDO_PAGAMENTO;
        this.status = StatusPedido.FINALIZADO;
    }




}











