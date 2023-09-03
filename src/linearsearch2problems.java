public class linearsearch2problems {
    public static void main(String[] args) {
//=========================================================================================================================
        //PROBLEM: 1295 LEETCODE PRBLM TO FIND NUMBERS WITH EVEN NUMBER OF DIGITS
//---------------------------------------------------------------------------------------------------------------
        int nums[]={12,345,2,6,7896,40,-34};// only 12 and 7896 contains even no of digits
//        System.out.println(findNumbers(nums));

        System.out.println("my own function result is : "+findNo(nums));
        System.out.println("digits are : : "+digits2(34));
    }

    static int digits2(int num){
        if(num < 0){
            num = num * -1;
        }
        return (int)(Math.log10(num) + 1);
    }
//    static int findNumbers(int[] nums){            //KUNAL METHOD
//        int count =0;
//        for(int num : nums){
//            if(even(num)){
//                count++;
//            }
//        }
//        return count;
//    }

    static int findNo(int []nums){       //MY OWN METHOD
        int counter  = 0;
        for(int num : nums){
            int count = digits(num);
            if(count % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

//    //funtion to check whether a number contains even digits or not
//    static boolean even(int num){                //KUNAL METHOD
//        int numberofDigits = digits(num);
////        if(numberofDigits % 2 == 0){
////            return true;
////        }
////        return false;

//        return numberofDigits % 2 == 0;
//    }

    //count  number of digits in a number
    static int digits(int num){                  //KUNAL METHOD
        if(num < 0)
            num = num * -1;

        if(num == 0)
            return 1;

        int count = 0;
        while (num>0){
            count++;
            num = num/10;
        }
        return count;
    }
}
