package list;

public class LinkedListMain {

    public static void main(final String[] args) {
        final Employee janeJones = new Employee("Jane", "Jones", 123);
        final Employee johnDoe = new Employee("John", "Doe", 4567);
        final Employee marySmith = new Employee("Mary", "Smith", 22);
        final Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        final EmployeeLinkedList list = new EmployeeLinkedList();

        System.out.println(list.isEmpty());

        list.addToFront(janeJones);
        list.addToFront(johnDoe);
        list.addToFront(marySmith);
        list.addToFront(mikeWilson);

        System.out.println(list.getSize());
        System.out.println(list.isEmpty());
        list.printList();

        list.removeFromFront();
        System.out.println(list.getSize());
        list.printList();
    }
}
