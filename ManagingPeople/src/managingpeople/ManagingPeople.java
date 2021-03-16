/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managingpeople;

    class Person
    {
        String Nama;
        int Umur;
        
        Person(String inputNama, int inputUmur){
            Nama = inputNama;
            Umur = inputUmur;
        }
    }
            
/**
 *
 * @author Riska
 */
public class ManagingPeople {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Person p1 = new Person("Arial", 37);
         Person p2 = new Person("Joseph", 15);
         
         if (p1.Umur==p2.Umur){
             System.out.println(p1.Nama+" is the same age as "+p2.Nama);
         }
         else
         {
             System.out.println(p1.Nama+" is NOT the same age as "+p2.Nama);
         }
    }
    
}
