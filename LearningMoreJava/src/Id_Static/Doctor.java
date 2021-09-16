package Id_Static;

public class Doctor {
    
    public String name;
    static int Id = 0;//Autoincrement
    String email;
    public String speciality;
    
    Doctor(){
        System.out.println("Construyendo el Objeto de Doctor");
    }
    Doctor(String name, String speciality){
        Id++;
        this.name = name;
        this.speciality = speciality;
    }
    public void showName(){
        System.out.println("Nombre: " + name);
    }
    public void showId(){
        System.out.println("Id: " + Id);
    }
}
