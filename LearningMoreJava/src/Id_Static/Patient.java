package Id_Static;

/**
 Los getters y setters nos van a ayudar a respetar nuestra
 regla de negocios
 @author jhorsax
 */
public class Patient {
    int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double height;
    String blood;
    
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }
    //Convencion de nombres para una funcion que obtiene datos
    //setNamevariable()
    //Y para obtener datos con setNameVariable()
    // 54.5
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // 54.5 Kg. String
    public String getWeight(){
        return this.weight + " Kg.";
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getHeight() {
        return height + " Mts.";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    //Aplicacion de regla de negocio
    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() != 9){
            System.out.println("El número telefónico debe ser de 9 dígitos");
        }else if(phoneNumber.length() == 8){
            this.phoneNumber = phoneNumber;
        }

    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }
    
}
