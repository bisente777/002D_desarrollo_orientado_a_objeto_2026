import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        showmenu();
    
        }

     static void showmenu(){
        Scanner scanner = new Scanner(System.in);
        Character player_chacarter = new Character();
                boolean flag_menu = true;

                System.out.println("***Welcom to the seven kingdoms***");

                while (flag_menu)  {
                System.out.println("1. Create Character");
                System.out.println("2. Visualize Character");
                System.out.println("3. EXIT");
                
                System.out.println("Choose an option");
                
                String user_opcion = scanner.nextLine();

                switch (user_opcion) {
                    case "1":
                        System.out.println("Creating Character");
                        ;
                        //nombre del personaje
                        System.out.println("Ingrese un nombre:");
                        player_chacarter.name = scanner.nextLine();

                        // vida del personaje
                        System.out.println("Ingrese los puntos de vida del personaje:");
                        player_chacarter.hit_points = Integer.parseInt(scanner.nextLine()); 

                        //magia del personaje
                        System.out.println("Ingrese los puntos de magia del personaje:");
                        player_chacarter.magic_points = Integer.parseInt(scanner.nextLine());
                        


                        break;

                    case "2":
                        System.out.println("Ver personaje");
                        System.out.println("Nombre: " + player_chacarter.name);
                        System.out.println("HP: " + player_chacarter.hit_points);
                        System.out.println("Maná: " + player_chacarter.magic_points);
                        break;

                    case "3":
                        System.out.println("Gracias por jugar, vuelva pronto");
                        flag_menu = false;
                        break;
                
                    default:
                        System.out.println("Opcion invalida");
                        break;
                                    }
                                }
                         }
        
        
}