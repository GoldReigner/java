public class primeno {
    public static void main(String[] args) {
        int sum = 0;
        int n = 2;
        for(int i = 1 ; i <=100;i++){
           for (int j = 2; j <= i-1 ; j++){
               if(i % j ==0){
                   break;
                   //sum += i;
               }
           }
        }
        System.out.println(sum);
    }
}
