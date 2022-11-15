package List;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(final Employee employee) {
        final EmployeeNode node = new EmployeeNode(employee);
        node.setNext(head);
        head = node;
        size++;
    }

    public Employee removeFromFront() {
        if (isEmpty()) {
            return null;
        }

        final EmployeeNode removedNode = head;
        head = head.getNext();
        size--;
        removedNode.setNext(null);

        return removedNode.getEmployee();
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeNode currentNode = head;
        System.out.print("HEAD -> ");
        while (currentNode != null) {
            System.out.println(currentNode);
            System.out.print("-> ");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }

}
