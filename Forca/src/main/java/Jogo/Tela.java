/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Jogo;

import java.util.*;

/**
 *
 * @author esdra
 */
public class Tela {

    Random r = new Random();

    private String[] listaPalavras = {
        "banana", "carro", "moto", "avião", "matador", "dragão", "dinossauro", "pipoca", "laranja", "foguete", "barco", "cinema", "casamento"
    };

    List<String> palavrasCertas = new ArrayList();
    List<String> palavrasErradas = new ArrayList();

    public String palavraAleatoria() {
        int a = listaPalavras.length;
        return listaPalavras[r.nextInt(a)];

    }

    public void apresentarPalavra() {
        String palavra = palavraAleatoria();
        char[] plv = palavra.toCharArray();
        for (int i = 0; i < plv.length; i++) {
            System.out.print("_  ");

        }

    }


    public static void main(String[] args) {

        Tela te = new Tela();
        
        te.palavraAleatoria();
        te.apresentarPalavra();
        
    }
}
