package Enum;
/*@author jhorsax*/

public class Enum_Usos {
    public enum Day {
        MONDAY("Lunes","Jibarosato"),
        TUESDAY("Martes", "Ojisato"),
        WEDNESDAY("Miercoles","Mabasato"),
        THURSDAY("Jueves", "Otsisato"),
        FRIDAY("Viernes","Kinisato" ),
        SATURDAY("sabado", "Kibantasato"),
        SUNDAY("Domingo", "Ñatsasato");

        private String spanish;
        private String french;
        private Day(String s, String f) {
        spanish = s;
        french = f;
        }

        public String getSpanish() {
            return spanish;
        }
        public String getAshaninka() {
            return french;
        }
        }
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(Day.FRIDAY.getSpanish() + " " + Day.FRIDAY.getAshaninka());
        
        //Tambien podemos recorrerlo por indices con el metodo .values()
        //Aplicando el ForEach
        for (Day dias: Day.values())
        {
            System.out.println(dias.getSpanish() + " : " + dias.getAshaninka());
        }
    }
    
}
