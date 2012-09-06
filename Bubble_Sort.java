public class BubbleSort {
          static void bubble_sort(int[] array) {
                for(int i = 0; i < array.length -1; i++){
                     for(int j = array.length -1; j > i; j--){
                       if(array[j-1] > array[j]){
                       int tmp = array[j-1];
                       array[j-1] = array[j];
                       array[j] = tmp;
                       }
                      }
                 }
           }   

            static boolean check_sorted(int[] array) {
                  boolean sorted = true;

                 for (int i = 1; i < array.length; ++i) {
                  if(array[i-1] > array[i]) {
                      sorted = false;
                  }
}

return sorted;
}

public static void main(String[] args) {
// int[] a = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
int[] a = { 7, 9, 0, 3, 1, 8, 6, 2, 5, 4 };

bubble_sort(a);
System.out.println(check_sorted(a));
}
}
