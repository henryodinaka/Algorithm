package tutorials;

public class DataStructure {

    /**
     * Perform
     * */
    public static void main(String[] args) {
        LinkedListCustom linkedList = new LinkedListCustom();
        linkedList.insert(12);
        linkedList.insert(23);
        linkedList.insert(48);
        linkedList.insertAtFirst(89);
        linkedList.insertAt(3 ,88);
        linkedList.insertAt(0 ,10);
        linkedList.show();
        linkedList.deleteAt(2);
        System.out.println("After Deletion==");
        linkedList.show();
    }
}
