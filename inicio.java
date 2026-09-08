import java.util.ArrayList;
import java.util.Scanner;

public class inicio {

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Mostrarmenu();
    }
    static void Mostrarmenu(){
        boolean mostrarmenu = true;
        System.out.println("===Inicio de programa===");
        while (mostrarmenu) {
            
        System.out.println("1. probando array");
        System.out.println("2. probando arraylist");
        System.out.println("9. salir");

        System.out.println("Ingrese una opcion");
        String opcion_menu = sc.nextLine();

        switch (opcion_menu) {
            case "1":
                ProbandoArray();
                break;
            case "2":
                ProbandoArraylist();
                
                break;
            case "9":
                mostrarmenu = false;
                
                break;
        
        
            default:
                break;
        }
            
        }
    }
    static void ProbandoArray(){
        System.out.println("///Estudiantes///");
        String [] alumnos = new String[6];                            
        alumnos[0] = "Fernando Macias";  
        alumnos[1] = "Tomas Barria";
        alumnos[2] = "Selena Figueroa";
        alumnos[3] = "Cristian Mancilla";
        alumnos[4] = "Francisco Almonacid";
        alumnos[5] = "Manuel Vivar";             
        Integer[] edades = new Integer[6];
        edades[0] = 23;
        edades[1] = 18;
        edades[2] = 20;
        edades[3] = 19;
        edades[4] = 20;
        edades[5] = 23;
        for (int i = 0; i < edades.length - 1; i++) {
            System.out.println("El estudiante " + alumnos[i] + " tiene " + edades[i] + " años.");
        
        
        }
    }
    static void ProbandoArraylist(){
        System.out.println("=== Probando arraylist ===");
        ArrayList <String> alumnos = new ArrayList<>();
        alumnos.add("Rogelio Huichacura");
        alumnos.add("Zinedine Argel");
        alumnos.add("Martin Cavero");
        alumnos.add("Gabriel Viveros");
        alumnos.add("Andrew Farias");
        alumnos.add("Nicole Aguilar");
        alumnos.add("Daniel Opazo");

        alumnos.set(5, "puly");
        System.out.println(alumnos.get(5));  
        alumnos.remove(4);

        System.out.println(alumnos.size());

        for (String por_cada_alumno : alumnos) {
            System.out.println(por_cada_alumno);
            
        }
    }
}
