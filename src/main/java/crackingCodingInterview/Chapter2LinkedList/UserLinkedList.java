package crackingCodingInterview.Chapter2LinkedList;


/**
 * Head 0 -> Next 1 -> Next 2 -> Next 3
 * Method: append to the last, prepend to first, delete with value, traverse
 */
public class UserLinkedList {
    private static class Node{
        Node next;
        int value;

        public Node(int value) {
            this.value = value;
        }
    }

    Node head;

    public void append(int value){
        if(head == null){
            Node node = new Node(value);
            head = node;
            return;
        }
        else{
            Node walkingNode = head;
            while(walkingNode.next != null){
                walkingNode = walkingNode.next;
            }
            Node appendNode = new Node(value);
            walkingNode.next = appendNode;
        }
    }

    public void prepend(int value){
        if(head == null){
            Node node = new Node(value);
            head = node;
            return;
        }else {
            Node node = new Node(value);
            node.next = head;
            head = node;
        }
    }

    public void deleteWithValue(int value){
        if(head.value == value){
            head = head.next;
        }else{
            Node walkingNode = head;
            while(walkingNode.next != null){
                if(walkingNode.next.value == value){
                   walkingNode.next = walkingNode.next.next;
                   return;
                }
                walkingNode = walkingNode.next;
            }
        }

    }

    public static void main(String[] args) {
        UserLinkedList userLinkedList = new UserLinkedList();
        userLinkedList.append(1);
        userLinkedList.append(2);
        userLinkedList.append(3);
        userLinkedList.prepend(0);
        userLinkedList.deleteWithValue(2);
        System.out.println("Done");

    }
}
