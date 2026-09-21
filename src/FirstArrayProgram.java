public class FirstArrayProgram {
    public static void main(String[] args) {
        //1.create the array
        int[] arr = {10, 20, 30, 40, 50};
        //An empty bucket to collect the running sum
        int sum=0;
        //2.Loop through every slot from index  0 up to (lenght -1)
        for (int i = 0; i < arr.length; i++) {
            //3.print the current element
            System.out.println(arr[i]);
            //add the element into our sum bucket
            sum+=arr[i];
        }
        System.out.println("Total = "+sum);
    }

}
