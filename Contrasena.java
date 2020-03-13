import java.util.Scanner;
public class Contrasena{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String a= "Abc";
        System.out.println("Ingresa la contraseña");
        String b=sc.nextLine();
        if(a.equalsIgnoreCase(b))
        System.out.println("Contraseña correcta");
        else
        System.out.println("Contraseña incorrecta");
    }
    }
    
    