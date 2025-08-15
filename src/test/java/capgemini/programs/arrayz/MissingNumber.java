package capgemini.programs.arrayz;

public class MissingNumber {

    public static void main(String[] args) {

        int total = 0;

        for( int i = 5; i <= 100; i++)
            total+=i;

        System.out.println("Total with loop: "+total);

        int n = 100;

        int actualSum = n * (n + 1) /2;
        System.out.println("Missing number: "+ (actualSum - total));
    }
}
