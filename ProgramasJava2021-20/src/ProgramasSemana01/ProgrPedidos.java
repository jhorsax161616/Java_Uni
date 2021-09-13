package ProgramasSemana01;

import javax.swing.JOptionPane;

public class ProgrPedidos {

    public static void main(String[] args) {
        
        int InvInic, pedido = 0, num_Pedidos, tv_Faltan = 0;
        
        int PedidoCompleto = 0, PedidoIncompleto = 0, SumVendidos = 0;
        
        String input;
        
        do{
            input = JOptionPane.showInputDialog(null, "Ingrese Inventario de TV Inicial: ", "Inventariado",JOptionPane.QUESTION_MESSAGE);
            InvInic = Integer.parseInt(input);
            
            if (InvInic <= 0)
            {
                JOptionPane.showMessageDialog(null, "Datos incorrectos. Vuelva a ingresar.", "Error de Ingreso", JOptionPane.WARNING_MESSAGE);
            }
        }while(InvInic <= 0);
        
        
        
        do{
            num_Pedidos = PedidoCompleto + PedidoIncompleto;
            do{
                input = JOptionPane.showInputDialog(null, "Ingrese cantidad de TV a llevar: ", "Pedido N°" + (num_Pedidos + 1),JOptionPane.QUESTION_MESSAGE);
                pedido = Integer.parseInt(input);

                if (pedido <= 0)
                {
                    JOptionPane.showMessageDialog(null, "Datos incorrectos. Vuelva a ingresar.", "Error de Ingreso", JOptionPane.WARNING_MESSAGE);
                }
            }while(pedido <= 0);
            
            if(pedido <= InvInic)
            {
                PedidoCompleto++;
                SumVendidos = SumVendidos + pedido;
                InvInic = InvInic - pedido;
                JOptionPane.showMessageDialog(null, "PEDIDO COMPLETO" + "\nNumeros de pedidos completos: " + PedidoCompleto, "Estado de Pedido", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                tv_Faltan += pedido;
                PedidoIncompleto++;
                JOptionPane.showMessageDialog(null, "NO SE PUDO REALIZAR EL PEDIDO" + "\nNumero de pedidos incompletos: " + PedidoIncompleto, "Estado de Pedido", JOptionPane.WARNING_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(null, "TV en inventario: " + InvInic + "\nTV vendidos: " + SumVendidos + "\nTV faltantes para completar pedidos: " + tv_Faltan);
        }while(InvInic > 0);
    }
}
