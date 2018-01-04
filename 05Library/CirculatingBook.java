import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;
public class CirculatingBook extends LibraryBook{
    private String currentHolder;
    private String dueDate;
    public CirculatingBook(String a, String t, String n, String cn){
	super (a,t,n,cn);
	currentHolder = null;
	dueDate = null;
    }
    public String getCurrentHolder(){
	return currentHolder;
    }
    public String getDueDate(){
	return dueDate;
    }
    public String setCurrentHolder(String newHolder){
        currentHolder = newHolder;
	return newHolder;
    }
    public String setDueDate(String newDueDate){
	dueDate = newDueDate;
	return newDueDate;
    }
    public void checkout(String patron, String due){
	currentHolder = patron;
	dueDate = due;
    }
    public void returned(){
	currentHolder = null;
	dueDate = null;
    }
    public String circulationStatus(){
	String ans = "";
	if (currentHolder.equals(null)){
	    ans = "book available on the shelves";
	}
	else{
	    ans = currentHolder + ", due on" + dueDate;
	}
	return ans;
    }
    public String toString(){
	return getTitle() + ", " + getAuthor() + ", " + getISBN() + ", " + getCallNumber() + ", " + circulationStatus() + ", " + getCurrentHolder() + ", " + getDueDate();
    }
}
