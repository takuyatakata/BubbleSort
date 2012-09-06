class BubbleSort {
    static void bubble_sort(int[] array) {
               sorted = false;


    static boolean check_sorted(int[] array) {
	boolean sorted = true;

	for (int i = 1; i < array.length; ++i) {
	    if(array[i-1] > array[i]) {
　            int t = array[i];
              array[i] = array[i-1];
              array[i-1] = t;
            }
        }
     }

	return sorted;
     }
}

    public static void main(String[] args) {
	//	int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	int[] a = { 7, 9, 0, 3, 1, 8, 6, 2, 5, 4 };

	bubble_sort(a);
	System.out.println(check_sorted(a));
    }
}
