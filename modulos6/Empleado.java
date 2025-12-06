package Modulos;

public class Empleado {
    private String clave;
    private double salario;
    private double porRetencion;

    public Empleado(String claveEmpleado, double salarioMes, double porImpuestos){
        this.clave=claveEmpleado;
        this.salario=salarioMes;
        this.porRetencion=porImpuestos;

    }

    public String getClave() {
        return clave;
    }

    public double getSalario() {
        return salario;
    }

    public double getImpuestos() {
        return porRetencion;
    }

    public double calcularSalarioNeto (){
        double impuesto = salario * porRetencion/100;
        double salarioNeto = salario - impuesto;
        return salarioNeto;
    }

    public void aplicarAumento (double porcentajeAumneto){
        if (porcentajeAumneto > 0){
            double aumento = salario * (porcentajeAumneto/100);
            salario += aumento;
            System.out.println("Nuevo salario mensual: $" + salario);
        } else {
            System.out.println("Error: El porcentaje de aumento debe ser mayor a 0");

        }
    }
}
