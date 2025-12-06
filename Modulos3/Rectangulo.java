package Modulos;

public class Rectangulo {
    private String identificacion;
    private double base;
    private double altura;

    public Rectangulo (String etiqueta, double ba, double al){
        this.identificacion=etiqueta;
        this.base=ba;
        this.altura=al;
    }

    public double base(){
        return this.base;
    }
    public double altura(){
        return this.altura;
    }
    public String getIdentificacion(){
        return this.identificacion;
    }
    public void setValorAltura (double nuevaAltura){
        if (nuevaAltura>0){
            this.altura=nuevaAltura;
        }else {
            System.out.println("Error");
        }
    }
    public void setValorbase (double nuevaBase){
        if(nuevaBase>0){
            this.base=nuevaBase;
        }else
            System.out.println("Error");
    }
    public double setcalcularArea() {
        return this.base * this.altura;
    }
    public double setcalcularPerimetro(){
        return 2*(this.base + this.altura);
    }


}
