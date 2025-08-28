//Cada prioridad debe tener un número de atención(1= baja, 2= media, 3= alta) y un método que retorne una acción específica para cada prioridad.

package enums;

public enum OrderPriority {
    LOW(1) {
        @Override
        public String accion() {
            return "Prioridad baja.";
        }
    },
    MEDIUM(2) {
        @Override
        public String accion() {
            return "Prioridad media.";
        }
    },
    HIGH(3){
        @Override
        public String accion() {
            return "Prioridad alta.";
        }
    };

    private final int nivel;

    public int getNivel() {
        return nivel;
    }

    OrderPriority(int nivel) {
        this.nivel = nivel;
    }

    public abstract String accion();
   
    
}
