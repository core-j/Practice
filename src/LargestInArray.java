public class LargestInArray {
    public static void main(String[] args) {
        //1.create the array
        int[] arr = {25, 10, 80, 45, 60};
        //Assume the very first element is the largest
        int largest = arr[0];
        //2.Loop through every slot from index  1 up to (lenght -1)
        for (int i = 1; i < arr.length; i++) {
            //Is this number is bigger than our current
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("Largest = "+largest);
    }
}
