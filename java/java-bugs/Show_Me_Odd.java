    import java.util.Scanner;

    public class Show_Me_Odd

    {

        public static void main(String[] args) 

        {

            int n;

            Scanner s = new Scanner(System.in);

            System.out.print("Enter no. of elements you want in array:");

            n = s.nextInt();

            int a[] = new int[n];

            System.out.println("Enter all the elements:");

            for (int i = 0; i < n; i++) 

            {

                a[i] = s.nextInt();

            }

            System.out.print("Odd numbers:");

            for(int i = 0 ; i < n ; i++)

            {

              /*
               * Taking the modules of a negative odd number in Java won't always
               * result in positive 1. But will always not equal to 0.
               */
                if(a[i] % 2 != 0)

                {

                    System.out.print(a[i]+" ");

                }

            }

            System.out.println("");

            System.out.print("Even numbers:");

            for(int i = 0 ; i < n ; i++)

            {

                if(a[i] % 2 == 0)

                {

                    System.out.print(a[i]+" ");

                }

            }

        }

    }
