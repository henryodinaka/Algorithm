package tutorials;

public class LinkedListCustom {
    Node head;
    public void insert(int data){
        Node node  = new Node();
        node.data =data;
        node.next = null;
        if (head ==null) head =node;
        else {
            Node n = head;
            while (n.next !=null){
                n = n.next;
            }
            n.next =node;
        }
    }
    public void show(){
        Node node = head;
        while (node.next !=null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
    public void insertAtFirst(int data){
        Node node  = new Node();
        node.data =data;
        node.next = null;
        node.next = head;
        head = node;

    }
    public void insertAt(int index, int data){

        if (index ==0)
            insertAtFirst(data);
       else {
            Node node = new Node();
            node.data = data;
            node.next = null;
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }

    }
    public void deleteAt(int index){
        if (index==0)
            head = head.next;
        else {
            Node n = head;
            Node nToDel = null;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            nToDel = n.next;
            n.next = nToDel.next;
            nToDel = null;
        }
    }
}
