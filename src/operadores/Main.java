package operadores;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 1: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite numero 2: "));

        Operacion op1 = new Operacion();

        op1.sumar(num1, num2);
        op1.sumar(num1, num2);
        op1.sumar(num1, num2);
        op1.sumar(num1, num2);
        op1.mostrarDatos();

    }
}
