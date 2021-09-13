package ProgramasSemana01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MiPrograma {

    public static void main(String[] args) throws IOException {
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int i;
        String sum;
        System.out.println("Welcome to Object Orient Programming: ");
        
        i = System.in.read();
        sum = Character.toString((char) i);
        
        
        System.out.println(sum);
        
    }
    
}
