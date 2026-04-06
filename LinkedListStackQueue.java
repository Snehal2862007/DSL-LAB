import java.util.Scanner;

class SNode {
    int data;
    SNode next;

    SNode(int data) {
        this.data = data;
        next = null;
    }
}
class DNode {
    int data;
    DNode prev, next;

    DNode(int data) {
        this.data = data;
        prev = next = null;
    }
}

public class LinkedListStackQueue {

    SNode stop = null;
    SNode sfront = null, srear = null;

    DNode dtop = null;
    DNode dfront = null, drear = null;

    void pushS(int value) {
        SNode newNode = new SNode(value);
        newNode.next = stop;
        stop = newNode;
        System.out.println("Inserted in Singly Stack");
    }

    void popS() {
        if (stop == null) {
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println("Deleted: " + stop.data);
        stop = stop.next;
    }

    void displayStackS() {
        SNode temp = stop;
        if (temp == null) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Singly Stack Elements:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void enqueueS(int value) {
        SNode newNode = new SNode(value);

        if (srear == null) {
            sfront = srear = newNode;
        } else {
            srear.next = newNode;
            srear = newNode;
        }

        System.out.println("Inserted in Singly Queue");
    }

    void dequeueS() {
        if (sfront == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + sfront.data);
        sfront = sfront.next;

        if (sfront == null)
            srear = null;
    }
 void displayQueueS() {
        SNode temp = sfront;

        if (temp == null) {
	    System.out.println("Singly Queue Elements:");
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Singly Queue Elements:");
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void pushD(int value) {
        DNode newNode = new DNode(value);

        if (dtop != null)
            dtop.prev = newNode;

        newNode.next = dtop;
        dtop = newNode;

        System.out.println("Inserted in Doubly Stack");
    }

    void popD() {
        if (dtop == null) {
            System.out.println("Stack Underflow");
            return;
        }

        System.out.println("Deleted: " + dtop.data);
        dtop = dtop.next;

        if (dtop != null)
            dtop.prev = null;
    }
void displayStackD() {
        DNode temp = dtop;

        if (temp == null) {
            System.out.println("Doubly Stack Elements:");
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Doubly Stack Elements:");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    void enqueueD(int value) {
        DNode newNode = new DNode(value);

        if (drear == null) {
            dfront = drear = newNode;
        } else {
            drear.next = newNode;
            newNode.prev = drear;
            drear = newNode;
        }

        System.out.println("Inserted in Doubly Queue");
    }

    void dequeueD() {
        if (dfront == null) {
            System.out.println("Queue Underflow");
            return;
        }

        System.out.println("Deleted: " + dfront.data);
        dfront = dfront.next;

        if (dfront != null)
            dfront.prev = null;
        else
            drear = null;
    }
    void displayQueueD() {
        DNode temp = dfront;

        if (temp == null) {
	    System.out.println("Doubly Queue Elements:");
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Doubly Queue Elements:");
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }


    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        LinkedListStackQueue obj = new LinkedListStackQueue();

        int choice, value;

        do {

            System.out.println("\n1 Push Stack (Singly)");
            System.out.println("2 Pop Stack (Singly)");
            System.out.println("3 Enqueue Queue (Singly)");
            System.out.println("4 Dequeue Queue (Singly)");
            System.out.println("5 Push Stack (Doubly)");
            System.out.println("6 Pop Stack (Doubly)");
            System.out.println("7 Enqueue Queue (Doubly)");
            System.out.println("8 Dequeue Queue (Doubly)");
	    System.out.println("9 Display Stack");
            System.out.println("10 Display Queue");
            System.out.println("11 Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    obj.pushS(value);
                    break;

                case 2:
                    obj.popS();
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    obj.enqueueS(value);
                    break;

                case 4:
                    obj.dequeueS();
                    break;

                case 5:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    obj.pushD(value);
                    break;

                case 6:
                    obj.popD();
                    break;

                case 7:
                    System.out.print("Enter value: ");
                    value = sc.nextInt();
                    obj.enqueueD(value);
                    break;

                case 8:
                    obj.dequeueD();
                    break;
		case 9:
                    obj.displayStackS();
                    obj.displayStackD();
                    break;

                case 10:
                    obj.displayQueueS();
                    obj.displayQueueD();
                    break;

                case 11:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 11);
    }
}