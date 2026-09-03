public class Publicacion {
    private String id;
    private String autor;
    private String fechaCreacion;
    private int likes;
    protected boolean estaActiva; 

    Publicacion(String id, String autor){
        this.id = id;
        this.autor = autor;
        this.likes = 0;
    }


        //set
    public void validarAutor(String autor){
        if (autor.length() > 20){
            System.err.println("el nombre del autor no puede exceder los 20 caracteres");
        } else {
            this.autor = autor;

        }

    }
    //get
    public String getAutor(){
        return this.autor;
    }
    public void darLikes(){
        this.likes += 1;
    }
    public int visualizarLikes(){
        return this.likes;
    }
}

