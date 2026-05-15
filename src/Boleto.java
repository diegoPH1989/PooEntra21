
public class Boleto implements MeioPagamento{

    @Override
    public void pagar(double valor) {
        System.out.print("Gerando Boleto de " + valor);
    }

    @Override
    public void pagamento(){
        System.out.println( " com vencimento dia 10");
    }
}


