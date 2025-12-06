package Modulos;

public class Temperatura {
    private double valor;
    private String unidad;
    private String fecha;

    public Temperatura ( double temperatura, String uniMedida, String registro){
        this.valor=temperatura;
        this.unidad=uniMedida;
        this.fecha= registro;
    }

    public double getValor() {
        return valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public String getFecha() {
        return fecha;
    }
    public void setconvertirValor (){
        if ( unidad.equals("Celcius")){
            valor = (valor * 9/5) + 32;
            unidad = "Fahrenheit";
        } else if (unidad.equals("Fahrenheit")) {
            valor = (valor - 32)/1.8;
            unidad = "Celsius";

        }

    }
    public void verificarExtrema() {
        double limiteCelsius = 40.0;

        if (unidad.equals("Celsius")) {
            if (valor > limiteCelsius) {
                System.out.println("TEMPERATURA EXTREMA");
            } else {
                System.out.println("Temperatura normal");
            }
        } else {
            double valorCelsius = (valor - 32) * 5/9;
            if (valorCelsius > limiteCelsius) {
                System.out.println("TEMPERATURA EXTREMA");
            } else {
                System.out.println("Temperatura normal");
            }
        }
    }

}
