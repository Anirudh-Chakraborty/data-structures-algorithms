public class one {
    public static void main(String[] args) {
    int arr [] = 
    // {2,3,4,6,7,2,1,4,5,3,4};
    {-1};
    int largest = arr[0];
    for(int i = 1; i<arr.length; i++){
        int current = arr[i];
        if (current>largest) {
            largest = current;
        }
    }
    System.out.println(largest);

}



}
