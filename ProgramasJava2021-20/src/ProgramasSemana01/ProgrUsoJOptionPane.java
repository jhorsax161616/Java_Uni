package ProgramasSemana01;

import javax.swing.JOptionPane;

public class ProgrUsoJOptionPane {

    public static void main(String[] args) {
        
        int num1, num2, num3;
        String input;
        
        do{
            input = JOptionPane.showInputDialog("Ingrese primer número: ");
            num1 = Integer.parseInt(input);
            
            if (num1 <= 0)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. Vuelva a ingresar.", "SUMA", JOptionPane.WARNING_MESSAGE);
            }
        }while(num1 <= 0);
        
        do{
            input = JOptionPane.showInputDialog("Ingrese segundo número: ");
            num2 = Integer.parseInt(input);
            
            if (num2 <= 0)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. Vuelva a ingresar.", "SUMA", JOptionPane.WARNING_MESSAGE);
            }
        }while(num2 <= 0);
        
        num3 = num1 + num2;
        
        JOptionPane.showMessageDialog(null, "La suma es: " + num3);
        
        System.exit(0);
    }
    
}
