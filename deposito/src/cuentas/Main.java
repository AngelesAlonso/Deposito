package cuentas;

public class Main {

     
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);

        operativa_cuenta(cuenta1, 500, 695);

        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual tras la transacción es " + saldoActual);
}

 public static void operativa_cuenta(CCuenta cuenta1, double cantidadRetiro, double cantidadIngreso){
    System.out.println("Saldo inicial: " + cuenta1.getSaldo());

        try {
            System.out.println("Intentando retirar " + cantidadRetiro);
            cuenta1.retirar(cantidadRetiro);
            System.out.println("Saldo después de retirar: " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(cantidadIngreso);
            System.out.println("Saldo después de ingresar: " + cuenta1.getSaldo());
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
    }

