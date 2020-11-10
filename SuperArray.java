public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int startingCapacity) {
    data = new String[startingCapacity];
    size = 0;
  }
  public int size() {
    return size;
  }
  private void resize() {
    String[] arr = new String[data.length*2 + 1];
    for (int i=0;i<data.length;i++) {
      arr[i] = data[i];
    }
    data = arr;
  }
  public boolean add(String element) {
    if (size == data.length) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }
  public String get (int index) {
    return data[index];
  }
  public String set(int index, String element) {
    String replaced = data[index];
    data[index] = element;
    return replaced;
  }
  public void add(int index, String element) {
    if (size == data.length) {
      resize();
    }
    String[] sizer = new String[data.length];
    for (int i=0;i<index;i++) {
      sizer[i+1] = data[i];
    }
    data = sizer;
    size++;
  }
}
