public class Barcode{
    private String zip;
    public Barcode(String zip){
	if (Integer.parseInt(zip) > 999999){
	    throw new IllegalArgumentException();
	}
	else{
	    this.zip = zip;
	}
    }
    public String toString(){
	return getCode() + " (" + zip + ")";
    }
    public int compareTo(Barcode other){
	String second = "" + other;
	int one = Integer.parseInt(zip);
	int two = Integer.parseInt(toZip(second));
	if (one == two){
	    return 0;
	}
	else if (one > 2){
	    return 1;
        }
	else{
	    return -1;
	}
    }
    public static String toCode(String zip){
	String[] barcodes = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","|:|::","||:::"};
	String ans = "";
	String check = barcodes[Character.getNumericValue(zip.charAt(0)) + Character.getNumericValue(zip.charAt(1)) + Character.getNumericValue(zip.charAt(2)) + Character.getNumericValue(zip.charAt(3)) + Character.getNumericValue(zip.charAt(4))] + Character.getNumericValue(zip.charAt(4));
	if (zip.length()>5 || zip.length() < 5){
	    throw new IllegalArgumentException();
	}
	for (int i = 0;i<zip.length();i++){
	    ans = ans + barcodes[Character.getNumericValue(zip.charAt(i))];
	}
	ans = ans + check;
	return ans;
    }
    public static String toZip(String code){
	if (code.length()>32 || code.length() < 32){
	    throw new IllegalArgumentException();
	}
	for (int i = 0;i<code.length();i++){
	    if (code.charAt (i) != ':' || code.charAt(i) != '|'){
		throw new IllegalArgumentException();
	    }
	    if (code.charAt(0) != '|' || code.charAt(31)!='|'){
		throw new IllegalArgumentException();
	    }
	}
	String ans = "";
        String[] barcodes = new String[]{"||:::",":::||","::|:|","::||:",":|::|",":|:|:",":||::","|:::|","|::|:","|:|::","|:|::","||:::"};
	for (int i = 0;i<barcodes.length;i++){
	    if (code.substring(0,4).equals(barcodes[i])){
		ans = ans + barcodes[i];
	    }
	    if (code.substring(5,9).equals(barcodes[i])){
		ans = ans + barcodes[i];
	    }
	    if (code.substring(10,14).equals(barcodes[i])){
		ans = ans + barcodes[i];
	    }
	    if (code.substring(15,19).equals(barcodes[i])){
		ans = ans + barcodes[i];
	    }
	    if (code.substring(20,24).equals(barcodes[i])){
		ans = ans + barcodes[i];
	    }
	}
	return ans;
    }
    public String getCode(){
	return toCode(zip);
    }
    public String getZip(){
	return zip;
    }
}
