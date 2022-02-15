package SetUP;

import org.openqa.selenium.WebElement;

import java.util.Arrays;

public class SetUP
{
    public static void main(String[] args) throws Exception
    {
        //Sort();
        //Arraystring();
        //multidimentionalarray();
        //math();
        //Printstring();
        //String str = "er355k3k322l";
        //SumOfString();
        //addgt();
        //CountWord();
        revers();
        Squre();
        power();
        prim_Number();
    }
    public static void Sort()
    {
        int [] arry = new int[] {90,30,44,2,1,6,3};
        Arrays.sort(arry);
        System.out.println("Elements is sorted");
        for(int i= 0; i<arry.length; i++)
        {
            System.out.println(arry[i]);
        }
   }
   public static void Arraystring()
   {
       String[] cars = {"volvo", "Toyota", "Hondaye"};
       cars[0] = "Swift";
       System.out.println(cars[0]);
       System.out.println(cars.length);
       String F = "Numan \"hjkk\" ";
       String L = "Bahadur \f khan";
       System.out.println(F.concat(L));
   }
   public static void multidimentionalarray()
   {
       int [][] myarray = {{1,25,51,5,6,7},{5,6,45,96,58}};
       int x = myarray[0][4];
       System.out.println(x);
   }
   public static void math()
   {
       String Nmuber = "  123456789  ";
       String Nub = "63";
       System.out.println(Nmuber+"Hello Java");
       System.out.println(Nmuber.trim()+"Hello Java");
   }
   public static void Printstring()
   {
       String x = "Mehdi514";
       String y = "12334";
       for(int i=0; i<x.length();i++)

       {
           System.out.print(x.charAt(i) + "\n");
       }
   }
   public static void SumOfString()
   {
       String str1 = "dhj34dfhf9fs";
       char[] ch = str1.toCharArray();
       int sum = 0;
       for (int i = 0; i < ch.length; i++)
       {
           if (Character.isDigit(ch[i]))
           {
               System.out.print("Digits in the String : " + ch[i]);
               System.out.println();
               int a = Integer.parseInt(String.valueOf(ch[i]));
               sum = sum + a;
           }
       }
       System.out.println("Sum of Digits is : " + sum);
   }
   public static void addgt()
   {
       int temp, size;
       int array[] = {10, 20, 25, 63, 96, 57};

       size = array.length;

       for(int i = 0; i<array.length; i++ )
       {
           for(int j = i+1; j<array.length; j++)
           {
               if(array[i]>array[j])
               {
                   temp = array[i];
                   array[i] = array[j];
                   array[j] = temp;
               }
           }
       }
       System.out.println("Third largest element is:: " +array[size-2]);
   }
   public static void CountWord()
   {
       String my = "HelloMyFriendsJavidKamalAhmed";
       char [] ch = my.toCharArray();
       int count = 0;
       for(int i =0; i<my.length(); i++)
       {
           //ch[i] = my.charAt(i);
           //if(((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ') || ((ch[0]!=' ')&&(i==0))))
            if(Character.isUpperCase(ch[i]))
               count++;
       }
       System.out.print("Total word " +count);
   }
   public static void revers()
   {
       int num = 12763;
       int revers =0;
       System.out.println("Revers " +num);
       while (num!=0)
       {
           int digit = num%10;
           revers = revers*10 + digit;
           num = num/10;
       }
       System.out.println("Num Reverse " +revers);
   }
   public static void Squre()
    {
        // get two double numbers numbers
        double x = 9;
        double y = 25;


        // print the square root of these doubles
        System.out.println("Math.sqrt(" + x + ")=" + Math.sqrt(x));
        System.out.println("Math.sqrt(" + y + ")=" + Math.sqrt(y));
        //int value = 10;
        //System.out.println("Power of ("+ x +")="  +Math.pow(value));

    }
    public static void power()
    {
        int exponent = 2;
        int base = 5;
        int power=1;
        for(int i =1;i<=exponent;i++)
        {
        power = power*base;
        System.out.println("Power of x =" +power);
        }
    }
    public static void prim_Number() throws Exception
     {
         try
         {
             int i,m=0,flag=0;
             int n=9;//it is the number to be checked
             m=n/2;
             if(n==0||n==1)
             {
                 System.out.println(n+" is not prime number");
             }else
             {
                 for(i=2;i<=m;i++)
                 {
                     if(n%i==0)
                     {
                         System.out.println(n+" is not prime number");
                         flag=1;
                        break;
                     }
                 }
                 if(flag==0)
                 {
                     System.out.println(n+" is prime number");
                 }
             }//end of else

         }catch (Exception ex)
         {
            ex.getMessage();
         }
     }
}

