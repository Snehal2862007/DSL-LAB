#include <iostream>
using namespace std;

int main() {
    int arr[20], n, choice;
    int i, j, pos, value, key, temp;

    cout << "Enter number of elements: ";
    cin >> n;

    cout << "Enter array elements:\n";
    for (i = 0; i < n; i++) {
        cin >> arr[i];
    }

    do {
        cout << "\n------ MENU ------\n";
        cout << "1. Traverse\n";
        cout << "2. Insert\n";
        cout << "3. Update\n";
        cout << "4. Delete\n";
        cout << "5. Search\n";
        cout << "6. Sort\n";
        cout << "7. Merge Two Arrays\n";
        cout << "8. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {

        case 1: { // Traverse
            cout << "Array elements: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
            break;
        }

        case 2: { // Insert
            cout << "Enter position and value: ";
            cin >> pos >> value;

            for (i = n; i > pos; i--) {
                arr[i] = arr[i - 1];
            }
            arr[pos] = value;
            n++;

            cout << "Array after insertion: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
            break;
        }

        case 3: { // Update
            cout << "Enter position and new value: ";
            cin >> pos >> value;

            arr[pos] = value;

            cout << "Array after update: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
            break;
        }

        case 4: { // Delete
            cout << "Enter position to delete: ";
            cin >> pos;

            for (i = pos; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            n--;

            cout << "Array after deletion: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
            break;
        }

        case 5: { // Search
            cout << "Enter element to search: ";
            cin >> key;

            for (i = 0; i < n; i++) {
                if (arr[i] == key) {
                    cout << "Element found at position " << i << endl;
                    break;
                }
            }
            if (i == n) {
                cout << "Element not found\n";
            }
            break;
        }

        case 6: { // Sort (Bubble Sort)
            for (i = 0; i < n - 1; i++) {
                for (j = 0; j < n - i - 1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }

            cout << "Array after sorting: ";
            for (i = 0; i < n; i++) {
                cout << arr[i] << " ";
            }
            cout << endl;
            break;
        }

        case 7: { // Merge
            int a[10], b[10], c[20];
            int n1, n2, k = 0;

            cout << "Enter size of first array: ";
            cin >> n1;
            cout << "Enter elements of first array:\n";
            for (i = 0; i < n1; i++) {
                cin >> a[i];
            }

            cout << "Enter size of second array: ";
            cin >> n2;
            cout << "Enter elements of second array:\n";
            for (i = 0; i < n2; i++) {
                cin >> b[i];
            }

            i = 0;
            j = 0;
            while (i < n1 && j < n2) {
                if (a[i] < b[j]) {
                    c[k++] = a[i++];
                } else {
                    c[k++] = b[j++];
                }
            }

            while (i < n1) {
                c[k++] = a[i++];
            }
            while (j < n2) {
                c[k++] = b[j++];
            }

            cout << "Merged array: ";
            for (i = 0; i < k; i++) {
                cout << c[i] << " ";
            }
            cout << endl;
            break;
        }

        case 8: {
            cout << "Exiting program...\n";
            break;
        }

        default: {
            cout << "Invalid choice\n";
        }
        }

    } while (choice != 8);

    return 0;
}
