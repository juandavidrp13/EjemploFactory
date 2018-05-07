/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplofact;

/**
 *
 * @author Juan David
 */
public class AnimalFactory {
    public Animal retornarClaseAnimal (char claseAnimal){
         switch (claseAnimal) {
      case 'A':
           return new AnimalAcuatico();
      case 'C':
           return new AnimalCarnivoro();
      case 'H':
          return new AnimalHerbivoro();
      case 'T':
          return new AnimalTerrestre();
      }
        return null;
    }
    
}
