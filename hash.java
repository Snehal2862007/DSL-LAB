import java.util.Scanner;

class HashTable {
    int[] table;
    int size;

    HashTable(int s) {
        size = s;
        table = new int[size];
        for (int i = 0; i < size; i++) {
            table[i] = -1;
        }
    }
    void insert(int key) {
        int index = key % size;

        while (table[index] != -1) {
            index = (index + 1) % size;
        }

        table[index] = key;
    }

    void display() {
        System.out.println("\nIndex\tValue");
        for (int i = 0; i < size; i++) {
            if (table[i] != -1)
                System.out.println(i + "\t" + table[i]);
            else
                System.out.println(i + "\t" + "Empty");
        }
    }
}

public class hash {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter table size: ");
        int size = sc.nextInt();

        HashTable ht = new HashTable(size);

        System.out.print("Enter number of keys: ");
        int n = sc.nextInt();

        System.out.println("Enter keys:");
        for (int i = 0; i < n; i++) {
            int key = sc.nextInt();
            ht.insert(key);
        }

        ht.display();
        sc.close();
    }
  
}