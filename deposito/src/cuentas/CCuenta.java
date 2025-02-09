package cuentas;

public class CCuenta {

    public String nombre;
    public String cuenta;
    public double saldo;
    public double tipoInterés;

    public CCuenta() {
    }

    public CCuenta(String nom, String cue, double sal, double tipo) {
        nombre = nom;
        cuenta = cue;
        saldo = sal;
        tipoInterés = tipo; // ← Se añadió esta línea
    }

    public double estado() {
        return saldo;
    }

    public double getSaldo() { // ← Nuevo método
        return saldo;
    }

    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }

    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No hay suficiente saldo");
        saldo = saldo - cantidad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getCuenta(){
        return cuenta;
    }
    public void setCuenta(String cuenta){
        this.cuenta = cuenta;
    }
    
      public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getTipoInteres() {
        return tipoInteres;
    }
    
    public void setTipoInteres(double tipoInteres) {
        this.tipoInteres = tipoIntereses;
    }
}
