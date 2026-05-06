
import java.util.*;
class snode{
    int data;
    snode next;
    snode(int data){
        this.data=data;
        snode next=null;
    }
}
class dnode{
    int data;
    dnode next,pre;
    dnode(int data){
        this .data=data;
        pre=next=null;
    }
}
class sll{
    snode head=null;
    void insertbeg(int data){
        snode newnode=new snode(data);
        newnode.next=head;
        head=newnode;
    }
    void insertend(int data){
        snode newnode=new snode(data);
        if(head==null){
            System.out.println("list is empty");
            head=newnode;
            return;

        }
        snode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            temp.next=newnode;
        }
    }
    void deletebeg(){
        if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.next;
        }
    }
    void deleteend(){
        if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            snode temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
                temp.next=null;
            }
        }

        
    }
    void displaysll(){
        if (head==null){
            System.out.println("list is empty");
        }
        snode temp=head;
        while(temp!=null){
            System.out.println(temp.data);
        }
        System.out.println("null");
    }
}

class dll{
    dnode head=null;
    void insertbeg(int data){
        dnode newnode=new dnode(data);
        if (head!=null){
            head.pre=newnode;
            newnode.next=head;

        }
        head=newnode;
    }

    void insertend(int data){
        dnode newnode=new dnode(data);
         if(head==null){
            System.out.println("list is empty");
            head=newnode;
            return;

        }
        dnode temp=head;
        while(temp.next!=null){
            temp=temp.next;
            temp.next=newnode;
            newnode.pre=temp;
        }
    }
    void deletebeg(){
         if(head==null){
            System.out.println("list is empty");
        }
        else{
            head=head.next;
            if(head!=null){
                head.pre=null;
            }
        }

    }
    void deleteend(){
         if(head==null){
            System.out.println("list is empty");
        }
        else if(head.next==null){
            head=null;
        }
        else{
            dnode temp=head;
            while(temp.next.next!=null)
            {
                temp=temp.next;
                temp.pre.next=null;
            }
        }

    }
    void displaydll(){
        if (head==null){
            System.out.println("list is empty");
        }
        dnode temp=head;
        while(temp!=null){
            System.out.println(temp.data+"->");
        }
        System.out.println("null");
    }
}
public class slldll {

    public static void main(String[] args) {
        int choice;
        int val;
        sll s=new sll();
        dll d=new dll();
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("menu");
            System.out.println("1.insert at beg(sll)");
            System.out.println("2.insert at end(sll)");
            System.out.println("3.delete at beg(sll)");
            System.out.println("4.delete at end(sll)");
            System.out.println("5.display(sll)");
            System.out.println("6.insert at beg(dll)");
            System.out.println("7.insert at end(dll)");
            System.out.println("8.delete at beg(dll)");
            System.out.println("9.delete at end(dll)");
            System.out.println("10.display(dll)");
            System.out.println("enter your choice");
            choice=sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("enetr data to insert in sll");
                    val=sc.nextInt();
                    s.insertbeg(val);
                    
                    break;
                case 2:
                    System.out.println("enetr data to insert in sll");
                    val=sc.nextInt();
                    s.insertend(val);
                    
                    break;
                case 3:
                    s.deletebeg();
                    break;
                case 4:
                    s.deleteend();
                    break;
                case 5:
                    s.displaysll();
                    break;
                case 6:
                    System.out.println("enetr data to insert in sll");
                    val=sc.nextInt();
                    d.insertbeg(val);
                    break;
                case 7:
                    System.out.println("enetr data to insert in sll");
                    val=sc.nextInt();
                    d.insertend(val);
                    
                    break;
                case 8:
                    d.deletebeg( );
                    break;
                case 9:
                    d.deleteend();
                    break;
                case 10:
                    d.displaydll();
                    break;

                default:
                    System.out.println("invalid choice");
                    break;
            }


        }while(choice!=11);
        sc.close();
        
    }
}
