public class ReferenceBook extends LibraryBook{
    private String collection;
    public ReferenceBook(String a, String t, String cn, int n, String collection){
	super(a,t,n,cn);
	this.collection = collection;
    }
    public String getCollection(){
	return collection;
    }
    public String setCollection(String newCollection){
	collection = newCollection;
	return newCollection;
    }
    public void checkout(){
	System.out.println ("cannot check out a reference book");
    }
    public void returned(){
	System.out.println ("reference book could not have been checked out - return impossible");
    }
    public String circulationStatus(){
	String ans = "non-circulating reference book";
	return ans;
    }
    public String toString(){
	return getTitle() + ", " + getAuthor() + ", " + getISBN() + ", " + getCallNumber() + ", " + circulationStatus() + ", " + checkout() + ", " + returned();
    }
}
    
	
	
