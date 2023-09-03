public class math1 {

    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------------------
        //Bit - Manipulation
        //PROGRAM : TO CHECK WHETHER THE NO IS EVEN OR ODD
//==============================================================================================================================
        int n = 67;
        System.out.println(isOdd(n));
//----------------------------------------------------------------------------------------------------------------------------------
        //Bit - Manipulation
        //PROGRAM : TO FIND THE NO IN ARRAY WHICH IS NOT APPEARING TWICE
//==============================================================================================================================
        int arr[] = {2,3,3,4,2,6,4}; //  ans is 6
        System.out.println(ans(arr));
//----------------------------------------------------------------------------------------------------------------------------------
        // Bit - Manipulation
        // PROGRAM : TO FIND Ith bit of a no.
//==============================================================================================================================
        int no = 10;
        int k  =  1;
        System.out.println(Integer.toBinaryString(no));
        System.out.println("ith bit is "+Ithbit(no,k));
//----------------------------------------------------------------------------------------------------------------------------------
        // Bit - Manipulation
        // PROGRAM : TO SET Ith bit of a no.
//==============================================================================================================================
        int num = 10;
        int m = 3;

        System.out.println("setting (3rd) ith bit of a no in decimal "+setIthbit(num,m));
//----------------------------------------------------------------------------------------------------------------------------------
        // Bit - Manipulation
        // PROGRAM : TO RESET Ith bit of a no.--if 1 change to 0 and if 0 do not change
//==============================================================================================================================
        int number = 10;
        int t = 2;
        System.out.println("before 10 in binary"+Integer.toBinaryString(number));
        System.out.println("resetting the 2nd bit of 10 in decimal  : "+resetIthbit(number,t));

//----------------------------------------------------------------------------------------------------------------------------------
        // Bit - Manipulation
        // PROGRAM : TO FIND THE POSITION OF THE RIGHTMOST SET BIT
//==============================================================================================================================
        int numbers = 10;
        System.out.println(rightmostBit(numbers));

    }
    public static int rightmostBit(int numbers){
        return numbers &(-numbers);
    }



    private static int resetIthbit(int number ,int t){
        int no = number & (~(1<<(t-1)));
        System.out.println("after resetting 2nd bit of 10 in binary "+Integer.toBinaryString(no));
        return no;
    }

    private static int setIthbit(int num , int m){
        System.out.println("before setting : "+Integer.toBinaryString(num));
        int number = num | (1<<(m-1));
        System.out.println("after  setting (3rd) ith bit of a no in binary "+Integer.toBinaryString(number));
        return number;
    }

    private static int Ithbit(int no,int k){
       // int number = Integer.parseInt(Integer.toBinaryString(no));
        return (no & (1 << k-1)) >> (k-1);
    }

    private static boolean isOdd(int n){
        return (n & 1) == 1;  //  if equal to 1 no is odd else even
    }

    private static int ans(int arr[]){
        //ORDER DOESN'T MATTER JUST ADD ALL NO.S ONLY UNIQUE ELEMENT WILL LEFT
        int unique = 0;
        for(int n : arr){
            unique = unique^n;  // sum = sum + n;
        }
        return unique;
    }
}
