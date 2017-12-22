public class Sorts{
    public static String name(){
	      return "10.Chasen.Isaac";
    }
    public static void swap(int[]data,int a,int b){
	      int c = data[a];
	      data[a] = data[b];
        data[b] = c;
    }
    public static boolean isSorted(int[]ary){                                       
        for(int i = 0; i < ary.length - 1 ; i++){                                   
            if(ary[i] > ary[i+1]){                                                  
                return false;                                                       
            }                                                                       
        }                                                                           
        return true;                                                                
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
	      int key;
	      int j;
	      for (i = 1; i < data.length; i++){
	          key = data[i];
	          j = i-1;
	          while (j >= 0 && data[j] > key){
		            data[j+1] = data[j];
		            j = j-1;
	          }
	          data[j+1] = key;
	      }
    }
    public static void bubbleSort(int[]data){
	      for (int a = 0;a<data.length - 1;a++){
	          for (int b = 0;b<data.length - 1 - a;b++){
		            if (data[b] > data[b+1]){
		                swap(data,b,b+1);
		            }
	          }   
	      }
    }
}
