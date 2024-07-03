/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

/**
 *
 * @author CARNIVAL
 */
public class Book implements Record{
    private String BookId;
    private String Title;
    private String authorName;
    private String publisherName;
    private int qualitiy;

    public Book(String BookId, String Title, String authorName, String publisherName, int qualitiy) {
        this.BookId = BookId;
        this.Title = Title;
        this.authorName = authorName;
        this.publisherName = publisherName;
        this.qualitiy = qualitiy;
    }

    public String getBookId() {
        return BookId;
    }

    public void setBookId(String BookId) {
        this.BookId = BookId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public int getQualitiy() {
        return qualitiy;
    }

    public void setQualitiy(int qualitiy) {
        this.qualitiy = qualitiy;
    }


    @Override
    public String LineRepresentation() {
        String data=BookId+","+Title+","+authorName+","+publisherName+","+qualitiy;
        return data;
    }

    @Override
    public String SearchKey() {
        return BookId;
    }
    }

