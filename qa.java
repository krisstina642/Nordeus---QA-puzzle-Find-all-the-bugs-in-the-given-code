class JobFair {
    static void doSomething(int array[], int size) { // Array contains non-negative integers
        if ( size<=1 || array==null )return;
        int size2=size;
        if (size>array.length) size2=array.length;
        int[] output = new int[size2];

        // Find the largest and the smallest element of the array
        int max = array[0];
        int min = array[0];
        for (int i = 1; i < size2; i++) {
            if (array[i] > max)
                max = array[i];
            if (array[i] < min)
                min = array[i];
        }
        max++;
        int[] count = new int[max];

        // Store the count of each element
        for (int i = 0; i < size2; i++) {
            count[array[i]]++;
        }

        int k = 0;
        for (int i = min; i < max; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[k++] = i;
            }
        }

    }
   /* public static void main(String[] args){
        int[] output= new int[]{10,9,8,7,6,5,44};
        int size=6;
        System.out.print("Size : ");
        System.out.println(size);
        System.out.print("Pocetni niz"); System.out.println();
        for (int i=0;i<output.length; i++) System.out.print(output[i]+" ");

        doSomething(output,size);
        System.out.println();
        System.out.println("Sortiran niz");
        for (int i=0;i<output.length; i++) System.out.print(output[i]+" ");

    } */
}

