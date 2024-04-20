package Articulo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    ArrayList<Articulo>listaArticulos;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Articulo>listaArticulos = new ArrayList<>();
        System.out.println("Bienvenido, ingrese la opcion que desea ejecutar ");
        System.out.println("1. Agregar articulo ");
        System.out.println("2. Modificar modelo ");
        System.out.println("3. Mostrar listado de articulos");
        System.out.println("4. Salir ");
        int opcion = sc.nextInt();
        switch (opcion){
            case 1:
                System.out.println("1. Agregar telefono");
                System.out.println("2. Agregar laptop");
                int eleccion = sc.nextInt();
                capturaDatos(eleccion, listaArticulos);
                break;
            case 2:
                System.out.println("Seleccione el numero de articulo al que dese modificar el modelo");
                int modificar = sc.nextInt();
                Articulo modeloEncontrado = buscarArticulo(Articulo.numero, listaArticulos);
                if (modeloEncontrado  ){
                }
                break;
            case 3:
                mostrarArticulos(listaArticulos);
            default:
                break;

        }

    }

    static void mostrarArticulos(ArrayList<Articulo> listaArticulos){
        for(Articulo articulo: listaArticulos){
            articulo.MostrarArticulo();
        }
    }
    static Articulo buscarArticulo(int numero, ArrayList<Articulo> listaArticulos){
        for (Articulo articulo: listaArticulos){
            if(Objects.equals(articulo.numero, numero)){
                return articulo;
            }
        }

        return null;
    }
    static void capturaDatos(int opcion, ArrayList<Articulo> listaArticulos) {
        Articulo articulo = null;
        Scanner sc = new Scanner(System.in);

        switch (opcion){

            case 1:
                System.out.println("Ingrese el modelo del telefono ");
                String modelo = sc.nextLine();
                System.out.println("Ingrese la marca del telefono ");
                String marca = sc.nextLine();
                System.out.println("Ingrese la cantidad de megapixeles ");
                float megapixeles = sc.nextFloat();
                Articulo Telefono = new Telefono("Telefono",modelo,marca, megapixeles);
                listaArticulos.add(Telefono);
                break;

            case 2:
                System.out.println("Ingrese el modelo de la laptop");
                String modeloL = sc.nextLine();
                System.out.println("Ingrese la RAM de la laptop ");
                String ram = sc.nextLine();
                System.out.println("Ingrese el sistema operativo de la laṕtop ");
                float SO = sc.nextFloat();
                Articulo Laptop = new Laptop("Laptop", modeloL, SO, ram);
                listaArticulos.add(Laptop);

                break;

        }
    }
}
