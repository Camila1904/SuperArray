public class Demo {
  public static void removeDuplicates(SuperArray x) {
    for (int i = 0; i<x.size();i++) {
      if (i!= x.indexOf(x.get(i))) {
        x.remove(i);
        i--;
      }
    }
  }
}
