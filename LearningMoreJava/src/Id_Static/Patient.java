package Id_Static;

/**
 *
 * @author jhorsax
 */
public class Patient {
    int id;
    private final String name;
    private final String email;
    private String address;
    private String phoneNumber;
    private String birthday;
    private double weight;
    private double heigh;
    String blood;
    
    Patient(String name, String email){
        this.name = name;
        this.email = email;
    }
    
}
