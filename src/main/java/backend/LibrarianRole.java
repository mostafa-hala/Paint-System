/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import constants.FilesNames;
import java.io.IOException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class LibrarianRole {

    private BookDatabase booksDatabase;
    private StudentBookDatabase sBDatabase;
    

    public LibrarianRole() {
        booksDatabase = new BookDatabase(FilesNames.BOOKS_FILENAME);
        sBDatabase=new StudentBookDatabase(FilesNames.STUDENTSBOOKS_FILENAME);
        booksDatabase.readfromFile();
        sBDatabase.readfromFile();
    }

    //method 1
    public void addBook(String id, String title, String authorName, String publisherName, int quantity) {
//        ArrayList<Record> r = sBDatabase.returnAllRecords();
//        String c = String.valueOf(quantity);
//        String s = id + "," + title + "," + authorName + "," + publisherName + "," + c;
//        sBDatabase.createRecordFrom(s);

        Book book = new Book(id,title, authorName, publisherName, quantity);
        booksDatabase.insertRecord(book);
        //booksDatabase.saveToFile();
    }

    //method 2
    public Book[] getListOfBooks() {
        Book[] book = new Book[booksDatabase.returnAllRecords().size()];
        return booksDatabase.returnAllRecords().toArray(book);
    }

    //method 3
    public StudentBook[] getListOfBorrowingOperations() {
StudentBook[] sB = new StudentBook[sBDatabase.returnAllRecords().size()];
        return sBDatabase.returnAllRecords().toArray(sB);
    }

    //method 4
    public int borrowBook(String studentId, String bookId, LocalDate borrowDate) throws IOException {
        Book b = (Book) this.booksDatabase.getRecord(bookId);
        if (this.sBDatabase.contains(studentId + "," + bookId)) {
            return 1;
        } else if (b.getQualitiy() == 0) {
            return 0;
        }
        b.setQualitiy(b.getQualitiy() - 1);
        this.sBDatabase.insertRecord(new StudentBook(studentId, bookId, borrowDate));
        this.logout();
        return 2;
    }

    //method 5
    public double returnBook(String studentId, String bookId, LocalDate returnDate) {
        Book book = (Book) booksDatabase.getRecord(bookId);
        StudentBook student = (StudentBook) sBDatabase.getRecord(studentId + "," + bookId);
        if (sBDatabase.contains(studentId + "," + bookId) == true) {
            book.setQualitiy(book.getQualitiy() + 1);
            long difference = ChronoUnit.DAYS.between(student.getBorrowDate(), returnDate);
            sBDatabase.deleteRecord(studentId + "," + bookId);
            sBDatabase.saveToFile();
            booksDatabase.saveToFile();
            if (difference < 7) {
                return 0;
            } else {
                return (difference - 7) * 0.5;
            }
        }
        return 0;

    }

    //method 6
    public void logout() throws IOException {
        booksDatabase.saveToFile();
        sBDatabase.saveToFile();
    }
}
