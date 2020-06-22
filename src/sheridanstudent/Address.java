/*  The address contains
information such as street info, city and
province.
 */

package sheridanstudent;

public class Address {
    
    private String street;
    private String city;
    private String province;

    public Address() {
        this.city = "Etobicoke";
        this.province = "ON";
    }

    public Address(String street, String city, String province) {
        this.street = street;
        this.city = city;
        this.province = province;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return street + ", " + city + ", " + province;
    }
    
    

}
