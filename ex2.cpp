#include <iostream>
using namespace std;

int main() {
    int A[10][10], B[10][10], C[10][10];
    int r1, c1, r2, c2;
    int choice;

    cout << "Enter rows and columns of Matrix A: ";
    cin >> r1 >> c1;

    cout << "Enter rows and columns of Matrix B: ";
    cin >> r2 >> c2;

    cout << "Enter elements of Matrix A:\n";
    for(int i = 0; i < r1; i++)
        for(int j = 0; j < c1; j++)
            cin >> A[i][j];

    cout << "Enter elements of Matrix B:\n";
    for(int i = 0; i < r2; i++)
        for(int j = 0; j < c2; j++)
            cin >> B[i][j];

    do {
        cout << "\n MENU \n";
        cout << "1. Addition\n";
        cout << "2. Subtraction\n";
        cout << "3. Multiplication\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {

        case 1:
          
                for(int i = 0; i < r1; i++) {
                    for(int j = 0; j < c1; j++) {
                        C[i][j] = A[i][j] + B[i][j];
                        cout << C[i][j] << " ";
                    }
                    cout << endl;
                }
           break;

        case 2:
                for(int i = 0; i < r1; i++) {
                    for(int j = 0; j < c1; j++) {
                        C[i][j] = A[i][j] - B[i][j];
                        cout << C[i][j] << " ";
                    }
                    cout << endl;
                }
            
            break;

        case 3:
                for(int i = 0; i < r1; i++) {
                    for(int j = 0; j < c2; j++) {
                        C[i][j] = 0;
                        for(int k = 0; k < c1; k++) {
                            C[i][j] += A[i][k] * B[k][j];
                        }
                        cout << C[i][j] << " ";
                    }
                    cout << endl;
                }
          
            break;
        

        default:
            cout << "Invalid choice\n";
        }

    } while(choice != 4);

    return 0;
}
