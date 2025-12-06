package modulos;

public class cuentaDeAhorro {
    private String cuenta;
    private String nombre;
    private double saldo;

    public cuentaDeAhorro(String numCuenta,String titular, double saldoActual){
        this.cuenta=numCuenta;
        this.nombre=titular;
        this.saldo=saldoActual;
    }

    public String getNombre() {
        return nombre;
    }
    public String getCuenta() {
        return cuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void depositar(double cantidad){
        if (cantidad > 0){
            saldo += cantidad;
            System.out.println("Deposito realizado" );
        }else{
            System.out.println("Error");
        }
    }
    public void retirar (double cantidad){
        if ((cantidad <= 0)){
            System.out.println("Error, la cantidad debe ser mayor a cero");
        } else if (cantidad> saldo) {
            System.out.println("Error, los fondos son insuficientes");

        }else{
            saldo -=cantidad;
            System.out.println("Retiro exitoso");
        }
    }
}
