package modulos;

public class Libros {
    private String identificador;
    private String autor;
    private int anio;
    private String estado;

    public Libros(String id, String au, int fecha) {
        this.identificador = id;
        this.autor = au;
        this.anio = fecha;
        this.estado = "disponible";
    }

    public String getIdentificador() {
        return this.identificador;
    }

    public String getAutor() {
        return this.autor;
    }

    public int getAnio() {
        return this.anio;
    }

    public String getEstado() {
        return this.estado;
    }

    public boolean esAptoParaPrestamo() {
        int anioActual = java.time.Year.now().getValue();
        int antiguedad = anioActual - this.anio;

        if (antiguedad <= 5) {
            return true;
        } else {
            return false;
        }
    }

    public void reservar() {
        if (this.estado.equals("disponible")) {
            if (esAptoParaPrestamo()) {
                this.estado = "reservado";
                System.out.println("Reserva exitosa para: " + this.identificador);
            } else {
                System.out.println("No se puede reservar. Publicado hace más de 5 años.");
            }
        } else {
            System.out.println("El libro ya está reservado.");
        }
    }
}
