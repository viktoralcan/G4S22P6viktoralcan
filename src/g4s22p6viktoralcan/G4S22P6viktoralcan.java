package g4s22p6viktoralcan;
import java.util.ArrayList;
import java.util.Arrays;

public class G4S22P6viktoralcan {

    public static void main(String[] args) {
        
        ArrayList<String> lista = new ArrayList<String>(Arrays.asList("A" , "B", "C" ,"D", "F" ));
        
        lista.forEach(contenido -> {
        
            System.out.println("El valor contenido es: " + contenido);
        });
        
        lista.add("G");
        lista.add("H");
        
        System.out.println("\nsegunda forma de trabajar recorridos de listas:\n");
        
        for(String contenido1 : lista) {
            System.out.println("El valor contenido es: " + contenido1);
        }
        
        lista.add("Victor");
        lista.add("Esta linea es muy larga");
        lista.add("Candice");
        lista.add("Segunda linea muy larga sin problemas de almacenamiento");
        
        System.out.println("\nTercer forma de trabajar recorridos de listas:\n");
        
        lista.stream().forEach(contenido2 -> {
            System.out.println("El valor contenido es: " + contenido2);
        });   
    }
}
