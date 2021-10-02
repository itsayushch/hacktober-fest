# Program to sort a list using Quick Sort Algorithm
# Time Complexity ---> Worst Case :O(n^2)
# Time Complexity ---> Best Case :O(nlog n)
def partition(A,low,high) :
    piv=A[low]
    i=low+1
    j=high
    while i<=j :
        while A[i]<piv :
            if i<high :
                i+=1
        while A[j]>piv :
            j-=1
        if i<j :
            (A[i],A[j])=(A[j],A[i])
    (A[j],A[low])=(A[low],A[j])
    return (j)

def quicksort(arr,low,high) :
    if low<high :
        pi=partition(arr,low,high)
        quicksort(arr,low,pi-1)
        quicksort(arr,pi+1,high)

def main() :
    marks=[10,17,2,5]
    print("Unsorted:",marks)
    quicksort(marks,0,len(marks)-1)
    print("Sorted:",marks)

main()
