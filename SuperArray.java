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
  public boolean isEmpty() {
    return size == 0;
  }
  public void clear() {
    data = new String[data.length];
    size = 0;
  }
  public String toString() {
    if (size == 0) {
      return "[]";
    }
    String newString = "[";
    for (int i=0;i<size-1;i++) {
      newString+=data[i] + ", ";
    }
    return newString + data[size-1] + "]";
  }
  public boolean contains(String x) {
    for (int i=0;i<size;i++) {
      if(data[i].equals(x)) {
        return true;
      }
    }
    return false;
  }
  public void add(int index, String element) {
    if (size == data.length) {
      resize();
    }
    String[] sizer = new String[data.length];
    for (int i=0;i<index;i++) {
      sizer[i] = data[i];
    }
    sizer[index] = element;
    for (int i=index;i<data.length-1;i++) {
      sizer[i+1] = data[i];
    }
    data = sizer;
    size++;
  }
  public String remove(int index) {
    String newString = data[index];
    for (int i=0; i<size-1;i++) {
      data[i] = data[i+1];
    }
    data[size-1] = null;
    size--;
    return newString;
  }
  public int indexOf(String x) {
    for (int i=0; i<size;i++) {
      if (data[i].equals(x)) {
        return i;
      }
    }
    return -1;
  }
  public String[] toArray() {
    String[] arr = new String[size];
    for (int i=0; i<size;i++) {
      arr[i] = data[i];
    }
    return arr;
  }
}
