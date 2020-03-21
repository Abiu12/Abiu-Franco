public class Alumno extends Persona{
    public Alumno(String nombre,int edad){
        super(nombre, edad);
    }
    public String comer(){
   return "El alumno esta comiendo";
    }
    public String caminar(){
      return "El alumno esta caminando";}
    Alumno a=new Alumno("Juan",12);
    
}

    