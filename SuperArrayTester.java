public class SuperArrayTester {
  public static void main(String[] args) {

    SuperArray tester1 = new SuperArray();
    System.out.println(tester1.size());
    System.out.println(tester1.add("oof"));
    System.out.println(tester1.size());
    System.out.println(tester1.get(0));
    System.out.println(tester1.set(0, "car"));
    System.out.println(tester1.get(0));

    tester1.add("hi");
    tester1.add("pink");
    System.out.println(tester1.size());

    SuperArray tester2 = new SuperArray(5);
    System.out.println(tester2.add("hello"));
    tester2.add("fork");
    tester2.add("black");
    tester2.add("white");
    tester2.add("spoom");
    System.out.println(tester2.toString());
    tester2.add(5, "knife");
    tester2.add(6, "dog");
    tester2.add(7, "cat");
    tester2.add(8, "snake");
    tester2.add(9, "rabbit");
    System.out.println(tester2.toString());
    tester2.add(6, "white");
  }
}
