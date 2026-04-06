import java.util.Scanner;

class Node {
    int data;
    Node next;
}

public class StackQueueAvail {

    static Node top = null;      
    static Node front = null;        
    static Node rear = null;     
    static Node avail = null;    

    
    static Node getNode(int data) {
        Node temp;

        if (avail != null) {
            temp = avail;
            avail = avail.next;
        } else {
            temp = new Node();
        }

        temp.data = data;
        temp.next = null;
        return temp;
    }

    
    static void freeNode(Node temp) {
        temp.next = avail;
        avail = temp;
    }

    
    static void push(int data) {
        Node newNode = getNode(data);
        newNode.next = top;
        top = newNode;
        System.out.println("Pushed: " + data);
    }

    
    static void pop() {
        if (top == null) {
            System.out.println("Stack Underflow");
            return;
        }

        Node temp = top;
        System.out.println("Popped: " + temp.data);
        top = top.next;
        freeNode(temp);
    }

    
    static void displayStack() {
        Node temp = top;

        if (temp == null) {
            System.out.println("Stack Empty");
            return;
        }

        System.out.println("Stack elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    static void enqueue(int data) {
        Node newNode = getNode(data);

        if (rear == null) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }

        System.out.println("Inserted: " + data);
    }

    
    static void dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return;
        }

        Node temp = front;
        System.out.println("Deleted: " + temp.data);

        front = front.next;
        if (front == null)
            rear = null;

        freeNode(temp);
    }

    
    static void displayQueue() {
        Node temp = front;

        if (temp == null) {
            System.out.println("Queue Empty");
            return;
        }

        System.out.println("Queue elements:");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice, data;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Push (Stack)");
            System.out.println("2. Pop (Stack)");
            System.out.println("3. Display Stack");
            System.out.println("4. Enqueue (Queue)");
            System.out.println("5. Dequeue (Queue)");
            System.out.println("6. Display Queue");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    push(data);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    displayStack();
                    break;

                case 4:
                    System.out.print("Enter data: ");
                    data = sc.nextInt();
                    enqueue(data);
                    break;

                case 5:
                    dequeue();
                    break;

                case 6:
                    displayQueue();
                    break;

                case 7:
                    System.out.println("Program Ended");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 7);

        sc.close();
    }
}