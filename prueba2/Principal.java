package prueba2;
import java.util.*;

public class Principal {
    
    public static void main(String[] args) {
        Scanner lector = new Scanner (System.in);
        
        Estudiantes [] estudiantes = new Estudiantes [5];
        Materias [] materias = new Materias [10];
       // Materias materias = new Materias ();
        String [] nombre={" "," "," "," "," "};
        int [] edad={1,2,3,4,5};
        String [] nombremateria = {" "," "," "," "," "," "," "," "," "," "};
        int [] nivel ={1,2,3,4,5,6,7,8,9};
        
        System.out.println("       INFORMACION DE ESTUDIANTES: ");
        for(int i=0; i<5 ; i++){
            System.out.println("ESTUDIANTE "+(i+1)+": ");
            System.out.println("Ingrese el nombre: ");
            nombre [i] = lector.nextLine();
            System.out.println("Ingrese la edad: ");
            edad [i] = lector.nextInt();
            System.out.println("MATERIAS ");
            System.out.println("Materia 1: ");
            System.out.println("Nombre de la materia: ");
            lector.nextLine();
            nombremateria [i] = lector.nextLine();
            System.out.println("Nivel: ");
            nivel [i] = lector.nextInt();
            materias [i] = new Materias (nombremateria[i],nivel[i]);
            System.out.println("Materia 2:");
            System.out.println("Nombre de la materia: ");
            lector.nextLine();
            nombremateria [i+1] = lector.nextLine();
            System.out.println("Nivel: ");
            nivel [i+1] = lector.nextInt();
            materias [i+1] = new Materias (nombremateria[i+1],nivel[i+1]);
            estudiantes[i]= new Estudiantes (nombre[i],edad[i],materias[i]);
            System.out.println("Se ha ingresado el estudiante con los siguientes datos: ");
            System.out.println("Nombre: "+estudiantes[i].getNombre()+" Edad: "+estudiantes[i].getEdad()
            +" Materias: ");
            
            System.out.println("Materia 1: "+materias[i].getNombremateria()+" - "+materias[i].getNivel()+" Nivel");
            System.out.println("Materia 2: "+materias[i+1].getNombremateria()+" - "+materias[i+1].getNivel()+" Nivel");
            lector.nextLine();
            
            
        }
        
        for(int i=0; i<10; i++){
            if(estudiantes[i].equals(estudiantes[i+1])){
                System.out.println("Existen estudiantes duplicados");
            }
        }
        
    }
}
