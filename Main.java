import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 3/7/2016.
 */
public class Main {
    public static void main(String[] args) {

        /*SumMultiples summultiples = new SumMultiples();
        System.out.print(summultiples.sum);*/

       // FibonaciSum sum = new FibonaciSum();
       // LargestPrimeFactor prime = new LargestPrimeFactor();

        //Palindrome
        //new LargestPalindromeProduct();

        //smallest Multiple
        new SmallestMultiple();

    }

 }
/*
 * Print out the Sum of Multiples of 3 and 5 below 1000
 * */
class SumMultiples
{
    public int sum;

    public SumMultiples()
    {
        for (int i = 1; i < 1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                this.sum += i;
            }
        }
    }
}

/*Print sum of the even valued term using fibonaci sequence*/
class FibonaciSum
{
    private int index = 1;
    private int stoppingPoint = 40;
    private int totalSum = 0;

    public FibonaciSum()
    {
        int n1 = 1;
        int n2 = 2;
        //System.out.println("n1="+n1);
        //fibonacciSequence(n1, n2);
        methodTwo();

    }

    public void methodTwo()
    {
        int sum = 0;
        int a = 1;
        int b = 2;
        while(b <= 4000000){
            if(b % 2 == 0)
                sum += b;
            int temp = b;
            b = b + a;
            a = temp;
        }
        System.out.println(sum);
    }

    public void fibonacciSequence(int n1, int n2)
    {
        System.out.println("index: " + index + " -> " + n2);

        if(totalSum<=4000000)
        {
            if(n2%2 == 0)
            {
                System.out.println("index: " + index + " -> " + n2);
                totalSum = totalSum+n2;
                System.out.println("totalSum: " + index + " -> " + totalSum);
            }
        }


        // make sure we have set an ending point so this Java recursion
        // doesn't go on forever.

        if (index == stoppingPoint)
            return;

        // make sure we increment our index so we make progress
        // toward the end.
        index++;

        fibonacciSequence(n2, n1+n2);
    }

}

 /*Largest prime factor
    * The prime factors of 13195 are 5,7,13 and 29
    *
   * */

class LargestPrimeFactor
{
    public LargestPrimeFactor()
    {
        //System.out.println(getlargestPrimeFactor(600851475143l));
        System.out.println(getlargestPrimeFactor(30));
    }

    public static int getlargestPrimeFactor(long number) {
        int i;
        long copyOfInput = number;

        for (i = 2; i <= copyOfInput; i++) {
            System.out.println("i "+i);
            if (copyOfInput % i == 0) {
                copyOfInput /= i;
                System.out.println("copyOfInput "+copyOfInput);
                System.out.println("i "+i);
                i--;
            }
        }

        return i;
    }
}

class LargestPalindromeProduct
{
    public LargestPalindromeProduct()
    {
        int n1 = 100,n2 = 999;
        int largetPnum = 0;

        for(int i = n1; i <=n2; i++)
        {
            /*int nextNum = n1+i;
            int num = n1 *(nextNum);
            System.out.println("n1 "+n1+ " * "+(nextNum)+" = "+num);
            if(isPalindrome(num))
            {
                System.out.println("palindrome number "+num);
            }*/
            System.out.println("number "+i);
            for(int j =n1; j <=n2; j++)
            {
                int pnum = i * j;
                if(isPalindrome(pnum))
                {
                    if(pnum>largetPnum)
                    {
                        largetPnum = pnum;
                        System.out.println("Largest = "+largetPnum);
                    }

                }

            }
        }

    }

    public boolean isPalindrome(int x)
    {
        if(x<0) return false;
        int div = 1;

        while(x/div >= 10)
        {
            div *= 10;
        }

        while (x !=0)
        {
            int l = x /div;
            int r = x % 10;
            if(l != r)
            {
                return false;
            }

            x = (x % div) / 10;
            div /= 100;
        }


        return true;
    }
}

/**
 * Smallest Multiple:
 * *

 **2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 ** What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

 */

class SmallestMultiple
{
    public SmallestMultiple()
    {

        int[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int smallestMultiple = 1;
        if(istSmallestMultiple(2520))
        {
            System.out.println("400 is the smallest multiple of number from 1 to 20");
        }

        boolean continueLoop = true;
        while(continueLoop)
        {
            if(istSmallestMultiple(smallestMultiple))
            {
                System.out.println(smallestMultiple+"is the smallest multiple of number from 1 to 20");
                continueLoop = false;
            }
            smallestMultiple++;
        }
    }

    public boolean istSmallestMultiple(int num)
    {
        for(int i = 1 ; i<=20 ; i++)
        {
            if(num%i !=0)
            {
                return false;
            }
        }
        return true;
    }
}


