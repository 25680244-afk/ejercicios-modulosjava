package modulos;

public class Control {
    private String Referencia;
    private int stock;
    private double precio;

    public Control (String ref, int inventario, double preVenta){
        this.Referencia =ref;
        this.stock=inventario;
        this.precio=preVenta;
    }

    public String getReferenciareferencia(){
        return this.Referencia;
    }
    public int getStockstock(){
        return this.stock;
    }
    public double getPreciopreio(){
        return this.precio;
    }
        public void incrementarStock(int cantidadEntrada) {
            if (cantidadEntrada > 0) {
                this.stock += cantidadEntrada;
                System.out.println("Stock actualizado ");
                System.out.println("Entrada registrada: " + cantidadEntrada + " unidades.");
                System.out.println("Nuevo stock total: " + this.stock + " unidades.");
            } else {
                System.out.println("Error: La cantidad de entrada debe ser mayor a 0.");
            }
        }

        public double calcularValorTotalStock() {
            double valorTotal = this.stock * this.precio;
            return valorTotal;
        }



}
