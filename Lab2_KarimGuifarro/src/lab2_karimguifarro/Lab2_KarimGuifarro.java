/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;

import java.util.*;
public class Lab2_KarimGuifarro {

     public static Scanner KaOz = new Scanner(System.in);
    public static Detective d=new Detective();
    ArrayList<Detective> Det=new ArrayList();
    public static void main(String[] args) {
        char c = 'k';
        while (c == 'k') {
            System.out.print("****Menu****\n"
                    + "1)Agregar detective\n"
                    + "2)Eliminar Detectives\n"
                    + "3)Modificar Detective\n"
                    + "4)Listar Detectives\n"
                    + "5)Registrar Casos\n"
                    + "6)Modificar Casos\n"
                    + "7)Listar Casos\n"
                    + "8)Listar Casos Resueltos\n"
                    + "9)Listar Casos Pendientes\n"
                    + "10)Salida\n");
            int op=KaOz.nextInt();
            switch(op){
                case 1:{
                    System.out.println("Nombre:");
                    String nombre=KaOz.next();
                    System.out.println("Edad:");
                    String edad=KaOz.next();
                    System.out.println("Nacionalidad:");
                    String Nacionalidad=KaOz.next();
                    System.out.println("A�os Laborales:");
                    String añolab=KaOz.next();
                    System.out.println("Nivel:");
                    int nivel=KaOz.nextInt();
                    
                }
                case 2:{
                    
                }
                case 3:{
                    
                }
                case 4:{
                    
                }
                case 5:{
                    
                }
                case 6:{
                    
                }
                case 7:{
                    
                }
                case 8:{
                    
                }
                case 9:{
                    
                }
                case 10:{
                    
                }
            }
        }
    }
    
}
