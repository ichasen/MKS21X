public class Sorts{
    public static String name(){
	return "01.Chasen.Isaac";
    }
    public static void swap(int[]data,int a,int b){
	int c = data[a];
	data[a] = data[b];
        data[b] = c;
    }
    public static void selectionSort(int[] data){
	int minimum;
	for (int a = 0;a<data.length;a++){
	    minimum = a;
	    for (int b = a+1;b<data.length;b++){
		if (data[b] < data[minimum]){
		    minimum = b;
		}
	    }
	    swap(data,a,minimum);
	}
    }
    public static void insertionSort(int[] data){
	int oneLess;
	int measure;
	for (int a = 1;a<data.length;a++){
	    measure = data[a];
	    oneLess = a - 1;
	    while (oneLess >= 0 && data[oneLess] > measure){
		data[a] = data[oneLess];
		oneLess = oneLess - 1;
	    }
	    data[a] = oneLess;
	}
    }
}
