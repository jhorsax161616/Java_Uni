package Proyecto_Clinica;

/**
 Los getters y setters nos van a ayudar a respetar nuestra
 regla de negocios
 @author jhorsax
 */
public class Patient extends User{

    private String birthday;
    private double weight;
    private double height;
    private String blood;
    
    Patient(String name, String email){
        super(name, email);
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
    
    @Override
    public String toString(){
        return super.toString() + "\nAge: " + birthday + "\nWeight: " + getWeight()+
                "\nHeight: " + getHeight() + "\nBlodd: " + blood;
    }
}
