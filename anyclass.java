import java.util.*;
class anyclass{
    public static void main(String[] args) {
        // int totalcharge = 0;
        // for (int i = 0;i<input2.length();i++){
        //     if(input2.charAt(i) == 'P')
        //     totalcharge += input1[i];
        //     else if(input2.charAt(i) == 'N')
        //     totalcharge -= input1[i];
        // }
        // Math.abs(totalcharge)
        // return Math.abs(totalcharge)*100;
        // int input1[] = {0,3,0,2,0};
        // int input2 = input1.length;
        // int arr[] = new int[input2];
        // int j=0;
        // for(int i=0;i<input2;i++){
        //     if(input1[i] != 0 && j<input2){
        //         arr[j] = input1[i];
        //         j++;
        //     }                
        // }
        // if(j < input2){
        //     for(int i = j+1; i<input2;i++){
        //         arr[i] = 0;
        //     }
        // }
        // return arr;
    //     int input1 = 20;
    //     List<Integer> al = new ArrayList<>();
    //     for(int i=2;i<=input1;i++){
    //         if(input1 % i == 0){
    //             al.add(i);
    //         }
    //     }
    //     Collections.sort(al,Collections.reverseOrder());
    //     System.out.println(al);
    //     int flg = -1;
    //     for(int i=0;i<al.size();i++){
    //         if(isPrime(al.get(i))){
    //             flg =  al.get(i);
    //             break;
    //         }               
    //     }
    //     return flg;
        
    // }
    // static boolean isPrime(int num){
    //     int count =0;
    //     for(int i = 1;i<=num;i++){
    //         if(num%i == 0)
    //             count ++;
    //     }
    //     if (count ==2)
    //         return true;
    //     return false;
    // }
        String input1 = "aaabccd", input2="abc",input3="ac",input4="aaa";
        if(input2 != null && input1.contains(input2)){
            input1 = input1.replace(input2,"");
        }
        if(input3 != null && input1.contains(input3)){
            input1 = input1.replace(input3,"");
        }
        if(input4 != null && input1.contains(input4)){
            input1 = input1.replace(input4,"");
        }
        return input1.length();
        
    }
}
