
package smallestındex;
public class SmallestIndex {

    public static void main(String[] args) {
        indexOfSmallestElement(new double[]{2,3,1,1,10});
    }
    public static int indexOfSmallestElement(double[] array){
       double smallest = array[0];
       int index = 0;
       for(int i=1 ; i<array.length ; i++){
           if(array[i] < smallest){
               smallest = array[i];
               index = i;
           }
           
       }
       System.out.println(index);
       
        
       return 0;
    }
    
}
