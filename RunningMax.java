public class RunningMax {
// Input:  [3, 1, 4, 1, 5, 9, 2]
// Output: [3, 3, 4, 4, 5, 9, 9]

    public static void main(String[] args) {

        int arr [] = {3,1,4,1,5,3,9};
        int output [] = new int[arr.length];
        int max = arr[0];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j<=i;j++){
                if (max<arr[j]) {
                max=arr[j];
            }
            }
            output[i]=max;            
        }

        for(int i : output){
            System.out.println(i);
        }

    }
}