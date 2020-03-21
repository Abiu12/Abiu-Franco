public abstract class Persona{
    protected String nombre;
    protected int edad;
    
    public  Persona(String no, int e){
        nombre=no;
        edad=e;
       
    }
    public String getNombre(){
        return nombre;}
    public int getEdad(){
        return edad;}
        
    
       public abstract String comer();
    public abstract String caminar();}
        
    