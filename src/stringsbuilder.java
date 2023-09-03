public class stringsbuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0 ; i < 26 ;i++){
            char ch = (char) ('a'+i);
            builder.append(ch);
        }
        System.out.println(builder);
        System.out.println(builder.toString());// if integers are appended

        builder.deleteCharAt(0);
        System.out.println(builder);
        builder.reverse();
        System.out.println(builder);
        builder.append('a');
        System.out.println(builder);
    }
}
