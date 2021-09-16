package Id_Static;

public class Doctor {
    
    public String name;
    static int Id;
    
    Doctor(){
        System.out.println("Construyendo el Objeto de Doctor");
        Id++;
    }
    
    public void showName(){
        System.out.println("Nombre: " + name);
    }
    public void showId(){
        System.out.println("Id: " + Id);
    }
}
