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
public class Tokens {

    private int id;
    private String token;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    //Metodo de armazenar os tokens
    public String[] registarTokens() {
        setToken("Esse e um teste para separar lexema ");
        setToken(getToken().concat("novo"));
        return separar(getToken());
    }

    //Metodo para separar tokens
    private String[] separar(String separar) {
        String[] str = separar.split(" ");
        return str;

    }

}
