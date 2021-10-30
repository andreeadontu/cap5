public class ex12
{
    public static void main( String args[] )
    {
        int product = 1; // the product of all the odd numbers

        // loop through all odd numbers from 3 to 15
        for ( int x = 3; x <= 15; x += 2 )
            product *= x;

        // show results
        System.out.printf( "Product is %d\n", product );
    } // end main
}