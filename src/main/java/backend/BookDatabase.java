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

public class BookDatabase extends Database{

    public BookDatabase(String filename) {
        super(  FilesNames.BOOKS_FILENAME);
        this.filename=filename;
    }
    
//    @Override
//    //method 1
//    public void readfromFile()  {
//        try {
//            File f = new File(filename);
//            Scanner sc = new Scanner(f);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
//                String[] x = line.split(",");
//                int s = Integer.parseInt(x[4]);
//                Book b = new Book(x[0], x[1], x[2], x[3], s);
//                records.add(b);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BookDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    //method 2
    @Override
    public Book createRecordFrom(String line) {
        String[] b = line.split(",");
        int e = Integer.parseInt(b[4]);
        Book i = new Book(b[0], b[1], b[2], b[3], e);
        return i;
    }

    //method 3
//    public ArrayList<Book> returnAllRecords() {
//        return records;
//    }

    //method 4
//    public boolean contains(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            return key.equals(records.get(i).getBookId());
//        }
//        return false;
//    }

    //method 5
//    public Book getRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getBookId())) {
//                return records.get(i);
//            }
//        }
//        return null;
//    }

    //method 6
//    public void insertRecord(Book record) {
//        records.add(record);
//
//    }

    //method 7
//    public void deleteRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getBookId())) {
//                records.remove(i);
//                break;
//            }
//        }
//    }
//
//    //method 8
//    public void saveToFile() {
//        PrintWriter pw = null;
//        try {
//            File f = new File("filename");
//            pw = new PrintWriter(f);
//            for (int i = 0; i < records.size(); i++) {
//                pw.print(records.get(i).getBookId() + ",");
//                pw.print(records.get(i).getTitle() + ",");
//                pw.print(records.get(i).getAuthorName() + ",");
//                pw.print(records.get(i).getPublisherName() + ",");
//                pw.print(records.get(i).getQualitiy() + ",");
//            }   pw.close();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(BookDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        } finally {
//            pw.close();
//        }
//    }
}
