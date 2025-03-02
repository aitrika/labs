#include <stdio.h>
#include <stdlib.h>

#define MAX 100

// Structure to represent a job
struct Job {
    int id;       // Job ID
    int deadline; // Deadline of job
    int profit;   // Profit of job
};

// Function to compare two jobs based on their profits
int compare(const void *a, const void *b) {
    struct Job *jobA = (struct Job *)a;
    struct Job *jobB = (struct Job *)b;
    return jobB->profit - jobA->profit; // Sort in descending order of profit
}

// Function to find the maximum profit sequence of jobs
void jobSequencing(struct Job jobs[], int n) {
    // Array to keep track of free time slots
    int result[n]; 
    // Initially, all slots are free
    for (int i = 0; i < n; i++) {
        result[i] = -1;
    }

    // Sort the jobs in decreasing order of profit
    qsort(jobs, n, sizeof(jobs[0]), compare);

    int totalProfit = 0;
    printf("Job Sequence:\n");

    // Iterate through all jobs
    for (int i = 0; i < n; i++) {
        // Find a free time slot for this job
        for (int j = jobs[i].deadline - 1; j >= 0; j--) {
            if (result[j] == -1) { // If slot is free
                result[j] = jobs[i].id; // Assign the job to this slot
                totalProfit += jobs[i].profit; // Add profit
                printf("Job ID: %d (Profit: %d) at time slot %d\n", jobs[i].id, jobs[i].profit, j + 1);
                break;
            }
        }
    }

    printf("Total Profit: %d\n", totalProfit);
}

int main() {
    int n;
    printf("Enter the number of jobs: ");
    scanf("%d", &n);

    struct Job jobs[n];
    
    // Input job details (ID, Deadline, Profit)
    for (int i = 0; i < n; i++) {
        printf("Enter job ID, Deadline, Profit for job %d: ", i + 1);
        scanf("%d %d %d", &jobs[i].id, &jobs[i].deadline, &jobs[i].profit);
    }

    // Call job sequencing function to find the optimal job sequence
    jobSequencing(jobs, n);

    return 0;
}
