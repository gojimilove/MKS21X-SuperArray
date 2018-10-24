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
    if (size() == 0) return true;
    return false;
  }

  public boolean add(String new) {
    data[size()] = new;
    return true;
  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < size(); i++) {
      result+= data[i];
    }
    result += "]";
    return result;
  }

  public String toStringDebug() {
  	String result = "[";
    for (int i = 0; i < data.length; i++) {
    	if (data[i] == null) result+= "null, ";
      else result = result + data[i] + ", ";
    }
    result += "]";
    return result;
  }

  public String get(int index) {
  	if (index < 0 || index >= size()) return null;
  	return data[index];
  }

  public String set(int index, String new) {
  	String old = "";
  	if (index < 0 || index >= size()) return null;
  	else {
  		old = data[index];
  		data[index] = new;
  		return old;
  	}
  }

}
