public class dll1 {
    public static void main(String[] args) {
        dll list =  new dll();
        list.insertFirst(23);
        list.insertFirst(21);
        list.insertFirst(12);
        list.insertFirst(35);
        list.display();

        System.out.println();
        list.revdisplay();

        System.out.println();
        list.insertLast(76);
        list.display();

        System.out.println();
        System.out.println("inserting the element at particaular pos : ");
        list.insertPos(3,77);
        list.display();

        System.out.println();
        System.out.println("inserting the element at last  : ");
        list.insertPos(6,77);
        list.display();
    }
}
