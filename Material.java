public class Material {
    // Atributos
    private String nombre;
    private String tipo;
    private int cantidad;
    private String proveedor;
    private float precio;
    private String descripcion;

    // Constructor
    public Material(String nombre, String tipo, int cantidad, String proveedor, float precio, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.proveedor = proveedor;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Proveedor: " + proveedor);
        System.out.println("Precio: " + precio);
        System.out.println("Descripción: " + descripcion);
    }
}