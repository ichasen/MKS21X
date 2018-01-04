import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class Book{
    private String author;
    private String title;
    private String ISBN;
    public Book (){}
    public Book (String a, String t, String n){
	author = a;
	title = t;
	ISBN = n;
    }
    public String getISBN(){
	return ISBN;
    }
    public String getAuthor(){
	return author;
    }
    public String getTitle(){
	return title;
    }
    public void setTitle (String newTitle){
	title = newTitle;
    }
    public void setAuthor(String newAuthor){
	author = newAuthor;
    }
    public void setISBN(String num){
	ISBN = num;
    }
    public String toString (){
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }
}
    
