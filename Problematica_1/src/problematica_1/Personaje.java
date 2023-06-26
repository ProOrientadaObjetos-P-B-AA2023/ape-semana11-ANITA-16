
package problematica_1;


abstract class Personaje {
    public String nombre;
    public int puntosVida;
    public int nivelExperiencia;
    public int danio;
    public Personaje() {}
    public Personaje(String nombre, int puntosVida, int nivelExperiencia) {
        this.nombre = nombre;
        this.puntosVida = puntosVida;
        this.nivelExperiencia = nivelExperiencia;
    }
    
    public abstract void atacar(Personaje enemigo);
    public abstract void defender();
    
    public void danio(int danioRecibido){
        this.puntosVida = this.puntosVida - danioRecibido;
        if (this.puntosVida <= 0) {
            System.out.println(nombre + " ha sido derrotado.");
        } else{
            System.out.println();
        }
    }

    public String getNombre() {
        return nombre;
    }
    
    public boolean validadVida(){
        if(puntosVida <= 0){
            return false;
        }
        return true; // esta vivo
    }
}

class Guerrero extends Personaje{
    public int nivilFuerza;
    public int nivelHabilidadCombate;

    public Guerrero() {}

    public Guerrero(int nivilFuerza, int nivelHabilidadCombate, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilFuerza = nivilFuerza;
        this.nivelHabilidadCombate = nivelHabilidadCombate;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = this.nivelHabilidadCombate + this.nivilFuerza;
        System.out.println("El Guerrero combate cuerpo a cuerpo con "+ enemigo.getNombre()+ 
                            "\nGenerandole un danio de " + danio);
        enemigo.danio(danio);
    }
    @Override
    public void defender() {
        System.out.println("El Guerrero esquiva el ataque");  
    }
    
}

class Mago extends Personaje{
    public int nivilHechizo;
    public int nivelPoderMagico;

    public Mago() {}
    public Mago(int nivilHechizo, int nivelPoderMagico, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilHechizo = nivilHechizo;
        this.nivelPoderMagico = nivelPoderMagico;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = nivelExperiencia * nivelExperiencia;
        System.out.println("El Mago lanza su Hechizo de nivel "+ this.nivilHechizo + " y lastima a su oponente\n"
                + enemigo.getNombre() +" Generandole un danio de " + danio);
        enemigo.danio(danio); 
    }

    @Override
    public void defender() {
        System.out.println("El mago se evito el ataque con su escudo magico");
    }
}

class Arquero extends Personaje{
    public int nivilPrecision;
    public int nivelHabilidadDistancia;

    public Arquero() {}

    public Arquero(int nivilPrecision, int nivelHabilidadDistancia, String nombre, int puntosVida, int nivelExperiencia) {
        super(nombre, puntosVida, nivelExperiencia);
        this.nivilPrecision = nivilPrecision;
        this.nivelHabilidadDistancia = nivelHabilidadDistancia;
    }
    
    @Override
    public void atacar(Personaje enemigo) {
        danio = nivelExperiencia + nivilPrecision + nivelHabilidadDistancia;
        System.out.println("El Arquero aserto a su enemigo " + enemigo.getNombre() + " con una precision de "+ this.nivilPrecision 
                           + "\nGenerandole un danio de " + danio);
        enemigo.danio(danio);   
    }

    @Override
    public void defender() {
        System.out.println("El Arquero esquiva el ataque");
    }
}