/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_karimguifarro;

import java.util.*;

public class Lab2_KarimGuifarro {

    public static Scanner KaOz = new Scanner(System.in);
    public static Detective d = new Detective();
    public static Casos c = new Casos();
    static ArrayList<Casos> Cas = new ArrayList();
    static ArrayList<Detective> Det = new ArrayList();

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
            int op = KaOz.nextInt();
            switch (op) {
                case 1: {
                    System.out.println("Nombre:");
                    String nombre = KaOz.next();
                    System.out.println("Edad:");
                    String edad = KaOz.next();
                    System.out.println("Nacionalidad:");
                    String Nacionalidad = KaOz.next();
                    System.out.println("Años Laborales:");
                    String añolab = KaOz.next();
                    System.out.println("Nivel:");
                    int nivel = KaOz.nextInt();
                    if (nivel > 10 || nivel < 1) {
                        nivel = KaOz.nextInt();
                    }
                    Det.add(new Detective(nombre, edad, Nacionalidad, añolab, nivel));
                }
                break;
                case 2: {
                }
                case 3: {
                    Print(Det);
                    System.out.println("Que desea modificar:");
                    int mod = KaOz.nextInt();
                    if (mod < 0 || mod > Det.size()) {
                        System.out.println("No existe este detective");
                        Print(Det);
                        System.out.println("Igrese de nuevo el valor:");
                    }
                    System.out.println("Nombre:");
                    String nombre = KaOz.next();
                    System.out.println("Edad:");
                    String edad = KaOz.next();
                    System.out.println("Nacionalidad:");
                    String Nacionalidad = KaOz.next();
                    System.out.println("Años Laborales:");
                    String añolab = KaOz.next();
                    System.out.println("Nivel:");
                    int nivel = KaOz.nextInt();
                    if (nivel > 10 || nivel < 1) {
                        nivel = KaOz.nextInt();
                    }
                    Det.get(mod).setNombre(nombre);
                    Det.get(mod).setEdad(edad);
                    Det.get(mod).setNacionalidad(Nacionalidad);
                    Det.get(mod).setAñolab(añolab);
                    Det.get(mod).setNivel(nivel);
                }
                case 4: {
                    Print(Det);
                }
                case 5: {
                    System.out.println("Lugar:");
                    String lugar = KaOz.next();
                    System.out.println("Descripcion:");
                    String descripcion = KaOz.next();
                    System.out.println("Tipo:");
                    String tipo = KaOz.next();
                    System.out.println("Detective a cargo:");
                    String detective = KaOz.next();
                    System.out.println("Estado:");
                    String estado = KaOz.next();
                    Cas.add(new Casos(lugar, descripcion, tipo, detective, estado));
                }
                case 6: {
                    Print1(Det);
                    System.out.println("Que desea modificar:");
                    int mod = KaOz.nextInt();
                    if (mod < 0 || mod > Det.size()) {
                        System.out.println("No existe este detective");
                        Print(Det);
                        System.out.println("Igrese de nuevo el valor:");
                    }
                    System.out.println("Lugar:");
                    String lugar = KaOz.next();
                    System.out.println("Descripcion:");
                    String descripcion = KaOz.next();
                    System.out.println("Tipo:");
                    String tipo = KaOz.next();
                    System.out.println("Detective a cargo:");
                    String detective = KaOz.next();
                    System.out.println("Estado:");
                    String estado = KaOz.next();

                    Cas.get(mod).setLugar(lugar);
                    Cas.get(mod).setDescripcion(descripcion);
                    Cas.get(mod).setTipo(tipo);
                    Cas.get(mod).setDetective(detective);
                    Cas.get(mod).setEstado(estado);
                }
                case 7: {

                }
                case 8: {

                }
                case 9: {

                }
                case 10: {

                }
            }
        }
    }

    static void Print(ArrayList Det) {
        for (int i = 0; i < Det.size(); i++) {
            System.out.println("[" + Det.get(i) + "]");

        }
    }
    static void Print1(ArrayList Cas) {
        for (int i = 0; i < Cas.size(); i++) {
            System.out.println("[" + Cas.get(i) + "]");

        }
    }

}
