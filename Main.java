
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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    static Scanner sc = new Scanner(System.in);
    static informacion lista = new informacion();
    public static void Main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean salir = false;
        int eleccion;
        
        while (!salir){
            System.out.println("\nSeleccionar lo qué desea ejecutar");
            System.out.println("\n1. Añadir al inicio");
            System.out.println("2. Añadir al final");
            System.out.println("3. Mostrar");
            System.out.println("4. Eliminar el primer elemento");
            System.out.println("5. Eliminar el último elemento");
            System.out.println("6. Eliminar el elemento seleccionado");
            System.out.println("8. Salir");
            eleccion  = sc.nextInt();
            
            switch (eleccion){
                case 1: añadir();
                        break;
                case 2: añadirFinal();
                        break;
                case 3: lista.Lista();
                        break;
                case 4: System.out.println("elemento eliminado: [" + lista.eli_inicio() + "]");
                        break;
                case 5: System.out.println("elemento eliminado: [" + lista.eli_final() + "]");
                        break;
                case 6: System.out.println("elemento eliminado: [" + lista.eli_seleccion() + "]");
                        break;
                case 7: salir = true;
                        break;
                case 8: default: System.out.println("La opción que seleccionó no"
                        + " existe, seleccionar otra");
                        break;
            }
        }
    }
    
    public static void añadir(){
        char elemento=0;
        System.out.println("Ingresar el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.Agr_in(elemento);
    }
    
    public static void añadirFinal(){
        char elemento = 0;
        System.out.println("Ingresar el elemento a añadir");
        elemento = sc.next().charAt(elemento);
        lista.Agr_fi(elemento);
    }
}
