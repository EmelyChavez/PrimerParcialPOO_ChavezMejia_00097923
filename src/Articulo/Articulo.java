package Articulo;

public abstract class Articulo {
    protected String nombre;
    protected String modelo;
    protected static int numero;


    public Articulo(){}

    public Articulo(String nombre, String modelo, int numero) {
        super();
    }
    public abstract void MostrarArticulo();
    public static long Calcularnumero() {
        numero++;
        return numero;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public static int getNumero() {
        return numero;
    }

    public static void setNumero(int numero) {
        Articulo.numero = numero;
    }

    public abstract float obtenerPrecio(float precio);

    public abstract String descripcionArticulo(String caracteristica1, float caracteristica2);
}
