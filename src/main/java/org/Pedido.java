package org;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private Cliente cliente;
    private List<Produto> produtos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.produtos = new ArrayList<>();
    }

    public void addProdutos(Produto produto) {
        this.produtos.add(produto);
    }

    public double  calcularTotal(){
        double total = 0.0;
        for (Produto produto: produtos){
            total += produto.getPreco();
        }
        return total;
    }

    public void exibirResumo(){
        System.out.println("Pedido do cliente: " + cliente.getNome());
        System.out.println("Produtos: ");
        for (Produto produto: produtos){
            System.out.println(" - " + produto.getNome() + " $ " + String.format("%.2f", produto.getPreco()));
        }
        System.out.println("Total: " + String.format("%.2f", calcularTotal()));
    }
}
