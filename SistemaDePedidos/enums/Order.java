package enums;

public class Order {
    //Identificador del pedido
    public int id;
    //Nombre del cliente
    public String customerName;
    //Estado del pedido (utilizando la enumeración OrderStatus)
    public OrderStatus status;
    //Prioridad del pedido (utilizando la enumeración OrderPriority)
    public OrderPriority priority;
    //Método de pago (utilizando la enumeración PaymentMethod)      
    public PaymentMethod paymentMethod;

    //Metodo ShowDetails que muestre todos los detalles del pedido
    public void showDetails() {
        //System.out.println("Detalles del Pedido:");
        System.out.println("Pedido: " + id);
        System.out.println("Cliente: " + customerName);
        System.out.println("Estado: " + status.accion());
        System.out.println("Prioridad: " + priority+" (Nivel: "+ priority.getNivel()+")");
        //System.out.println("Prioridad Nivel: " + priority.getNivel() + " - "+ priority.accion());
        System.out.println("Método de Pago: "+ paymentMethod + " ==> " + paymentMethod.accion());
    }
}
