public class Main1 {
    public static void main (String [] args){
        System.out.println("Productos Nombre");
        Producto pNombreVacio = new Producto ("", 1, 43.45);
        Producto pNombreEspacios = new Producto ("   ", 1, 43.45);
        System.out.println("Nombre Vacio: " + pNombreVacio.getNombre());
        System.out.println("Nombre Espacios: " + pNombreEspacios.getNombre());

        System.out.println("\nProductos Precio");
        Producto pPrecioCero = new Producto ("Cereal", 1, 0);
        Producto pPrecioNegativo = new Producto ("Miel", 1, -43.45);
        System.out.println("Precio Cero: " + pPrecioCero.getPrecio());
        System.out.println("Precio Negativo: " + pPrecioNegativo.getPrecio());

        System.out.println("\nProductos Departamento");
        Producto dep1 = new Producto ("Pantalon", 1, 349.45);
        Producto dep2 = new Producto ("Cargador", 2, 111.5);
        Producto dep3 = new Producto ("Shampoo", 3, 43.45);
        Producto dep4 = new Producto ("Galletas", 4, 23.50);
        Producto dep5 = new Producto ("Pizarron", 5, 150.99); 

        System.out.println (dep1.toString());
        System.out.println (dep2.toString());
        System.out.println (dep3.toString());
        System.out.println (dep4.toString());
        System.out.println (dep5.toString());
    }
}