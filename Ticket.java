public class Ticket {
    // ATRIBUTOS (Caracteristica de los objetos)
    private Producto producto1;
    private Producto producto2;
    private double totalTicket;
    private final double dineroRecibido;
    private double cambioRecibido;

    // METODO CONSTRUCTOR (Metodo que se llama cuando creamos un objeto)
    public Ticket(Producto producto1, Producto producto2, double dineroRecibido) {
        this.producto1 = producto1;
        this.producto2 = producto2;
        this.dineroRecibido = dineroRecibido;
        this.totalTicket = producto1.getPrecio() + producto2.getPrecio();
        this.cambioRecibido = dineroRecibido - totalTicket;
    }
    public Producto getProducto1() {
        return producto1;
    }

    public Producto getProducto2() {
        return producto2;
    }
    public double getTotalTicket() {
        return totalTicket;
    }
    public double getDineroRecibido() {
        return dineroRecibido;
    }
    public double getCambioRecibido() {
        return cambioRecibido;
    }
    public void setProducto1(Producto producto1) {
        this.producto1 = producto1;
        recalcular ();
    }
    public void setProducto2(Producto producto2) {
        this.producto2 = producto2;
        recalcular ();
    }
    public void setTotalTicket(double totalTicket) {
        this.totalTicket = totalTicket;
        recalcular ();
    }
    
    private void recalcular () {
        this.totalTicket = producto1.getPrecio() + producto2.getPrecio();
        this.cambioRecibido = dineroRecibido - totalTicket;
    }
    @Override
    public String toString() {
        return """
                ======== TICKET DE COMPRA ========
                Producto:%s
                Producto:%s
                ---------------------------------------
                Total a pagar: $%s
                Dinero recibido: $%s
                Cambio: $%s
                ===================================
                """.formatted(producto1.toString(), producto2.toString(), totalTicket,
                        dineroRecibido, cambioRecibido);
    }
    
}