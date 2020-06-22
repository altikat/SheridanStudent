/* Each student has
basic information such as name, student
number and address. The address contains
information such as street info, city and
province.
 */

package sheridanstudent;


public class StudentInfo {
    
    private String name;
    private int number;
    private Address address;

    public StudentInfo() {
    }

    public StudentInfo(String name, int number, Address address) {
        this.name = name;
        this.number = number;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return  "Name: " + name + ", Student number: " + number + ", Address: " + address;
    }
    
    

}
