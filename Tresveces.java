import java.util.Scanner;
public class Tresveces{
    public static void main(String[]args){
        int z=2;
        Scanner sc=new Scanner(System.in);
        String a= "Abcd";
  
        for(int x=0; x<3; x++){
                  System.out.println("Ingresa la contraseña");
        String b=sc.nextLine();
        if(a.equalsIgnoreCase(b)){
        System.out.println("Contraseña correcta");
        break;}
        else
        System.out.println("Contraseña incorrecta");
        if(z>1){
        System.out.println("Ingrese nuevamente, le quedan "+ z + " intentos");
    }
    if(z==1){
         System.out.println("Ingrese nuevamente, le queda "+ z + " intento");}
             if(z==0){
         System.out.println("Te acabaste los intentos homs");}
    z--;
    }
    }
}

    
    