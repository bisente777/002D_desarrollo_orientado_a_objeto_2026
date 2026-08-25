import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;



public class Main {

  public static void main(String[] args) {

    showMenu();
  }

  static void showMenu(){
   Scanner scanner = new Scanner(System.in);
  Character player_character = new Character();
    boolean flag_menu = true;
    System.out.println("****WELCOME TO THE SEVEN KINGDOMS****");
    while (flag_menu) {
      System.out.println("1.- CREATE CHARACTER");
      System.out.println("2.- VISUALIZE CHARACTER");
      System.out.println("3.- EXIT");
      System.out.println("CHOOSE AN OPTION");
      String user_option = scanner.nextLine();

      switch (user_option) {

        case "1":
          CreateCharacter(player_character, scanner);
          break;

        case "2":
          ShowCharacter(player_character);        
          break;

        case "3":
          System.out.println("GRACIAS POR JUGAR, VUELVA PRONTO");
          flag_menu = false;
          break;

        default:
          System.out.println("OPCIÓN INVALIDA");
          break;
    }
  }
} 
   
static void CreateCharacter(Character player_character, Scanner scanner) {


        Enderman enderman = new Enderman();
        Creeper creeper = new Creeper();
        Zombie zombie = new Zombie();
        Dragon dragon = new Dragon();
        

          System.out.println("CREATING CHARACTER");
          //NOMBRE DEL PERSONAJE
          System.out.println("INNGRESE UN NOMBRE");
          player_character.ValidarNombre(scanner.nextLine());

          //VIDA DEL PERSONAJE
          System.out.println("INNGRESE LOS PUNTOS DE VIDA");
          player_character.asignarVida(Integer.parseInt(scanner.nextLine()));

          //PUNTOS MAGICO
          System.out.println("INNGRESE EL MANÁ");
          player_character.magic_points = Integer.parseInt(scanner.nextLine());
          
  }
static void ShowCharacter(Character player_character) {
   System.out.println("VER PERSONAJE");
          System.out.println("NOMBRE: " + player_character.MostrarNombre());
          System.out.println("HP: " + player_character.mostrarVida());
          System.out.println("MANÁ: " + player_character.magic_points);
 } 
 public static String showMenuMob(Scanner scanner) {
  System.out.println("que mob quieres crear");
  System.out.println("1. creeper");
  System.out.println("2 zombie");
  System.out.println("3 dragon");
  System.out.println("4 enderman");
  String mob_option = scanner.nextLine();
  switch (mob_option) {
    case "1":
      return "1";
      break;

    case "2":
      return "2";
      break;  

    case "3":
      return "3";
      break;

    case "4":
      return "4";
      break;
    
    default:
      return "nose we";
      break;
  }
 }
}


//implementar menu en la creacion de personaje que me permita elegir que quiero crear