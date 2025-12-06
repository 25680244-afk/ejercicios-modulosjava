package Modulos;

public class Sistema {
        private String codigo;
        private int capacidadMax;
        private int reservados;
        private double boleto;

        public Sistema(String cod, int max, int asientos, double costo) {
            this.codigo = cod;
            this.capacidadMax = max;
            this.reservados = asientos;
            this.boleto = costo;
        }

        public String getcodigoVuelo(){
            return this.codigo;
        }

        public int getCapacidadMax(){
            return this.capacidadMax;
        }

        public int getReservados(){
            return this.reservados;
        }

        public double getBoleto() {
            return this.boleto;
        }

        public void Asientos(int cantidadAs){

            int disponibles = this.capacidadMax - this.reservados;

            if(cantidadAs <= disponibles && cantidadAs > 0){
                this.reservados += cantidadAs;
                System.out.println("Reserva Exitosa");
                System.out.println("Asientos reservados: " + cantidadAs);
            } else if (cantidadAs <= 0) {
                System.out.println("Error: Debe reservar al menos 1 asiento");
            } else {
                System.out.println("Intento de reserva de " + cantidadAs + " asientos: FALLIDO");
                System.out.println("Motivo: Solo hay " + disponibles + " asientos disponibles");
            }
        }

        public double Porcentaje(){
            double porcentaje = (this.reservados * 100.0) / this.capacidadMax;
            return porcentaje;
        }



    }
