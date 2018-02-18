public class Change {
  public static void main(String args[]) {
    /*
     * Dividing each cost up into its own variable to be able to subtract in the
     * correct order.
     */
    double cost = 1.00;
    double cents = 0.10;
    double mycash = 2.00;

    /**
     * Because of the rounding off error in floating point numbers one should
     * not subtract floating point numbers that is close to each other. So
     * subtracting the 2 integers first and then the double creates the accurate
     * result.
     */
    System.out.println(mycash - cost - cents);
  }
}
