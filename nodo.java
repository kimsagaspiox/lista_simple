/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class nodo {
    public char dato;
    public nodo siguiente;

    public nodo(char dato) {
        this.dato = dato;
    }

    public nodo(char dato, nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
