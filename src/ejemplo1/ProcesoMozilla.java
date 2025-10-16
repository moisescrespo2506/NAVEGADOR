package classes;

import java.io.IOException;
import java.net.URI;

public class ProcesoMozilla {

public static void main(String[] args) {
    
    try {

        ProcessBuilder pb = new ProcessBuilder("C:\\Program Files\\Mozilla Firefox\\firefox.exe", "https://www.youtube.com");
        pb.start();
        System.out.println("El proceso se ha iniciado correctamente.");
    } catch (IOException e) {
        System.out.println("El proceso no se ha podido iniciar.");
        e.printStackTrace();
    }

}

}