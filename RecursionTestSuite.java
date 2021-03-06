public class RecursionTestSuite {

  public static void main(String[] args) {
    System.out.println("Running tests...");

    gcdTests();
    isPrimeTests();
    sumSquareDigitsTests();
    isHappyTests();

    System.out.println("...tests complete.");
  }

  public static void gcdTests() {
    checkGCD(12, 16, 4);
    checkGCD(14748364, 1088742, 2);

  }

  public static void isPrimeTests() {
    checkIsPrime(9, false);
    checkIsPrime(2, true);
    checkIsPrime(1, false);
    checkIsPrime(32452867, true);
    checkIsPrime(32452868, false);

  }

  public static void sumSquareDigitsTests() {
    checkSumSquareDigits(10, 1);
    checkSumSquareDigits(103, 10);
    checkSumSquareDigits(62780359, 268);

  }

  public static void isHappyTests() {
    checkIsHappy(397, true);
    checkIsHappy(123, false);
    checkIsHappy(1000, true);
    checkIsHappy(999, false);

  }


  private static void checkGCD(int x, int y, int expected) {
    int actual = RecursionLibrary.greatestCommonDivisor(x, y);
    if (actual != expected) {
      System.out.println("greatestCommonDivisor(" + x + ", " + y + "); expected: "
          + expected + ", got: " + actual);
    }
  }

  private static void checkIsPrime(int value, boolean expected) {
    boolean actual = RecursionLibrary.isPrime(value);
    if (actual != expected) {
      System.out.println("isPrime(" + value + "); expected: " + expected
          + ", got: " + actual);
    }
  }

  private static void checkSumSquareDigits(int n, int expected) {
    int actual = RecursionLibrary.sumSquareDigits(n);
    if (actual != expected) {
      System.out.println("sumSquareDigits(" + n + "); expected: "
          + expected + ", got: " + actual);
    }
  }

  private static void checkIsHappy(int n, boolean expected) {
    boolean actual = RecursionLibrary.isHappy(n);
    if (actual != expected) {
      System.out.println("isHappy(" + n + "); expected: " + expected
          + ", got: " + actual);
    }
  }

}
