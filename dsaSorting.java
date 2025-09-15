public class dsaSorting {
    public static void printArray(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        // time complexity O(n^2)
        //bubble sort
        int arr[] ={9,6,4,8,2};
        int temp=0;
        System.out.println(arr.length);
        for (int i = 0; i < arr.length-1; i++) {  // 5-1=4
            for (int j = 0; j < arr.length-i-1; j++) {  //5-0-1 =4 5-1-1=3
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        printArray(arr);

        //selection sort
        int arr1[] = {9,4,6,2,1};
        System.out.println(arr1.length);

        for (int i = 0; i < arr1.length-1; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                 if(arr1[i]>arr1[j]){
                    temp = arr1[i];
                    arr1[i] = arr1[j];
                    arr1[j] = temp;
                }
            }
        }
        printArray(arr1);

        //inserction sort
        int arr2[] = {7,8,3,1,2};
        System.out.println(arr2.length);

        for (int i = 0; i < arr2.length; i++) {
            int j=i-1;
            while (j >= 0 && arr2[i] < arr2[j]) {
                arr2[j+1] = arr2[j];
                j--;
            }
            arr2[j+1]=arr2[i];
            
        }
        printArray(arr2);

        


    }
}
