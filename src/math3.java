public class math3 {
    public static void main(String[] args) {


        //SHRADDHA DI

        //GET THE ITH BIT OF NUMBER
        //AND
        int no = 10;
        int pos = 1;
        int mask = 1 << pos;
        if((no & mask) ==0){
            System.out.println("ith bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
        System.out.println();

        //SET THE ITH BIT OF NUMBER
        //OR
        int num = 10;
        int position = 2;
        int bitmask = 1 << position;
        int  no1 = bitmask | num;
        System.out.println("before "+Integer.toBinaryString(num));
        System.out.println("after "+Integer.toBinaryString(no1));
        System.out.println("in decimal "+no1);
        System.out.println();

        //CLEAR OR RESET THE ITH BIT OF A NO
        //AND WITH NOT
        int nums = 10;
        int positions = 3;
        int bitmasks = ~(1<<positions);
        int ans = nums & bitmasks;
        System.out.println("before clearing "+nums+" in binary : "+Integer.toBinaryString(nums));
        System.out.println("after clearing the 3rd bit : "+ans + " in binary :  "+Integer.toBinaryString(ans));

        //UPDATE BIT
        // IF O MAKE IT 1   //USE SET OPERATION HERE -- OR
        // IF 1 MAKE IT 0   //USE CLEAR OPERATION HERE == AND WITH NOT

    }
}
