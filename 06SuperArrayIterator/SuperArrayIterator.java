import java.util.Iterator;
public class SuperArrayIterator implements Iterator<String>{
    int current;
    int end;
    public SuperArrayIterator(int i, int j){
	current = i;
	end = j;
    }
    public String next(){
	if (hasNext()){
	    current++;
	}
	else{
	    System.exit(0);
	}
	return Integer.toString(current - 1);
    }
    public boolean hasNext(){
        return current <= end;
    }
}
