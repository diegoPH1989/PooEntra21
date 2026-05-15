
public class CartaoCredito implements MeioPagamento {

    @Override
    public void pagar(double valor) {
        System.out.print("Pagando " + valor);

    }

    @Override
    public void pagamento() {
        System.out.println(" com Cartao de Credito");

    }
}