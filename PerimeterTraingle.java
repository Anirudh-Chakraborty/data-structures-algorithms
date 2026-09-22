/**
 * PerimeterTraingle
 */
public class PerimeterTraingle {
public static void main(String[] args) {
    // int arr [] = {1,2,3,4,5,6,7,7,8,9,2};
    int arr [] = {1,2,1,10};
    int perimeter = -1;
    int side [] = new int[3]; 
    for(int i = 0; i < arr.length-2; i++){
        for (int j = i+1; j < arr.length-1; j++){
            for (int k = j+1; k < arr.length; k++){
                if (arr[i]+arr[j]>arr[k] &&
                    arr[j]+arr[k]>arr[i] && 
                    arr[k]+arr[i]>arr[j]) {
                      int current = arr[i]+arr[j]+arr[k];
                      if (current>perimeter) {
                        side[0] = arr[i];
                        side[1] = arr[j];
                        side[2] = arr[k];
                        perimeter = current;
                      }
                }
            }
        }
    }
    for(int i : side){
        System.out.println("The sides are:" + i);
    }
    System.out.println("Perimeter:"+perimeter);
}
}