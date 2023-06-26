
package problematica_1;

import java.util.Scanner;


public class Ejecutor001{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        byte op;
        boolean reiniciar = false;
        Personaje oponente;
        Personaje principal=null;
        
        while(!reiniciar){
            //crear personaje principal
            System.out.println("Crear un personaje");
            System.out.println("[ 1 ] Guerrero");
            System.out.println("[ 2 ] Mago");
            System.out.println("[ 3 ] Arquero");
            op = sc.nextByte();
            
            switch(op){
                case 1:
                    System.out.println("\nIngrsear los datos del GERRERO");
                    System.out.print("Nivel de Fuerza: "); int fuerza = sc.nextInt();
                    System.out.print("Nivel de Habilidad de Combate: "); int combate = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Nombre: "); String name = sc.nextLine();
                    System.out.print("Nivel de Experiencia: "); int exp = sc.nextInt();
                    principal = new Guerrero(fuerza,combate,name,200,exp);
                    break;
                case 2:
                    System.out.println("\nIngrsear los datos del MAGO");
                    System.out.print("Nivel de Hechizos: "); int hechizo = sc.nextInt();
                    System.out.print("Nivel de pode Magico: "); int poder = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Nombre: "); name = sc.nextLine();
                    System.out.print("Nivel de Experiencia: "); exp = sc.nextInt();
                    principal = new Mago(hechizo,poder,name,200,exp);
                    break;
                case 3:
                    System.out.println("\nIngrsear los datos del GERRERO");
                    System.out.print("Nivel de Precision: "); int precision = sc.nextInt();
                    System.out.print("Nivel de Habilidad a distancia: "); int distancia = sc.nextInt();
                    sc.nextLine(); // Consumir el salto de línea pendiente
                    System.out.print("Nombre: "); name = sc.nextLine();
                    System.out.print("Nivel de Experiencia: "); exp = sc.nextInt(); 
                    principal = new Arquero(precision,distancia,name, 200,exp);
                    break;
                default:
                    System.err.println("Error, Opcion Incorrecta");
            }
            //eleguir oponente
            System.out.println("Eleguir Oponente");
            System.out.println("[ 1 ] Guerrero");
            System.out.println("[ 2 ] Mago");
            System.out.println("[ 3 ] Arquero");
            op = sc.nextByte();
            
            switch(op){
                case 1:
                    Guerrero guerrero1 = new Guerrero(5,7,"Hercules",200,10);
                    oponente = guerrero1;
                    break;
                case 2:
                    Mago mago1 = new Mago(8,5,"Merlin",200,10);
                    oponente = mago1;
                    break;
                case 3:
                    Arquero arquero1 = new Arquero(9,9,"Legolas", 200,9);
                    oponente = arquero1;
                    break;
                default:
                    System.err.println("Error, Opcion Incorrecta");
                    continue;
            }
            
            //combatir
            System.out.println("A lucahr!!!!!!");
            while(principal.validadVida() && oponente.validadVida()){
                System.out.println("Elige una acción: ");
                System.out.println("[ 1 ] Atacar");
                System.out.println("[ 2 ] Defender");
                int accion = sc.nextInt();
                
                switch (accion) {
                    case 1:
                        principal.atacar(oponente);
                        break;
                    case 2:
                        principal.defender();
                        break;
                    default:
                        System.err.println("Error, opción incorrecta");
                        continue; // Continuar al siguiente ciclo sin ejecutar el código restante
                }
                oponente.atacar(principal);
                oponente.defender();
                
            }

            //ganador
            if (principal.validadVida()) {
                System.out.println("¡Felicidades! Ganado la batalla.");
            } else {
                System.out.println("Has sido derrotado.");
            } 
            
            // validar para salir del juego
            System.out.println("Desea volver a jugar");
            System.out.println("[ 1 ] SI");
            System.out.println("[ 2 ] NO");
            op = sc.nextByte();
            switch(op){
                case 1:
                    System.out.println("Volvemos a Empezar");
                    break;
                case 2:
                    System.out.println("Saliendo...... Gracias por juagar :3");
                    reiniciar = true;
                    break;
            }
            
        }    
    }
  
}