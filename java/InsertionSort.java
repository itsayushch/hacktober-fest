class InsertionSort {
    public void insertionSort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int k = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > k) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = k;
        }
    }
    static void displayArray(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }
     public static void main(String args[])
    {
        int arr[] = { 56, 76, 14, 58, 97 };
 
        InsertionSort ob1 = new InsertionSort();
        ob1.insertionSort(arr);
 
        displayArray(arr);
    }
}