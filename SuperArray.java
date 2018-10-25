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
    if (size() == 0) return true;
    return false;
  }

  public boolean add(String x) {
    if (size() == data.length) return false;
    else {
    	data[size()] = x;
    	size++;
    }
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

}
