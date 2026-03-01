public class TheLinkedList {
    public static void main(String[] args) {
        NodeList l1 = new NodeList(1);
        l1.next = new NodeList(3);
        l1.next.next = new NodeList(5);
        l1.next.next.next = new NodeList(7);
        l1.next.next.next.next = new NodeList(9);
        l1.next.next.next.next.next = new NodeList(10);
        l1.next.next.next.next.next.next = new NodeList(14);
        l1.next.next.next.next.next.next.next = new NodeList(19);
        l1.next.next.next.next.next.next.next.next = new NodeList(21);
        l1.next.next.next.next.next.next.next.next.next = new NodeList(22);
        l1.next.next.next.next.next.next.next.next.next.next = new NodeList(27);
        l1.next.next.next.next.next.next.next.next.next.next.next = new NodeList(31);

        NodeList l2 = new NodeList(2);
        l2.next = new NodeList(4);
        l2.next.next = new NodeList(6);
        l2.next.next.next = new NodeList(8);
        l2.next.next.next.next = new NodeList(11);
        l2.next.next.next.next.next = new NodeList(13);
        l2.next.next.next.next.next.next = new NodeList(18);
        l2.next.next.next.next.next.next.next = new NodeList(23);

    }

    static NodeList addTwoNumbers(NodeList l1, NodeList l2) {
        NodeList l3 = new NodeList(0);
        NodeList dummy = l3;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int x = l1 != null ? l1.data : 0;
            int y = l2 != null ? l2.data : 0;

            int sum = (x + y + carry) % 10;
            if (x + y + carry > 9) {
                carry = 1;
            } else {
                carry = 0;
            }

            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;

            l3.next = new NodeList(sum);
            l3 = l3.next;
        }

        return dummy.next;
    }

    static int searchThroughNumber(NodeList list, int target) {
        boolean found = false;
        while (list != null) {
            if (list.data == target) {
                found = true;
                break;
            }
            list = list.next;
        }

        return found ? target : 0;
    }

    static NodeList insertAtStart(NodeList list, int data) {
        NodeList newNode = new NodeList(data);
        newNode.next = list;

        return newNode;
    }

}

class NodeList {
    int data;
    NodeList next;

    NodeList(int data) {
        this.data = data;
        this.next = null;
    }
}