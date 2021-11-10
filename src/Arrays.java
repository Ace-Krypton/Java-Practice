public class Arrays {
    public static void main(String[] args) {

        System.out.println("=-=-=- Task 1 -=-=-=");

        char[] arrT1 = new char[100];
        System.out.println("\n");

        System.out.println("=-=-=- Task 2 -=-=-=");

        int[] arrT2 = new int[10];
        System.out.println(arrT2.length);
        System.out.println("\n");

        System.out.println("=-=-=- Task 3 -=-=-=");

        int[] arrT3 = new int[100000];

        for (int i = 0; i < arrT3.length; i++)
            arrT3[i] = ((int)(Math.random()*101));

        for (int arrT4 : arrT3) System.out.print(arrT4 + "\t");
        System.out.println("\n");

        System.out.println("=-=-=- Task 4 -=-=-=");

        int[] arrT5 = new int[101];

        for (int i = 0; i < arrT3.length; i++)
            arrT5[arrT3[i]]++;

        for (int i = 0; i < arrT5.length; i++)
            if (arrT5[i] != 0)
                System.out.println(i + ": " + arrT5[i]);
        System.out.println("\n");

        System.out.println("=-=-=- Task 5 -=-=-=");

        char[] arrT6 = {'R', 'a', 'm', 'i', 'z'};

        for(int i = 0; i < arrT6.length; i++) System.out.print(arrT6[i]);
        System.out.println("\n");

        System.out.println("=-=-=- Task 6 -=-=-=");

        int[] arrT7 = new int[(int) (Math.random()* 6 + 10)];

        for(int i = 0; i < arrT7.length; i++)
            arrT7[i] = i;

        for(int arrT8 : arrT7)
            System.out.print(arrT8 + "\t");
        System.out.println();

        for (int i = 0; i < 10000; i++) {
            int i1 = (int) ((Math.random() * arrT7.length));
            int i2 = (int) ((Math.random() * arrT7.length));

            if (i1 != i2){
                int tmp = arrT7[i1];
                arrT7[i1] = arrT7[i2];
                arrT7[i2] = tmp;
            }
        }

        for(int arrT8 : arrT7) System.out.print(arrT8 + "\t");
        System.out.println();

        for(int i = 0; i < arrT7.length; i++){
            for(int j = 0; j < arrT7.length; j++)
                System.out.print(((arrT7[j] == i) ? '*' : '.') + "\t");
            System.out.println("\n");
        }

        System.out.println("=-=-=- Task 7 -=-=-=");

        int[] arrT9 = {3, 2, 5, 1};

        for(int i = 0; i < arrT9.length; i++){
            for(int j = i+1; j < arrT9.length; j++){
                if (arrT9[j] < arrT9[i]){
                    int tmp = arrT9[i];
                    arrT9[i] = arrT9[j];
                    arrT9[j] = tmp;
                }
            }
        }

        for(int arrT10 : arrT9) System.out.println(arrT10);
        System.out.println('\n');
    }
}
