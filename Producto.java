public class Producto {
    // ATRIBUTOS (Caracteristica de los objetos)
    private String nombre;
    private String departamento;
    private double precio; 

    private static String validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Producto Desconocido";
        }
        return nombre;
    }

    private static double validarPrecio(double precio) {
        if (precio <= 0) {
            return 100.0;
        }
        return precio;
    }

    private static String determinarDepartamento(int opcion) {
       switch (opcion) {
            case 1:
                return "Ropa";
            case 2:
                return "Electrónica y tecnología";
            case 3:
                return "Higiene y cuidado personal";
            case 4:
                return "Alimentos";
            default:
                return "Departamento desconocido";
        }
    }

    // METODO CONSTRUCTOR (Metodo que se llama cuando creamos un objeto)
    public Producto(String nombre, int opciondepartamento, double precio) {
        this.nombre = validarNombre(nombre);
        this.departamento = determinarDepartamento(opciondepartamento);
        this.precio = validarPrecio(precio);
    }

    public String getNombre() {
        return nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = validarNombre(nombre);
    }

    public void setDepartamento(int opciondepartamento) {
        this.departamento = determinarDepartamento(opciondepartamento);
    }

    public void setPrecio(double precio) {
        this.precio = validarPrecio(precio);
    }

    @Override
    public String toString() {
        return nombre + " [" + departamento + "] - $" + precio;
    }
}