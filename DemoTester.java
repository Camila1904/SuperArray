public class DemoTester {
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani"); words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");
    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);

    SuperArray tester1 = new SuperArray();
    tester1.add("1");
    tester1.add("2");
    tester1.add("3");
    tester1.add("2");
    System.out.println(tester1);
    SuperArray tester2 = new SuperArray();
    tester2.add("0");
    tester2.add("1");
    tester2.add("4");
    tester2.add("6");
    tester2.add("2");
    System.out.println(tester2);
    Demo.removeDuplicates(tester1);
    System.out.println(tester1);
    System.out.println(Demo.findOverlap(tester1, tester2));
    System.out.println(Demo.zip(tester1,tester2));
  }
}
