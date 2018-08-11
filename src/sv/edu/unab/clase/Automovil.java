package sv.edu.unab.clase;

import java.util.StringJoiner;

public class Automovil {
    private String placa;
    private String numeroMotor;
    private String modelo;
    private String marca;

    public Automovil() {
    }

    public Automovil(String placa) {
        this.placa = placa;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Automovil)) return false;

        Automovil automovil = (Automovil) o;

        if (!placa.equals(automovil.placa)) return false;
        if (!numeroMotor.equals(automovil.numeroMotor)) return false;
        if (modelo != null ? !modelo.equals(automovil.modelo) : automovil.modelo != null) return false;
        return marca.equals(automovil.marca);
    }

    @Override
    public int hashCode() {
        int result = placa.hashCode();
        result = 31 * result + numeroMotor.hashCode();
        result = 31 * result + (modelo != null ? modelo.hashCode() : 0);
        result = 31 * result + marca.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Automovil.class.getSimpleName() + "[", "]")
                .add("placa='" + placa + "'")
                .add("numeroMotor='" + numeroMotor + "'")
                .add("modelo='" + modelo + "'")
                .add("marca='" + marca + "'")
                .toString();
    }

    public Automovil(String placa, String numeroMotor, String modelo, String marca) {
        this.placa = placa;
        this.numeroMotor = numeroMotor;
        this.modelo = modelo;
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
