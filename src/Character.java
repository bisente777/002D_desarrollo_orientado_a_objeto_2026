public class Character {
  
    String name;
    private int hit_points;
    int magic_points;
    boolean is_ally;
    private int age;

    public void ValidarEdad(int age){
        if (age < 0) {
            this.age = 0;
        } else {
        this.age = age;
        }
    }

    public String validarnombre(String name){
        if (this.name == "nose") {
            this.name = "***********";
        } else {
            
        }

    }


    public void asignarVida(int hit_points){
        if (hit_points < 0) {
            this.hit_points = 0;
        }else{
            this.hit_points = hit_points;
        }
    }

    public int mostrarVida(){
        return this.hit_points;
    }
    public int mostraredad(){
        return this.age
    }

}
