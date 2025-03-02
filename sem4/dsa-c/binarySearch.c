#include <stdio.h>

// Function for Binary Search
int binarySearch(int arr[], int low, int high, int target) {
    while (low <= high) {
        int mid = low + (high - low) / 2;
        
        // Check if target is at mid
        if (arr[mid] == target)
            return mid;  // Return index if found
        
        // If target is greater, ignore left half
        if (arr[mid] < target)
            low = mid + 1;
        
        // If target is smaller, ignore right half
        else
            high = mid - 1;
    }
    
    return -1; // Target not found
}

int main() {
    int arr[] = {1, 3, 5, 7, 9, 11, 13, 15};
    int n = sizeof(arr) / sizeof(arr[0]);
    int target = 7;

    int result = binarySearch(arr, 0, n - 1, target);
    if (result != -1)
        printf("Element found at index %d\n", result);
    else
        printf("Element not found\n");

    return 0;
}
