public class ErrorTester {
  public static void main (String[] args) {
    SuperArray tester = new SuperArray(10);
    for(int i=0; i<10;i++) {
    tester.add("pink");
  }
  try {
    tester.get(-5);
  }
  catch (IndexOutOfBoundsException e) {
    System.out.println("\nGET has an index out of bounds");
    e.printStackTrace();
  }
}
}
