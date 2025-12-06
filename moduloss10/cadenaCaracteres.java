package Modulos;

public class cadenaCaracteres {
    private String cadenaActual;
    private String identificador;
    private int longitudMax;

     public cadenaCaracteres (String texto, String ide, int longMax) {
         this.cadenaActual = texto;
         this.identificador=ide;
         this.longitudMax=longMax;
     }

    public String getCadenaActual() {
        return cadenaActual;
    }

    public String getIdentificador() {
        return identificador;
    }

    public int getLongitudMax() {
        return longitudMax;
    }
    public void anadirPrefijo(String prefijo) {
        String nuevoTexto = prefijo + cadenaActual;
        System.out.println("Texto con prefijo: " + nuevoTexto);


        if (nuevoTexto.length() <= longitudMax) {
            cadenaActual= nuevoTexto;
        } else {
            System.out.println("Error: El texto excede la longitud máxima");
        }
    }

    public int contarEspacios() {
        int contador = 0;

        for (int i = 0; i < cadenaActual.length(); i++) {
            if (cadenaActual.charAt(i) == ' ') {
                contador++;
            }
        }

        return contador;
    }
}
