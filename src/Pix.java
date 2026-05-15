
public class Pix implements MeioPagamento {

    @Override
    public void pagar(double valor) {
        System.out.print("Pagando " + valor);
    }

    @Override
    public void pagamento(){
        System.out.println(" via Pix com Chave: 000.000.000-00");
    }

    }

