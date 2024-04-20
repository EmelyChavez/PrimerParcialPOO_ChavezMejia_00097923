package Articulo;

public class Telefono extends Articulo implements ObtencionDatos {
    private float precioTelefono = 100.9F;
    private String marcaTelefono;
    private float megapixelesT;
    public Telefono(String modelo, String telefono, String marca) {
    }

    public Telefono(String nombre, String modelo, String marcaTelefono, float megapixelesT) {
        super(nombre, modelo, numero);
        this.marcaTelefono = marcaTelefono;
        this.megapixelesT = megapixelesT;

    }

    @Override
    public void MostrarArticulo() {
        System.out.println("Detalle de telefono ");
        System.out.println("Nombre: " + super.nombre);
        System.out.println("Modelo: " + super.modelo);
        System.out.println( "Precio: "+ obtenerPrecio(precioTelefono));
        System.out.println("Descripcion: " + descripcionArticulo(marcaTelefono, megapixelesT));

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

    public String getMarcaTelefono() {
        return marcaTelefono;
    }

    public void setMarcaTelefono(String marcaTelefono) {
        this.marcaTelefono = marcaTelefono;
    }

    public float getMegapixelesT() {
        return megapixelesT;
    }

    public void setMegapixelesT(float megapixelesT) {
        this.megapixelesT = megapixelesT;
    }
}