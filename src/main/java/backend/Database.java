/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author CARNIVAL
 */
public abstract class Database {

    private ArrayList<Record> records = new ArrayList<>();
    public String filename;
    public Database(){};
    //method 8

    public Database(String filename) {
        this.filename = filename;
    }

    public void saveToFile() {
        try ( FileWriter save = new FileWriter(filename)) {
            for (int i = 0; i < records.size(); i++) {
                save.write(records.get(i).LineRepresentation() + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readfromFile() {
        try {
      
            File f = new File(filename);
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                records.add(createRecordFrom(sc.nextLine()));
            }
            sc.close();
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }

    }
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

    //method 3
    public ArrayList<Record> returnAllRecords() {
        return records;
    }

    public boolean contains(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (key.equals(records.get(i).SearchKey())) {
                return true;
            }
        }
        return false;
    }

    public Record getRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (key.equals(records.get(i).SearchKey())) {
                return records.get(i);
            }
        }

        return null;
    }

    public void deleteRecord(String key) {
        for (int i = 0; i < records.size(); i++) {
            if (key.equals(records.get(i).SearchKey())) //error 
            {
                records.remove(i);
                break;
            }
        }

    }

    public abstract Record createRecordFrom(String line);

    public void insertRecord(Record x) {
        if (contains(x.SearchKey()) == false) {
            records.add(x);
        }
    }

}
