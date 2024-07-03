/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author CARNIVAL
 */
public class librariansUser implements Record {
    private String LibrarianId;
    private String Name;
    private String Email;
    private String Address;
    private String PhoneNumber;

    public librariansUser(String LibrarianId, String Name, String Email, String Address, String PhoneNumber) {
        this.LibrarianId = LibrarianId;
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.PhoneNumber = PhoneNumber;
    }

    public String getLibrarianId() {
        return LibrarianId;
    }

    public void setLibrarianId(String LibrarianId) {
        this.LibrarianId = LibrarianId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }
    
    @Override
    public String LineRepresentation(){
        String x=LibrarianId+","+Name+","+Email+","+Address+","+PhoneNumber;
        return x;
    }
     @Override
    public String SearchKey(){
        return LibrarianId;
    }

   
    
    
    
            
     
    
}
