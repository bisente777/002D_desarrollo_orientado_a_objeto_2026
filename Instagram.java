//si un metodo se llama igual a la clase es el constructor 
public class Instagram {
    public static void main(String[] args) {
        System.out.println("iniciando sistema");

        crearPublicacion();
    }
    static void crearPublicacion(){
            Publicacion publicacion_sebita = new Publicacion("1", "@sebita1234");

            Publicacion publicacion_barbarita = new Publicacion("2", "@barbarita1234");

            Publicacion publicacion_alexander = new Publicacion("3", "@alexander1234");


            System.out.println("los autores son");
            System.out.println(publicacion_sebita.getAutor());
            System.out.println(publicacion_barbarita.getAutor());
            System.out.println(publicacion_alexander.getAutor());

            publicacion_sebita.darLikes();

            publicacion_barbarita.darLikes();

            publicacion_alexander.darLikes();

            for (int contador = 0; contador < 1000; contador++) {
                publicacion_alexander.darLikes();
            }
    

            System.out.println("los likes de " + publicacion_sebita.getAutor() + " son " + publicacion_sebita.visualizarLikes());
            System.out.println("los likes de " + publicacion_barbarita.getAutor() + " son " + publicacion_barbarita.visualizarLikes());
            System.out.println("los likes de " + publicacion_alexander.getAutor() + " son " + publicacion_alexander.visualizarLikes());

    }
}

