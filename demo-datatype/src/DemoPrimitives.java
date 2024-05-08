public class DemoPrimitives {
  public static void main(String[] args){
    // number / string (text)
    // number (integers/ decimal)
    // int is a data type that declaring the type of value of x can be stored.
    // int ->integer
    int x = 3;
    // int y = 3.5; // y cannot store non-integer number.
    int z = -9;
    int total = x + z; //-6
    System.out.println(total);

    // + - * /
    int a = total - 10 + x;
    System.out.println(a); // -13

    int k = a + x * 8;
    System.out.println(k); // 11

    //
    int r = 32 / x;
    System.out.println(r); //10

    // remainder

    int remainder = 10 % 3; //1
    int divide = 10 / 3; //3
    System.out.println(remainder); //1
    System.out.println(divide); // 3
  }
}
