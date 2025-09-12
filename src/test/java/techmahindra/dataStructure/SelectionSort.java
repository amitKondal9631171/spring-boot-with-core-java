package techmahindra.dataStructure;

//select the lowest value from array and replace with starting value.
public class SelectionSort {

    void sort(int arr[])
    {
        //for n-1 comparisons
         for (int i=0; i < arr.length -1 ; i++){

             int elementIndex = i;

             //find smallest element
             for (int j=i+1; j < arr.length;j++){
                 if(arr[j] < arr[elementIndex]){
                     elementIndex = j; //get the smallest value index
                 }
             }

            //place smallest element in the begenning
             int temp = arr[elementIndex];
             arr[elementIndex] = arr[i];
             arr[i] = temp;
         }

    }

    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }

    // Driver code to test above
    public static void main(String args[])
    {
        SelectionSort ob = new SelectionSort();
        int arr[] = {64,25,12,22,11};
        ob.sort(arr);
        System.out.println("Sorted array");
        ob.printArray(arr);
    }
}

/*
    Explanation same as quicksort
     Worst Case Time Complexity [ Big-O ]: O(n2) [n square]
     Best Case Time Complexity [Big-omega]: O(n2)
     Average Time Complexity [Big-theta]: O(n2)
     Space Complexity: O(1)
 */