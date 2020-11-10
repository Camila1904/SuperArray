public class Demo {
  public static void removeDuplicates(SuperArray x) {
    for (int i = x.size()-1; i>=0;i--) {
      if (x.contains(x.get(i)) != i) {
        x.remove(i);
      }
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    for (int i=0; i<a.size();i++) {
      if(b.contains(a.get(i)) != i) {
        overlap.add(a.get(i));
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }
  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray resultString = new SuperArray();
    for (int i=0; i<a.size() || i<b.size();i++) {
      if (i<a.size()) {
        resultString.add(a.get(i));
      }
      if (i<b.size()) {
        resultString.add(b.get(i));
      }
    }
    return resultString;
  }
}
