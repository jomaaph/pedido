package org;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Jose", "jomaph@gmail.com");
        Produto produto = new Produto("Samsung", 10000);
        Produto produto1 = new Produto("Iphone", 10000);
        Pedido pedido = new Pedido(cliente);

        pedido.addProdutos(produto);
        pedido.addProdutos(produto1);

        pedido.exibirResumo();

    }
}
