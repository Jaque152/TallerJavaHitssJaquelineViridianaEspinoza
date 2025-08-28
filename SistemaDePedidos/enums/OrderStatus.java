package enums;

public enum OrderStatus {
    NEW {
        @Override
        public String accion() {
            return "Nuevo pedido creado";
        }
    }, 
    PROCESSING {
        @Override
        public String accion() {
            return "Pedido en proceso";
        }
    }, 
    SHIPPED {
        @Override
        public String accion() {
            return "Pedido enviado";
        }
    }, 
    DELIVERED {
        @Override
        public String accion() {
            return "Pedido entregado";
        }
    }, CANCELED {
        @Override
        public String accion() {
            return "Pedido cancelado";
        }
    };

   public abstract String accion(); 
}
