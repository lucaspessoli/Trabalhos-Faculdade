package projetoexercicio2;

public class ProjetoExercicio2 {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal animal = new Animal();
        
        cachorro.EmitirSom();
        cachorro.Mover();
        gato.EmitirSom();
        gato.Mover();
    }
    
}
