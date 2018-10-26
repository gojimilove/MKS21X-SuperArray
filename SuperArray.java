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
      result = result + data[i];
      if (i != size() - 1) result += ", ";
    }
    result += "]";
    return result;
  }

  public String toStringDebug() {
  	String result = "[";
    for (int i = 0; i < data.length; i++) {
    		result = result + data[i];
      	if (i != data.length - 1) result += ", ";
    }
    result += "]";
    return result;
  }

  public String get(int index) {
  	if (index < 0 || index >= size()) {
  		System.out.println("Error: index out of range");
  		return null;
  	}
  	return data[index];
  }

  public String set(int index, String x) {
  	String old = "";
  	if (index < 0 || index >= size()){
  		System.out.println("Error: index out of range");
  		return null;
  	}
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

  public boolean contains(String x) {
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(x)) return true;
    }
    return false;
  }

  public int indexOf(String x) {
    int index = -1;
    for (int i = 0; i < size() && index == -1; i++) {
      if (data[i].equals(x)) index = i;
    }
    return index;

  }

  public int lastIndexOf(String x) {
    int index = -1;
    for (int i = 0; i < size(); i++) {
      if (data[i].equals(x)) index = i;
    }
    return index;
  }

  public void add(int index, String x) {
    resize();
    if (index < 0 || index > size()) System.out.println("Error: index out of range");
    else {
    	for (int i = size(); i > index; i--) {
    		data[i] = data[i - 1];
    	}
    	data[index] = x;
    	size++;
    }
  }

  public String remove(int index) {
    if (index < 0 || index >= size()) {
    	System.out.println("Error: index out of range");
    	return null;
    }
    String x = data[index];
    for (int i = index; i <= size(); i++) {
    	data[i] = data[i + 1];
    }
    size--;
    return x;
  }

  public boolean remove(String x) {
    if (contains(x)) {
    	remove(indexOf(x));
    }
    return contains(x);
  }

}
