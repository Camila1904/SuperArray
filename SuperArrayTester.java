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
    System.out.println(tester1.isEmpty());
    System.out.println(tester1.toString());
    System.out.println(tester1.contains("white"));
    System.out.println(tester1.remove(0));
    System.out.println(tester1.toString());
    System.out.println(tester1.indexOf("pink"));

    SuperArray tester2 = new SuperArray(5);
    System.out.println(tester2.add("hello"));
    System.out.println(tester2.isEmpty());
    tester2.add("fork");
    tester2.add("black");
    tester2.add("white");
    tester2.add("spoon");
    System.out.println(tester2.toString());
    tester2.add(5, "knife");
    tester2.add(6, "dog");
    tester2.add(7, "cat");
    tester2.add(8, "snake");
    tester2.add(9, "rabbit");
    System.out.println(tester2.toString());
    tester2.add(6, "printer");
    System.out.println(tester2.contains("white"));
    System.out.println(tester2.contains("purple"));
    System.out.println(tester2.remove(9));
    System.out.println(tester2.toString());
    System.out.println(tester2.indexOf("white"));

    SuperArray tester3 = new SuperArray();
    tester3.add("red");
    tester3.add("orange");
    tester3.add("yellow");
    tester3.add("red");
    tester3.add("green");
    tester3.add("blue");
    tester3.add("purple");
    tester3.add("blue");
    System.out.println(tester3.toString());
    System.out.println(tester3.lastIndexOf("red"));
    System.out.println(tester3.lastIndexOf("blue"));

    SuperArray tester4 = new SuperArray();
    tester4.add("red");
    tester4.add("orange");
    tester4.add("yellow");
    tester4.add("red");
    tester4.add("green");
    tester4.add("blue");
    tester4.add("purple");
    tester4.add("blue");
    System.out.println(tester3.equals(tester4));
    tester4.add("white");
    System.out.println(tester3.equals(tester4));
  }
}
