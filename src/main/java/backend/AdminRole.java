/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import constants.FilesNames;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author CARNIVAL
 */
public class AdminRole {
    private LibrarianUserDatabase database;
    public AdminRole(){
        database = new LibrarianUserDatabase(FilesNames.LIBRARIANS_FILENAME);
        database.readfromFile();
    }
    public void addLibrarian(String LibrarianId,String Name,String Email,String Address,String PhoneNumber) {
        librariansUser O=new librariansUser(LibrarianId,Name,Email,Address,PhoneNumber);
        database.insertRecord(O);
        database.saveToFile();  
    }
    public librariansUser[] getListOfLibrarians(){
        ArrayList<Record> u=database.returnAllRecords();
        librariansUser[] T=new librariansUser[u.size()];
        for (int i = 0; i < u.size(); i++) {
            T[i]=(librariansUser) u.get(i);
        }
          return T;      
        
        }
    
    public void removeLibrarian(String key){
        database.deleteRecord(key);
        database.saveToFile();
    }
    public void logout(){
        database.saveToFile();
    }
    
}
