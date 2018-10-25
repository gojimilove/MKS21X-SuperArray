public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray() {
    data = new String[10];
  }

  public void clear() {
    size = 0;
  }

  public int size() {
    return size;
  }

  public boolean isEmpty() {
    return size() == 0;
  }

  public boolean add(String x) {
    if (size() == data.length) resize();
    data[size()] = x;
    size++;
    return true;

  }

  public String toString() {
    String result = "[";
    for (int i = 0; i < size(); i++) {
      result = result + data[i]+ ", ";
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

  public String set(int index, String x) {
  	String old = "";
  	if (index < 0 || index >= size()) return null;
  	else {
  		old = data[index];
  		data[index] = x;
  		return old;
  	}
  }

  private void resize() {
     String[] newArray = new String[size() * 2];
     for (int i = 0; i < size(); i++) {
       newArray[i] = data[i];
     }
     data = newArray;
  }

  public boolean contains(String target) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(x)) return true;
    }
    return false;
  }

  public int indexOf(String target) {
    int index = -1;
    for (int i = 0; i < size() && index == -1; i++) {
      if (data[i].equals(target)) index = i;
    }
    return index;

  }

  public int lastIndexOf(String target) {
    int index = -1;
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(target)) index = i;
    }
    return index;
  }

  public void add(int index, String x) {
    //SANITY CHECK
  }

  public String remove(int index) {
    //SANITY CHECK
    return "";
  }

  public boolean remove(String x) {
    //SANITY CHECK
    //return false if x wasn't there to begin with
    return false;
  }

}
