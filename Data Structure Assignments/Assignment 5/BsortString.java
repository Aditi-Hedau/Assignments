class BsortString {
    void bsort(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    void display(String arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String args[]) {
        BsortString h1 = new BsortString();
        String arr[] = {"banana", "apple", "orange", "grape", "kiwi"};
        System.out.println("Original array:");
        h1.display(arr);
        h1.bsort(arr);
        System.out.println("\nSorted array:");
        h1.display(arr);
    }
}
