public class Estudiante extends Persona{

    public Estudiante(String nombre,String ocupacion, int edad){
        super(nombre,ocupacion,edad);
    }

    public void comer() {
        System.out.println("Ñom Ñom completo Gorbea");
    }

    public void dormir() {
        System.out.println("ZzzZzZ");
    }

    public String hacerLoSuyo() {
        return "Quedarse en casa, ver animé y series en Netflix";
    }
}
