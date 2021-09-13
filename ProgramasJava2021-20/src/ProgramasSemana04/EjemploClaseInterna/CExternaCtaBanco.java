package ProgramasSemana04.EjemploClaseInterna;

public class CExternaCtaBanco {
    
    private double balance;
    private double rate;
    
    public CExternaCtaBanco(double inicialBalance, double aRate) {
        
        balance = inicialBalance;
        rate = aRate;
    }
    
    public void Reporte(){
        CInterna inter = new CInterna();
        System.out.println("El nuevo balance: "+ inter.Calcula() + "\n");
    }
    
    class CInterna{
        public String Calcula(){
            
            double interest = balance * rate / 100;
            balance += interest;
            
            return "balance = " + balance;
        }
    }
}
