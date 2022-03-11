
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zonia Roldan
 */
public class informacion {
    protected nodo inicio, fin;
    static Scanner sc = new Scanner(System.in);
    public informacion() {
    inicio=null;
    fin=null;
    }
    public boolean Vacio(){
	return this.inicio == null;
    }
    public void Agr_in(char elemento){
        inicio = new nodo(elemento, inicio);
        if (fin == null){
            fin = inicio;
        }
    }
    public void Agr_fi(char elemento){

    if(!Vacio()){

	this.fin.siguiente = new nodo(elemento);
	this.fin = this.fin.siguiente;

    } else {

	 inicio = fin = new nodo(elemento);
        }
}
     public void Lista(){
        nodo aux = inicio;
        while(aux != null){
            if(aux.siguiente == null){
                System.out.print("[" + aux.dato + "]->Null");
            }else{
                System.out.print("[" + aux.dato + "]->");
            }
            aux = aux.siguiente;
        }
      }
 
    public char eli_inicio(){
    	char elemento = this.inicio.dato;
	if(this.inicio == this.fin){=
		this.inicio = this.fin = null;

	}else{
		this.inicio=this.inicio.siguiente;
	}
	return elemento;     
    }
    public char eli_final(){

	char elemento = this.fin.dato;
	if (this.inicio==this.fin){
		this.inicio = this.fin = null;
	}else{
		nodo aux = inicio;
		while(aux.siguiente !=this.fin){
			aux = aux.siguiente;
		}
		this.fin = aux;
		this.fin.siguiente=null;
	}
	
	return elemento;
}
    
    public char eli_seleccion(){
        char elemento = 0;
        
        
        if(!Vacio()){
            System.out.println("Escribir el elemento que desea eliminar");
            elemento = sc.next().charAt(elemento);
            if(this.inicio==this.fin && this.inicio.dato == elemento){
                this.inicio=this.fin=null;
            } else if (this.inicio.dato == elemento) {
                this.inicio = this.inicio.siguiente;
            } else{
                nodo anterior, aux;
                anterior =this.inicio;
                aux = this.inicio.siguiente;
                
                while (aux != null && aux.dato != elemento){
                    anterior = anterior.siguiente;
                    aux = aux.siguiente;
                }
                if (aux !=null){
                    anterior.siguiente = aux.siguiente;
                    if (aux == this.fin){
                        this.fin = anterior;
                    }
                }
                
            }
        }else{
            System.out.println("No se eliminó");
        }
        return elemento;
    }
    
   
}
