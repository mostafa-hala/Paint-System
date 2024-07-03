/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;
import constants.FilesNames;
import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StudentBookDatabase extends Database {

    public StudentBookDatabase(String filename) {
        super(FilesNames.STUDENTSBOOKS_FILENAME);
        this.filename=filename;

    }

    //method 1
//    public void readFromFile() throws FileNotFoundException {
//        File f = new File("filename");
//        Scanner sc = new Scanner(f);
//        while (sc.hasNextLine()) {
//            String line = sc.nextLine();
////            String[] x = line.split(",");
////            StudentBook sb = new StudentBook(x[0], x[1], LocalDate.parse(x[2]));
//            StudentBook sb = (StudentBook) createRecordFrom(line);
//            records.add(sb);
//        }
//    }

    //method 2
    @Override
    public Record createRecordFrom(String line) {
        String[] p = line.split(",");
        StudentBook m = new StudentBook(p[0], p[1], LocalDate.parse(p[2]));
        return m;
    }


    //method 4
//    public boolean contains(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getstudentId() + "," + records.get(i).getBookId())) {
//                return true;
//            }
//        }
//        return false;
//    }
//method 5


//    public StudentBook getRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getstudentId() + "," + records.get(i).getBookId())) {
//                return (StudentBook) records.get(i);
//            }
//        }
//
//        return null;
//    }

    //method 6
    

    //method 7
//    public void deleteRecord(String key) {
//        for (int i = 0; i < records.size(); i++) {
//            if (key.equals(records.get(i).getStudentId() + "," + records.get(i).getBookId())) //error 
//            {
//                records.remove(i);
//                break;
//            }
//        }
    

//    //method 8
//    public void saveToFile() throws FileNotFoundException, IOException {
//       try {
//            try ( FileWriter save = new FileWriter(filename)) {
//                for (int i = 0; i < records.size(); i++) {
//                    save.write(records.get(i).lineRepresentation());
//                }
//            }
//        } catch (FileNotFoundException ex) {
//            System.out.println("Error occured while excuting.");
//        }
//    }
//    @Override
//    public void readfromFile() {
//
//        try {
//            File f = new File(filename);
//            Scanner sc = new Scanner(f);
//            while (sc.hasNextLine()) {
//                String line = sc.nextLine();
////            String[] x = line.split(",");
////            StudentBook sb = new StudentBook(x[0], x[1], LocalDate.parse(x[2]));
//                StudentBook sb = (StudentBook) createRecordFrom(line);
//                records.add(sb);
//            }
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(StudentBookDatabase.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
}
