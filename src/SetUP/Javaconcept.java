package SetUP;

public class Javaconcept extends SetUP {
    public static void reverse() {
        int num = 4531;
        int rev = 0;
        System.out.println("Number is :" + num);
        while (num != 0)
        {
            int dig = num % 10;
            rev = rev * 10 + dig;
            num = num / 10;
        }
        System.out.println("Number is Reverse : " + rev);
    }

    public static void gd() {
        int[] array = {12, 34, 4, 5, 6, 77};
        int size = array.length;
        int temp;
        for (int i = 0; i <= size - 2; i++) {
            if (array[i] < array[i + 1]) {
                temp = array[i];
                array[i] = array[i + 1];
                array[i + 1] = temp;
            }
        }
        System.out.println("Greatest number is :" + array[size - 1]);
    }

    public static void sum() {
        int[] array = {2, 4, 5, 5};
        int size = array.length;
        int count = 0;
        for (int i = 0; i <= size - 1; i++) {
            count = count + array[i];
        }
        System.out.println("Sume of array is : " + count);
    }

    public static void sume() {
        String str = "df7df5fdf5";
        char[] ch = str.toCharArray();
        //int size = ch.length;
        int sum = 0;

        for (int i = 0; i <= ch.length; i++) {
            if (Character.isDigit(ch[i])) ;
            {
                System.out.println("Given digits is string :" + ch[i]);
                int a = Integer.parseInt(String.valueOf(ch[i]));
                sum = sum + a;
            }
        }
        System.out.println("sum of digits is : " + sum);
    }

    public static int sumes(int k) {

        if (k > 0) {
            return k + sumes(k - 1);
        } else {
            return 0;
        }
    }

    public static void SigleElement()
    {
        String someString = "elephant";
        char someChar = 'e';
        int count = 0;

        for (int i = 0; i < someString.length(); i++) {
            if (someString.charAt(i) == someChar)
            {
                count++;
            }
        }
        System.out.println("Total word : " + count);
    }
}