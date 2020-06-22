/*
 * You are developing an application to keep
track of Sheridan students. Each student has
basic information such as name, student
number and address. The address contains
information such as street info, city and
province.
 */
package sheridanstudent;

public class SheridanStudent {

 
    public static void main(String[] args) {
        
        
        Address address1 = new Address("2085 Islington Ave", "Etobicoke", "ON");
        Address address2 = new Address("2100 Islington Ave", "Etobicoke", "ON");
        
        StudentInfo student1 = new StudentInfo("Hasan Agacci", 12345678, address1);
        StudentInfo student2 = new StudentInfo("Ali Buyuk", 32425346, address2);
        
        System.out.println(student1);
        System.out.println(student2); 
               
    }
    
}
