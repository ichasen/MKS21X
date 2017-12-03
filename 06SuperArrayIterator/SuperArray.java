public class SuperArray implements Iterator<String>{
    private String[]data;
    private int size;
    public String iterator(){
	for (int i = 0;i<data.length;i++){
	    return data[i];
	}
    }
    pubic SuperArray(int size){
	data = new String [size];
    }
    public void clear(){
	data = [];
	size = 0;
    }
    public int size(){
	return size;
    }
    public boolean add(String element){
	String[] data2 = new String [size * 2];
	for (int i = 0;i<data.length;i++){
	    data2[i] = data[i];
	}
	data2[data.length] = element;
	data = data2;
	return true;
    }
    public String toString(){
	String result = "[";
	for (int i = 0;i<data.length;i++){
	    result = result + data[i];
	}
	return result + "]";
    }
    public String get(int index){
	return data[index];
    }
    public String set(int index,String element){
	String ans = data[index];
	data [index] = element;
	return ans;
    }
    private void resize(){
	String[] data2 = new String [size * 2];
	for (int i = 0;i<data.length;i++){
	    data2[i] = data[i];
	}
    }
    public boolean contains (String element){
	for (int i = 0;i<data.length;i++){
	    if (data[i].equals(element)){
		    return true;
	    }
	}
	return false;
    }
    public int indexOf(String element){
	for (int i = 0;i,data.length;i++){
	    if (data[i].equals(element)){
		return i;
	    }
	}
	return -1;
    }
    public int lastIndexOf (String element){
	for (int i = data.length - 1;i>=0;i--){
	    if (data[i].equals(element)){
		return i;
	    }
	}
	return -1;
    }
    public void add(int index, String element){
	if (index < 0 || index > size()){
	    System.out.println("Error - Out of range");
	}
	else {
	    String[] data2 = new String [size + 1];
	    for (int i = index;i<data.length;i++){
		data[i] = data2[i+1];
	    }
	    data2 [index] = element;
	    data = data2;
	}
    }
    public String remove(int index){
	if (index < 0 || index > size()){
	    System.out.println("Error - Out of range");
	}
	else {
	    ans = data[index]
	    String[] data2 = new String [size - 1];
	    for (int i = index+1;i<data.length;i++){
		data[i] = data2[i-1];
	    }
	    data = data2;
	}
	return ans;
    }
    public boolean remove (String element){
	remove (indexOf (element));
	return true;
    }
}
    
		
	
    
