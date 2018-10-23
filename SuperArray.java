public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public static void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    if (size == 0) return true;
    return false;
  }

  public boolean add(String new) {
    if (size == data.length) resize();
    else data[size] = new;
    return true;
  }

  public String toString() {
    String result = "["
    for (int i = 0; i < size; i++) {
      result+= data[i];
    }
    result += "]";
    return result;
  }

  public String toStringDebug()

}
