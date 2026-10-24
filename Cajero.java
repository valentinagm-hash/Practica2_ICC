public class Cajero {
    public static void main(String[] args){
        Producto prod1 = new Producto("Yogurt", 1, 43.45);
        Producto prod2 = new Producto("Manzana", 2, 23.50);

        Ticket miTicket = new Ticket(prod1, prod2, 100.00);
        System.out.println(miTicket);
    }
}
