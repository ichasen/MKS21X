private class SuperArrayIterator implements Iterator<String>{
    int current;
    public RangeOfIntsIterator(int i){
	current = i;
    }
    public int next(){
	if (hasNext()){
	    current++;
	}
	else{
	    System.exit(0);
	}
	return current - 1;
    }
    public boolean hasNext(){
        return current <= end;
    }
}
