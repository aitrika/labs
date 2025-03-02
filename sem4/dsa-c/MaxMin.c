#include <stdio.h>

// Function to find the maximum and minimum in an array
void findMaxMin(int arr[], int n, int *max, int *min) {
    *max = arr[0];  // Initialize max with the first element
    *min = arr[0];  // Initialize min with the first element
    
    for (int i = 1; i < n; i++) {
        if (arr[i] > *max) {
            *max = arr[i];  // Update max if a larger number is found
        }
        if (arr[i] < *min) {
            *min = arr[i];  // Update min if a smaller number is found
        }
    }
}

int main() {
    int n;
    
    // Input the number of elements in the array
    printf("Enter the number of elements: ");
    scanf("%d", &n);
    
    int arr[n];
    
    // Input the array elements
    printf("Enter %d elements: \n", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }
    
    int max, min;
    
    // Find the max and min values
    findMaxMin(arr, n, &max, &min);
    
    // Output the results
    printf("Maximum value: %d\n", max);
    printf("Minimum value: %d\n", min);
    
    return 0;
}
