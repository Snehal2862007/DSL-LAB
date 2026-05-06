import java.util.Scanner;

public class search {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr=new int[10];
        int n=0;
        int choice;
        System.out.println("enter number of elements");
        n=sc.nextInt();
        System.out.println("enter elments");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        do{
            System.out.println("menu");
            System.out.println("1.linear search");
            System.out.println("2.binary search");
            System.out.println("3.display");
            System.out.println("4.exit");
            System.out.println("enter choice");
            choice=sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("enter element to search");
                    int key=sc.nextInt();
                    boolean found=false;
                    for(int i=0;i<n;i++){
                        if (arr[i]==key){
                            System.out.println("element found at index"+ i);
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        System.out.println("element not found");
                    }
                    break;
                case 2:
                    System.out.println("sorting");
                    for(int i=0;i<n;i++){
                        for(int j=0;j<n-i-1;j++){
                        if(arr[j]>arr[j+1]){
                        int temp=arr[j];
                        arr[j]=arr[j+1];
                        arr[j+1]=temp;
                        }
                    }
                   
                    }
                    System.out.println("enter element to search");
                    key=sc.nextInt();
                    int low=0,high=n-1;
                    int mid;
                    found=false;
                    while(low<=high){
                        mid=(low+high)/2;
                        if(arr[mid]==key){
                        System.out.println("element found at index"+ mid);
                        found=true;
                        break;
                    }
                    
                    else if(arr[mid]<key){
                        low=mid+1;
                    }
                    else{
                        high=mid-1;
                    }
                    
                    }
                    if(!found){
                        System.out.println("not found");
                    }
                    break;
                case 3:
                System.out.println("display array");
                for(int i=0;i<n;i++){
                    System.out.println(arr[i]);;
                  }
                  break;
                case 4:
                    System.out.println("exit");
            
        }


    }while (choice!=4);
    sc.close();
}
}