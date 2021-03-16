/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication5;

    class person 
    {
        String name;
        String id;
        String status;
        String fName;
        
   
        public void set (String name, String id, String status, String fName) 
        {
            this.name = name;
            this.id = id;
            this.status = status;
            this.fName = fName;
            
        }
        public void show () 
        {
            System.out.println("Membuat object class berikut dalam file person.java:");
            System.out.println("Student Name : " +name);
            System.out.println("Student ID : " +id);
            System.out.println("Student Status : " +status);
            System.out.println("Nama variable yang digunakan : " +fName);
        }
    }
    
/**
 *
 * @author Riska
 */
public class JavaApplication5 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    person javaperson = new person();
    javaperson.name = "Lisa Palombo";
    javaperson.id = "123456789";
    javaperson.status = "Active";
    javaperson.fName = "fName, IName, stuld, stuStatus";
    javaperson.show();
    }
    
}
