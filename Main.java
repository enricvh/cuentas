package org.example;

public class Main {

    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        // Creación de la cuenta con datos iniciales
        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", 2500, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es " + saldoActual);

        // Intento de retirada
        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.println("Fallo al retirar: " + e.getMessage());
        }

        // Intento de ingreso
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar: " + e.getMessage());
        }

        // Se invoca el método operativa_cuenta pasando un valor para 'cantidad'
        operativa_cuenta(50.0f);
    }

    /**
     * Método que agrupa las operaciones realizadas sobre la cuenta.
     * <p>
     * Se realizan varios ingresos y una retirada, mostrando el saldo en cada paso.
     * Además, se utiliza el parámetro 'cantidad' para efectuar un ingreso adicional.
     * </p>
     *
     * @param cantidad La cantidad adicional a ingresar en la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        // Creación del objeto cuenta1 utilizando el constructor por defecto
        CCuenta cuenta1 = new CCuenta();
        System.out.println("Saldo Inicial: " + cuenta1.getSaldo() + " euros");

        // Intento de ingreso negativo (depuración)
        try {
            cuenta1.ingresar(-100);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar -100: " + e.getMessage());
        }
        System.out.println("Saldo tras intento de ingreso negativo: " + cuenta1.getSaldo() + " euros");

        // Ingreso de 100 euros
        try {
            cuenta1.ingresar(100);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar 100: " + e.getMessage());
        }
        System.out.println("Saldo tras ingreso de 100 euros: " + cuenta1.getSaldo() + " euros");

        // Ingreso de 200 euros
        try {
            cuenta1.ingresar(200);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar 200: " + e.getMessage());
        }
        System.out.println("Saldo tras ingreso de 200 euros: " + cuenta1.getSaldo() + " euros");

        // Ingreso de 300 euros
        try {
            cuenta1.ingresar(300);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar 300: " + e.getMessage());
        }
        System.out.println("Saldo tras ingreso de 300 euros: " + cuenta1.getSaldo() + " euros");

        // Retirada de 50 euros
        try {
            cuenta1.retirar(50);
        } catch (Exception e) {
            System.out.println("Fallo al retirar 50: " + e.getMessage());
        }
        System.out.println("Saldo tras retirada de 50 euros: " + cuenta1.getSaldo() + " euros");

        // Uso del parámetro 'cantidad' para realizar un ingreso adicional
        try {
            cuenta1.ingresar(cantidad);
        } catch (Exception e) {
            System.out.println("Fallo al ingresar " + cantidad + ": " + e.getMessage());
        }
        System.out.println("Saldo tras ingreso adicional de " + cantidad + " euros: " + cuenta1.getSaldo() + " euros");
    }
}
