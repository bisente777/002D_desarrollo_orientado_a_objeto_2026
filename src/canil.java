public class canil {
    public static void main(String[] args) {
    System.out.println("bienvenido al canil");        
    perro perro_del_profe = new perro();

    perro_del_profe.nombre = "gimli";
    perro_del_profe.edad = 6;
    perro_del_profe.peso = 40.5;
    perro_del_profe.tiene_vacuna = false;

    perro mi_perro = new perro();
    mi_perro.nombre = "nala";
    mi_perro.edad = 3;
    mi_perro.peso = 3.2;
    mi_perro.tiene_vacuna = true;
    
    if (mi_perro.edad > 2){
        System.out.println("tiene mas de dos años. su edad es " +  mi_perro.peso );
    } else {
        System.out.println("no tiene mas de dos años");
    }   

    if (mi_perro.peso > 20){
        System.out.println("perro pesado. pesa" + mi_perro.peso);
    } else {
        System.out.println("buen pseo xd");
    }
    if (mi_perro.tiene_vacuna == true){
        System.out.println("esta vacunado, puede entrar al canil.");
    } else {
        System.out.println("no esta vacunado, no puede entrar al canil.");
    }
    }
}