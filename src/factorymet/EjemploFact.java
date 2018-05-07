package ejemplofact;

/**
 * @author Juan David
 */
public class EjemploFact {


    public static void main(String[] args) {
        
        char claseAnimal = 'C';
        
        Animal animalito = new AnimalFactory().retornarClaseAnimal(claseAnimal);
        
      //AnimalCarnivoro  animalX = new AnimalCarnivoro();
     //   AnimalAcuatico    animalX1 = new AnimalAcuatico();
     //    AnimalHerbivoro  animalX2 = new AnimalHerbivoro();
    //    AnimalTerrestre   animalX3 = new AnimalTerrestre();
        
        
        animalito.setNombre("Patricio");
        animalito.setEdad(10);
        System.out.println("Este animal tiene por nombre: "+animalito.getNombre()+" y tiene "+animalito.getEdad()+" años de edad");
        animalito.alimentar();
       
    }
    
}
