public class strings1 {
    public static void main(String[] args) {
        //PERFORMANCE OF STRINGS
        String series = "";
        for(int i = 0; i < 26 ;i++){
            char ch = (char) ('a'+i);
            series += ch;
            System.out.println(ch);
        }
        System.out.println(series);
    }
}
