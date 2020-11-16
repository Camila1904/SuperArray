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
  try {
    SuperArray test1 = new SuperArray(-2);
  }
  catch (IllegalArgumentException e) {
    System.out.println("\nCONSTRUCTOR has an illegal argument");
    e.printStackTrace();
  }
  try {
    SuperArray test2 = new SuperArray(3);
    test2.add("red");
    test2.set(1,"white");
  }
  catch (IndexOutOfBoundsException e) {
    System.out.println("\nADD has an index out of bounds");
    e.printStackTrace();
  }
  try {
    SuperArray test3 = new SuperArray();
    test3.add(1, "black");
  }
  catch (IndexOutOfBoundsException e) {
    System.out.println("\nADD has an index out of bounds");
    e.printStackTrace();
  }
}
}
