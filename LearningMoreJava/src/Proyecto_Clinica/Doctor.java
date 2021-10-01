package Proyecto_Clinica;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{
       
    public String speciality;
    
    Doctor(String name, String email){
        super(name, email);
    }
    
    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
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
    
    @Override
    public String toString(){
        return super.toString() + "\nSpeciality: " + speciality + "\nAvaible: \n" +
                                availableAppointments.toString();
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
        
        @Override
        public String toString(){
            return "Available Appointments \nDate: " + date + "\nTime: " + time;
        }
    }
}
