/*
  Write a method called sphereVolume that takes an integer radius
  in its parameter and returns the volume of the sphere.
*/

public class cw2B_9 {
  
    public static double sphereVolume (int r) {
      
      double vol  = 4.0/3.0 * (3.1416 * r * r * r);
      return vol;
      
    }
    
    public static void main (String [] args) {
      
      double volume = sphereVolume(5);
      System.out.println(volume);
  
    }
    
  }