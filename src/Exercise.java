public class Exercise {
    public static void main(String[] args) {
        //Task 1
        char arr[] = new char[10];

        for (int i = 0; i < arr.length; ++i){
            arr[i] = (char)('A' + (int)(Math.random()*26));
        }

        for (char c : arr){
            System.out.println(c + " ");
        }

        //Task 2
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        for (int i = arr1.length-1; i >= 0 ;i--)
            System.out.println(arr1[i] + " ");
        System.out.println();

        for (int arrays : arr1){
            System.out.println(arrays + " ");
        }

        //Task 3
        int[] a0 = new int[]{1, 2, 3};
        int[] a1 = {4, 5, 6};
        int[] arraysum = new int[a0.length];

        for (int i = 0; i < arraysum.length; ++i)
            arraysum[i] = a0[i] + a1[i];

        for(int newarray : arraysum) System.out.println(newarray + " ");

        //Task 4
        int[] maxarray = {1, -1, 9, -7, 6, 8};
        int mx = maxarray[0];

        for (int i = 0; i < maxarray.length-1; ++i) if (maxarray[i] > mx) mx=maxarray[i];

        //Task 5
        int[] maxindex = {1, 5, 7, 8, 3, 2};
        int mxindex = 0;

        for (int i = 1; i < maxindex.length; i++)
            if (maxindex[i] > maxindex[mxindex]) mxindex = i;
        System.out.println("Maximum element has index " + mxindex);

        //Task 6
        int[] reverseArray = {1, 2, 3, 5, 6, 8, 9};

        for (int i = 0, j = reverseArray.length -1; i < j; i++, --j){
            int tmp = reverseArray[i];
            reverseArray[i] = reverseArray[j];
            reverseArray[j] = tmp;
        }

        for(int newReverseArray : reverseArray) System.out.print(newReverseArray);

        //Task 7
        int[] shuffleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        for (int i = 0; i < shuffleArray.length; ++i){
            int r = i + (int)((shuffleArray.length-i)*Math.random());
            int tmp = shuffleArray[i];
            shuffleArray[i] = shuffleArray[r];
            shuffleArray[r] = tmp;
        }

        for (int newShuffleArray : shuffleArray) System.out.println(newShuffleArray);
    }
}