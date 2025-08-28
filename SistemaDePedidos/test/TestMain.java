//Crear 3 pedidos:
//Pedido#1:
//Cliente:
public class TestMain {
    public static void main(String[] args) {
        enums.Order order1 = new enums.Order();
        order1.id = 1;
        order1.customerName = "Ana";
        order1.status = enums.OrderStatus.NEW;
        order1.priority = enums.OrderPriority.HIGH;
        order1.paymentMethod = enums.PaymentMethod.CARD;

        enums.Order order2 = new enums.Order();
        order2.id = 2;
        order2.customerName = "Luis";
        order2.status = enums.OrderStatus.SHIPPED;
        order2.priority = enums.OrderPriority.MEDIUM;
        order2.paymentMethod = enums.PaymentMethod.CASH;

        enums.Order order3 = new enums.Order();
        order3.id = 3;
        order3.customerName = "Marta";
        order3.status = enums.OrderStatus.DELIVERED;
        order3.priority = enums.OrderPriority.LOW;
        order3.paymentMethod = enums.PaymentMethod.TRANSFER;

        //Mostrar detalles de cada pedido
        System.out.println("===========PEDIDOS============");
        order1.showDetails();
        System.out.println("=============================="); 
        order2.showDetails();
        System.out.println("=============================="); 
        order3.showDetails();
        System.out.println("==============================");
    }
    
}
