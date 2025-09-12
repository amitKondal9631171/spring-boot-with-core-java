package techmahindra.StringManipulation;


//Even character string = 'amiima' , 123321;
public class StringPalindrome {

    public static boolean isPalindrome(String inputStr){
        String reverseString = "";
        char[] stringCharacters = inputStr.toCharArray();

        //========== O(n)

        for(int i= (stringCharacters.length - 1) ; i>=0; i--){
            reverseString = reverseString.concat( String.valueOf(stringCharacters[i]) );
        }

        if(inputStr.equalsIgnoreCase(reverseString)){
            return true;
        }

        //============

        //O(log n)

        for(int i= 0 ; i < (stringCharacters.length) / 2 ; i++){

                if(stringCharacters[0] != stringCharacters[(stringCharacters.length - 1) - i ]) {
                    System.out.println("not palindrome");
                }

        }


        return false;
    }

    public static boolean isPalindrome(long inputNo){
        long reverseNo=0;
        long num=inputNo;
        while(num > 0){
            long remainder=num % 10; // 6 ; 5
            reverseNo= reverseNo*10+remainder; // 0+6=6 ; 60 + 5 = 65
            num = num/10; // 12345 ; 1234
        }
        if(inputNo == reverseNo){
            return true;
        }
        return false;
    }

    private static boolean isPalindrome(String word, boolean isEven, int offset) {
        int midpoint = word.length() / 2;
        if (offset > midpoint + (isEven ? -1 : 0) ) {
            return true;
        }
        int f = (isEven ? -1 : 0);
        int beforeMid = offset + f;
        char xchar = word.charAt(midpoint - beforeMid);
        char ychar = word.charAt(midpoint + offset);
        if (xchar != ychar) {
            return false;
        }
        return isPalindrome(word, isEven, offset + 1);
    }

    public static void main(String x[]){
        String word = "AmimA";
        char[] stringCharacters = word.toCharArray();
        boolean isPallindrom = true;
        int ifCondition = (stringCharacters.length - 1) / 2;
        for(int i= 0 ; i <= ifCondition ; i++){
            System.out.println(stringCharacters[i] + " : " + stringCharacters[(stringCharacters.length - 1) - i ]);
            if(stringCharacters[i] != stringCharacters[(stringCharacters.length - 1) - i ]){
                isPallindrom = false;
            }
        }

        System.out.println("is pallindrom : " + isPallindrom);


        int num=1234123, reverseNo=0, rem, temp;
        //3214321
        temp = num;

        while(num > 0){
            int remainder=num % 10; // 6 ; 5
            int a = reverseNo*10; // 0 * 10 = 0 ; 6 *10 = 60
            reverseNo = a + remainder; // 0+6=6 ; 60 + 5 = 65
            num = num/10; // 12345 ; 1234
        }

        // palindrome if temp and sum are equal
        if(temp == reverseNo)
            System.out.println(temp + " is a palindrome.");
        else
            System.out.println(temp + " is not a palindrome.");

    }

}
