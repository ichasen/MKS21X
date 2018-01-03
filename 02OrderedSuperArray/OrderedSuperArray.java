public class OrderedSuperArray extends SuperArray{

    /*constructor initializes an empty List*/
    public OrderedSuperArray(){
	super ();
    }
    public OrderedSuperArray(int size){
	super();
    }
    public String set (int index,String element){
        if (index < 0 || index > size()){
	    throw new UnsupportedOperationException();
	}
	return element;
    }
    
    
    /*call the proper add.*/
    public void add(int index, String value){
	super.add(value);
    }
    public int indexOf (String value){
	for (int i = 0;i<data.length;i++){
	    if (data[i].equals(value)){
		return i;
	    }
	}
	return -1;
    }
    public int lastIndexOf (String value){
	for (int i = data.length - 1;i>=0;i--){
	    if (data[i].equals(value)){
		return i;
	    }
	}
	return -1;
    }
    
    private int rightSpot (String element){
        int rightSpot = size();
        for (int i = 0;i<data.length;i++){
	    if (element.compareTo(data[i]) < 0){
		rightSpot = i;
		i = data.length;
	    }
	}
        return rightSpot;
    }
    private int rightSpotBinary (String element){
	int middle = size() / 2;
	if (size == 0){
	    return 0;
	}
	else if (data[middle].equals(element)){
	    return middle;
	}
	else {
	    remove (middle);
	    return rightSpotBinary (element);
	}
    }
	
      

    /*Write this method and any
      appropriate helper methods.*/
    public boolean add(String value){
      //add to the correct spot.
      //you may still use super.add(index,value)
	super.add(rightSpot(value),value);
	return true;
    }


}
