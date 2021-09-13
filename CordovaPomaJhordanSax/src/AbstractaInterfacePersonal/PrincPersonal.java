package AbstractaInterfacePersonal;

public class PrincPersonal {

    public static void main(String[] args) {
        // TODO code application logic here
        int DNIPersonal, CantDiasTrabajados;
        String Nombres;
        float SueldoBase, PagoComision;
        float Aguinaldos;
        float Utilidades;
        int CantHorasExtras;
        int CantHorasAsignadas;
        int op;
        do{
            System.out.println("\n====MENU INDUSTRIAS====");
            System.out.println("\n1. Personal Ventanilla");
            System.out.println("2. Personal Directivo");
            System.out.println("3. Salir");
            
            System.out.print("\nIngrese Opcion: ");
            op = Integer.parseInt(leerCadena.lectura());
            
            switch(op){
                case 1:{
                        int op2;
                        do{
                            System.out.println("\n====MENU PERSONAL VENTANILLA====");
                            System.out.println("\n1. Tiempo Completo");
                            System.out.println("2. Tiempo Parcial");
                            System.out.println("3. Salir");
            
                            System.out.print("\nIngrese Opcion: ");
                            op2 = Integer.parseInt(leerCadena.lectura());
            
                            switch(op2){
                                case 1:{
                                    System.out.print("Ingrese Nombres: ");
                                Nombres = leerCadena.lectura();
                                System.out.print("Ingrese DNI: ");
                                DNIPersonal = Integer.parseInt(leerCadena.lectura());
                                System.out.print("Ingrese Sueldo Base: ");
                                SueldoBase = Float.parseFloat(leerCadena.lectura());
                                System.out.print("Ingrese Aguinaldos: ");
                                
                                Aguinaldos= Float.parseFloat(leerCadena.lectura());
                                System.out.print("Ingrese Utilidades: ");
                                
                                Utilidades= Float.parseFloat(leerCadena.lectura());
                                System.out.print("Ingrese Cantida horas extras: ");
                                
                                CantHorasExtras= Integer.parseInt(leerCadena.lectura());
                                
                                PersonalVentanillaTiempoCompleto per2 = new PersonalVentanillaTiempoCompleto();
                                
                                per2.IngresePVTC(Aguinaldos, Utilidades, CantHorasExtras, DNIPersonal, Nombres, SueldoBase);
                                
                                System.out.println("\n===MOSTRANDO DATOS===");
                                per2.MuestrePVTC();
                                
                                }break;
                
                                case 2:{
                                    System.out.print("Ingrese Nombres: ");
                                Nombres = leerCadena.lectura();
                                System.out.print("Ingrese DNI: ");
                                DNIPersonal = Integer.parseInt(leerCadena.lectura());
                                System.out.print("Ingrese Cantidad horas asignadas: ");
                                CantHorasAsignadas = Integer.parseInt(leerCadena.lectura());
                                System.out.print("Ingrese Cantidad Dias Trabajados: ");
                                CantDiasTrabajados = Integer.parseInt(leerCadena.lectura());
                                
                                PersonalVentanillaTiempoParcial per3 = new PersonalVentanillaTiempoParcial();
                                
                                per3.IngresePVTP(CantHorasAsignadas, DNIPersonal, Nombres, CantDiasTrabajados);
                                System.out.println("\n===MOSTRANDO DATOS===");
                                per3.MuestrePVTP();
                                }break;
                
                                case 3:{
                                    System.out.println("Adios... GRACIAS");
                                }break;
                            }
                        }while(op2 != 3);
                }break;
                
                case 2:{
                        System.out.print("Ingrese Nombres: ");
                        Nombres = leerCadena.lectura();
                        System.out.print("Ingrese DNI: ");
                        DNIPersonal = Integer.parseInt(leerCadena.lectura());
                        System.out.print("Ingrese Cantidad de dias trabajados: ");
                        CantDiasTrabajados = Integer.parseInt(leerCadena.lectura());
                        System.out.print("Ingrese Pago por comision: ");
                        PagoComision = Float.parseFloat(leerCadena.lectura());
                        System.out.print("Ingrese Sueldo Base: ");
                        SueldoBase = Float.parseFloat(leerCadena.lectura());
                        
                        PersonalDirectivo per1 = new PersonalDirectivo();
                        
                        per1.IngreseDatosPD(SueldoBase, PagoComision, DNIPersonal, Nombres, CantDiasTrabajados);
                        
                        System.out.println("\n===MOSTRANDO DATOS===");
                        per1.MuestraDatosPD();
                        
                        
                }break;
                
                case 3:{
                    System.out.println("Adios... GRACIAS");
                }break;
            }
        }while(op != 3);
    }
    
}
