package org.example;

import java.util.ArrayList;

public class Restaurante {
    public String nome;
    public String avaliacao;
    public ArrayList<Item> cardapio;

    public Restaurante(String nome, String avaliacao) {
        this.nome = nome;
        this.avaliacao = avaliacao;
        this.cardapio = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarItem(Item item) {
        cardapio.add(item);
    }

    public void imprimirMenu() {
        for (Item item : cardapio) {
            System.out.println(item.getNome() + ": " + item.getPreco());
        }
    }
}
