package enums;

public enum PaymentMethod {
    CASH {
        @Override
        public String accion() {
            return "Efectivo.";
        }
    },
    CARD {
        @Override
        public String accion() {
            return "Tarjeta de crédito/débito.";
        }
    },
    TRANSFER {
        @Override
        public String accion() {
            return "Transferencia bancaria.";
        }
    };

    public abstract String accion();
}
