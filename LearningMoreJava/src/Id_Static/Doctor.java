package Id_Static;

import java.util.ArrayList;
import java.util.Date;

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
    
    //Se agrega la clase static AvaiableAppointment dentro de los <símbolos> 
    //para que el ArrayList solo acepte los tipos de datos que se encuentran 
    //dentro de la clase (ósea date, time).
    
    //Similar a una lista en python
    ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
    
    //Añade al array anterior nuevos objetos de Clase AvailableAppointment
    public void addAvailableAppointment(Date date, String time){
        availableAppointments.add(new Doctor.AvailableAppointment(date,time));
    }
    
    //retorna lo que contiene el array
    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    public static class AvailableAppointment{
        private int id;
        private Date date;
        private String time;

        public AvailableAppointment(Date date, String time) {
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }
    }
}
