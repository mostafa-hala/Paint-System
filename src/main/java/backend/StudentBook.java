/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class StudentBook implements Record {
    private String studentId;
    private String bookId;
    private LocalDate borrowDate;

    public StudentBook(String studentId, String bookId, LocalDate borrowDate) {
        this.bookId = bookId;  
        this.studentId = studentId;
        this.borrowDate = borrowDate;
       
    }
    public String getStudentId() {
        return studentId;
    }

    public String getBookId() {
        return bookId;
    }

    public LocalDate getBorrowDate() {
        return borrowDate;
    }


    @Override
    public String LineRepresentation() {
        String data=studentId+","+bookId+","+borrowDate;
        return data;
    }

    @Override
    public String SearchKey() {
        return studentId+","+bookId;
    }
   
}
