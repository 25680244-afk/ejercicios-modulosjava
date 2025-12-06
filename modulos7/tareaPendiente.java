package Modulos;

public class tareaPendiente {
        private String descripcion;
        private String prioridad;
        private boolean indicador;

        public tareaPendiente(String descripTarea, String prioridadAsignada){
            this.descripcion=descripTarea;
            this.prioridad=prioridadAsignada;
            this.indicador=false;

        }

        public String getDescripcion() {
            return descripcion;
        }

        public String getPrioridad() {
            return prioridad;
        }

        public boolean getIndicador() {
            return indicador;
        }

        public void marcarComoCompletada() {
            indicador =! indicador;
            System.out.println("Estado cambiado a: " + (indicador ? "Completada" : "Pendiente"));
        }
        public boolean esUrgente() {
            return prioridad.equals("Alta") && !indicador;
        }


    }

