/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import constants.FilesNames;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARNIVAL
 */
public class LibrarianUserDatabase extends Database  {

    public LibrarianUserDatabase(String filename) {
        super(FilesNames.LIBRARIANS_FILENAME);
        this.filename=filename;
    }

    

    

    
    
 

  

//    @Override
//    public void readfromFile(){
//        try {
//            File f = new File(filename);
//            Scanner sc = new Scanner(f);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                String[] m = line.split(",");
//                librariansUser a = new librariansUser(m[0], m[1], m[2], m[3], m[4]);
//                records.add(a);
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("file not found");        }
//    }
    @Override
    public librariansUser createRecordFrom(String line) {
        String[] r = line.split(",");
        librariansUser w = new librariansUser(r[0], r[1], r[2], r[3], r[4]);
        return w;

    }

//    public ArrayList<librariansUser> returAllRecords() {
//        return records;
//    }

//    public boolean contains(String Key) {
//        for (int i = 0; i < records.size(); i++) {
//            return Key.equals(records.get(i).getLibrarianId());
//
//        }
//        return false;
//    }

//    public librariansUser getRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getLibrarianId())){
//                return records.get(i);
//            }
//        }
//        return null;
//
//    }
//
//    public void insertRecord(librariansUser record) {
//        records.add(record);
//    }
//
//    public void deleteRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getLibrarianId())){
//                records.remove(i);
//                break;
//            }
//        }
//    }

//   public void saveToFile()  {
//       PrintWriter pw = null;
//        try {
//            File f = new File(filename);
//            pw = new PrintWriter(f);
//            for (int i = 0; i < records.size(); i++) {
//                pw.print(records.get(i).getLibrarianId() + ",");
//                pw.print(records.get(i).getName() + ",");
//                pw.println(records.get(i).getEmail());
//                pw.println(records.get(i).getAddress());
//                pw.println(records.get(i).getPhoneNumber());
//            }   pw.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(LibrarianUserDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            pw.close();
//        }
//
//    }


    
}
