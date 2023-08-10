public class Proveedor {
    // Atributos
    private String nombreEmpresa;
    private String contacto;
    private String direccion;
    private int numeroTelefono;

    // Constructor
    public Proveedor(String nombreEmpresa, String contacto, String direccion, int numeroTelefono) {
        this.nombreEmpresa = nombreEmpresa;
        this.contacto = contacto;
        this.direccion = direccion;
        this.numeroTelefono = numeroTelefono;
    }

    // Getters y Setters
    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroTelefono() {
        return numeroTelefono;
    }

    public void setNumeroTelefono(int numeroTelefono) {
        this.numeroTelefono = numeroTelefono;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre de la empresa: " + nombreEmpresa);
        System.out.println("Contacto: " + contacto);
        System.out.println("Dirección: " + direccion);
        System.out.println("Número de teléfono: " + numeroTelefono);
    }
}