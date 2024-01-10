public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {

        int n = array.length;

        for(int i=0;i<=n;i++){
            boolean find = false;
            for(int j=0;j<n;j++){
                if(i==array[j]){
                   find = true;
                   break;
                } 
            } 
            if(!find){
                return i;
            }
        }

        return array.length +1;
    }

    public static int secondMaxValue(int [] array) {
        int max = array[0];
        int maxIndex=0;
        for(int i=1;i<array.length;i++){
            if(array[i]>max){
                max = array[i];
                maxIndex = i;
            }
        }

        int secondMax = array[(maxIndex+1)%(array.length-1)];        
        for(int i=0;i<array.length;i++){
          
            if(array[i]>secondMax && i!=maxIndex){
                secondMax = array[i];
            }
        
        }

        return secondMax;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        for(int i=0;i<array2.length;i++){
            boolean includes = false;
            for(int j=0;j<array1.length;j++){
                if(array2[i]==array1[j]){
                    includes = true;
                    break;
                }
            }
            if(!includes){
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean up = true;
        boolean down = true;
        for(int i=0;i<array.length-1;i++){
            if(array[i]>array[i+1]){
                up = false;
            } 
            if(array[i+1]>array[i]){
                down = false;
            }
        }
// if this is not a down and not an up serises so return false
        return (down||up);
    }

}
