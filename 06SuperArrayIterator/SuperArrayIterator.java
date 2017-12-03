private class SuperArrayIterator implements Iterator<String>{
    public int next(){
	for (int i = 0;i<data.length;i++){
	    next = i+1;
	}
	return next;
    }
    public boolean hasNext(){
	if (next != data.length){
	    return true;
	}
	return false;
    }
    public void remove(){
	data = data [0,next()];
    }
}
