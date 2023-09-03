public class math5 {
    public static void main(String[] args) {
//---------------------------------------------------------------------------------------------------------------------
        //SQUARE ROOT OF  A NUMBER
        int no = 40;
        int precision = 3;

        System.out.printf(" %.3f " , sqrt(no , precision));
    }
    static double sqrt(int n , int p){
        int start = 0;
        int end = n;
        double root = 0.0;

        while ( start <= end){
            int mid = (start + end) / 2;//low + high / 2

            if( mid * mid == n){
                return mid;
            }
            if(mid * mid > n){
                end = mid - 1;
            }else {
                start = mid + 1;
            }
            double incr = 0.1;
            for (int i = 0 ; i < p ; i++){
                while(root * root <= n){
                    root = root + incr;
                }
                root = root -  incr;
                incr = incr / 10;
            }
        }
        return root;
    }
}
