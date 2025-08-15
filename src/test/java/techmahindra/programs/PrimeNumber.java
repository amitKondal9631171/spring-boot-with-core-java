package techmahindra.programs;


 //Prime number: divisible by 1 and itself.
public class PrimeNumber {

    public static void main(String x[]){

        int[] a= {3,60,35,2,45,320,5};

       int n=125;
        System.out.println("divisible number: " +n/10);//gives divisible number
        System.out.println("remainder: "+ n%10);//gives remainder
        int i,m=0,flag=0;
        n=9;//it is the number to be checked
        m=n/2;
        if(n==0||n==1){
            System.out.println(n+" is not prime number");
        }else{
            for(i=2;i<=m;i++){
                if(n%i==0){
                    System.out.println(n+" is not prime number");
                    flag=1;
                    break;
                }
            }
            if(flag==0)  { System.out.println(n+" is prime number"); }
        }
    }
}
