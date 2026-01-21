package techmahindra.programs;

public class SelectionSort{
    public static void main(String x[]) {
        Object obj = new SelectionSort();
        int[] a = {39, 60, 35, 2, 45, 320, 5};
        int smallestNo=0;
        for (int l = 0; l < (a.length); l++) {
            smallestNo=a[l];
            for (int i = l; i < a.length ; i++) {
                if (smallestNo > a[i]) {
                    smallestNo = a[i];
                    a[i] = a[l];
                    a[l]=smallestNo;
                }
            }
       }
       for (int k = 0; k < a.length; k++)
            System.out.print(a[k] + " ");

        for(int i=0;i<Thread.currentThread().getStackTrace().length;i++){
            System.out.println(Thread.currentThread().getStackTrace()[i]);
        }
    }

}