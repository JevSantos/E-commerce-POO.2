package Model.Pagamento;

import Model.Cliente.Cliente;

import java.time.LocalDate;

public abstract class Pagamento extends Cliente {



    final double codigo;

     public Pagamento(String nome, double codigo, double valor, LocalDate vencimento) {
         super( nome);
         this.codigo = codigo;
         System.out.println("Pagamento criado com sucesso! " + this.codigo );

     }






}
