public class ReversedCharSequence implements CharSequence{
    private String original;
    public ReversedCharSequence(String o){
	      original = o;
    }
    public char charAt(int index){
	      return original.charAt(original.length() - 1 - index);
    }
    public int length(){
        return original.length();
    }
    public String subSequence(int start, int end){
	      String ans = "";
        for (int i = start;i>end;i-=1){
	        ans = ans + Character.toString(original.charAt(i));
        }
	      return ans;
    }
    public String toString(){
	      return subSequence(original.length()-1,0);
    }
}
