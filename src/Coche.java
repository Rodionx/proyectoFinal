public class Coche {

    private String matricula;
    private String marca;
    private double tiempo;
    private double precio;
    private boolean estacionado;

    public Coche(String matricula, String marca, double tiempo, double precio, boolean estacionado) {
        this.matricula = matricula;
        this.marca = marca;
        this.tiempo = tiempo;
        //pasar a metodo.
        //funcion pagar estacionamiento.
        this.precio = precio;
        this.estacionado = estacionado;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public double getTiempo() {
        return tiempo;
    }

    public double getPrecio() {
        return precio;
    }

    public boolean isEstacionado() {
        return estacionado;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
}
