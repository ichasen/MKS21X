public class ReversedCharSequence implements CharSequence{
    private String original;
    public ReversedCharSequence(String o){
	original = o;
    }
    public char charAt(int index){
	return original.charAt(index);
    }
    public int length(){
        return original.length();
    }
    public CharSequence subSequence(int start, int end){
	return original.substring(start,end);
    }
    public String toString(){
	return original + ", " + length();
    }
}
