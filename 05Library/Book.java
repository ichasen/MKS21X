public class Book{
    private String author;
    private String title;
    private int ISBN;
    public null Book (){}
    public Book (String a, String t, int n){
	author = a;
	title = t;
	ISBN = n;
    }
    public int getISBN(){
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
    public void setISBN(int num){
	ISBN = num;
    }
    public String toString (){
	return getTitle() + ", " + getAuthor() + ", " + getISBN();
    }
}
    
    
