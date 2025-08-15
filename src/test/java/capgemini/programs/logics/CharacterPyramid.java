package capgemini.programs.logics;

import java.util.Arrays;

public class CharacterPyramid {

    public static long solve(long key){
        long flag=1L;
        if(key<0){
            flag=-1L;
            key=-1L*key;
        }
        char ch[]=String.valueOf(key).toCharArray();
        Arrays.sort(ch);
        int i=0;
        for(i=0;i<ch.length;i++){
            if(ch[i]!='0'){
                break;
            }
        }
        if(i<ch.length){
            ch[0]=ch[i];
            ch[i]='0';
        }
        return flag*Long.parseLong(new String(ch));
    }

    public static void main(String[] args) {

        System.out.println(solve(918));

    }

}
