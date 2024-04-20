package Articulo;

public class Laptop extends Articulo{
    private  float precioLaptop = 289.7F;
    private float ram;
    private String SO;
    public Laptop() {
    }

    public Laptop(String nombre, String modelo, float ram, String SO) {
        super(nombre, modelo, numero);
        this.ram = ram;
        this.SO = SO;
    }

    @Override
    public void MostrarArticulo() {
        System.out.println("Detalle de telefono ");
        System.out.println("Nombre: " + super.nombre);
        System.out.println("Modelo: " + super.modelo);
        System.out.println( "Precio: "+ obtenerPrecio(precioLaptop));
        System.out.println("Descripcion: " + descripcionArticulo(SO, ram));

    }

    @Override
    public float obtenerPrecio(float precio) {
        precio = precio++;
        return precio;
    }

    @Override
    public String descripcionArticulo(String caracteristica1, float caracteristica2) {
        return ("Megapixeles: " + caracteristica1 + "Marca: " + caracteristica2);
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public String getSO() {
        return SO;
    }

    public void setSO(String SO) {
        this.SO = SO;
    }
}