import java.util.ArrayList;
import java.util.Collections;
public abstract class LibraryBook extends Book implements Comparable<String>{
    private String callNumber;
    public LibraryBook(String a, String t, String n, String cn){
	super(a,t,n);
	callNumber = cn;
    }
    public String getCallNumber (){
	return callNumber;
    }
    public String setCallNumber (String newNumber){
	callNumber = newNumber;
	return newNumber;
    }
    public abstract void checkout(String patron, String due);
    public abstract void returned();
    public abstract String circulationStatus();
    public int compareTo (String other){
	return callNumber.compareTo(other);
    }
    public String toString(){
	return getTitle() + ", " + getAuthor() + ", " + getISBN() + ", " + getCallNumber() + ", " + circulationStatus();
    }
}
