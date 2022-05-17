/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author ginov
 */
public class Lexemas {

    private int id;
    private String lexema;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLexema() {
        return lexema;
    }

    public void setLexema(String lexema) {
        this.lexema = lexema;
    }

    //Metodo para buscar, separar comparar lexema
    public String[] Buscar(String lexema) {
        String[] str = lexema.split(" ");
//        try {
//            for (int i = 0; i <= (str.length - 1); i++) {
//                for (int j = 0; j <= (token.length - 1); j++) {
//
//                    if (token[j].equals(str[i])) {
//                        System.out.println("Lexema:" + str[i] + "; token:" + token[j]);
//                        System.out.println("Consegui acertar na comparacao!\n");
//                    }
////                else {
////                    System.out.println("Erro bro");
////                }
//                }
//            }
//        } catch (Exception e) {
//
//        }
        return str;
    }

    //Metodo para analisar erro
}
