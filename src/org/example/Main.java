package org.example;

public class Main {
    public static void main(String[] args) {

        cartaoDeCredito cartao = new cartaoDeCredito(
                "1234 5678 9012 3456",
                "Diego",
                5000.0,
                "123"
        );

        System.out.println("Número: " + cartao.getNumeroCartao());
        System.out.println("Titular: " + cartao.getNomeTitular());
        System.out.println("Limite: " + cartao.getLimiteDisponivel());
        System.out.println("CVV: " + cartao.getCVV());

        cartao.setNomeTitular("Diego Cunha");
        cartao.setNumeroCartao("9999 8888 7777 555");
        cartao.setCVV("999");
        cartao.setLimiteDisponivel(8000.0);

        System.out.println("\nApós alterações:");
        System.out.println("Número: " + cartao.getNumeroCartao());
        System.out.println("Titular: " + cartao.getNomeTitular());
        System.out.println("Limite: " + cartao.getLimiteDisponivel());
        System.out.println("CVV: " + cartao.getCVV());
    }
}