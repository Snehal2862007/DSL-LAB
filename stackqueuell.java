import java.util.*;
class node{
    int data;
    node next;
    node(int data){
        this.data=data;
        this.next=null;
    }
}
public class stackqueuell {
    static node top=null;
    static node front=null,rear=null;
    

    static void push(int x){
        node newnode=new node(x);
        newnode.next=top;
        top=newnode;
        System.out.println("pushed :"+x);

    }
    static void pop(){
        if (top==null){
            System.out.println("stack is empty");
        }
        else{
            System.out.println("element deleted:"+top.data);
            top=top.next;
            
        }
    }
    static void display()
    {
        if(top==null){
            System.out.println("stack is empty");
        }
        else{
            node temp=top;
            while(temp!=null){
                System.out.println("elements:"+"->"+temp.data);
                temp=temp.next;
            }
        }
    }

    static void enqueue(int x){
        node newnode=new node(x);
        if(front==null){
            rear=front=newnode;

        }
        else{
            rear.next=newnode;
            rear=newnode;
        }
    }
    static void dequeue(){
        if(front==null){
            System.out.println("empty");
        }
        else{
            System.out.println("popped:"+front.data);
            front=front.next;
        }
    }
    static void displayqueue(){
        if(front==null){
            System.out.println("queue is empty");
        }
        else{
            node temp=front;
            while(temp!=null){
                System.out.println(temp.data +"->");
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
    do{
        System.out.println("menu");
        System.out.println("1.stack using linkedlist");
        System.out.println("2.queue using linkedlist");
        System.out.println("3.exit");
        System.out.println("enter your choice");
        choice=sc.nextInt();
        switch(choice){
            case 1:
                do{
                    System.out.println("stack menu");
                    System.out.println("1,push");
                    System.out.println("2.pop");
                    System.out.println("3.display");
                    System.out.println("4.exit");
                    System.out.println("enter your choice");
                    choice=sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("enter data to push");
                            int value=sc.nextInt();
                            push(value);
                            display();
                            break;
                        case 2:
                            pop();
                            display();
                            break;
                        case 3:
                            display();
                            break;
                        case 4:
                            System.out.println("exit");
                            break;
                        default:
                            System.out.println("invalid choice");
                            break;
                    }
                }while (choice!=5) ;
            case 2:
                do{
                    System.out.println("queuw menu");
                    System.out.println("1.enqueue");
                    System.out.println("2.dequeue");
                    System.out.println("3.displau");
                    System.out.println("4.exit");
                    System.out.println("enter choice");
                    choice= sc.nextInt();
                    switch (choice) {
                        case 1:
                            System.out.println("enetr value");
                            int value=sc.nextInt();
                            enqueue(value);
                            
                            break;
                        case 2:
                            dequeue();
                            break;
                        case 3:
                            displayqueue();
                            break;
                        case 4:
                            System.out.println("exit");
                            break;
                        default:
                            System.out.println("invalid choice");
                            break;
                    }
                }while(choice!=5);

        }
    }while(choice!=4);
    sc.close();
    
}
}
