public class SuperArray {
  private String[] data;
  private int size;

  private int initialCapacity = 2;

  public SuperArray() {
    size = 0;
    data = new String[initialCapacity];
  }

  public int size() {
    return size;
  }

  public boolean add(String element) {
    if(size < data.length) {
      data[size] = element;
      size++;
    } else if(size >= data.length) {
      resize();
      add(element);
    }
    return true;
  }

  public String get(int index) {
    return data[index];
  }

  public String set(int index, String element) {
    String old = data[index];
    data[index] = element;
    return old;
  }

  private void resize() {
    String[] newArray = new String[size * 2];
    for(int i = 0; i < data.length; i++) {
      newArray[i] = data[i];
    }
    data = newArray;
  }

  public boolean isEmpty() {
    return size == 0;
  }

  public void clear() {
    data = new String[initialCapacity];
    size = 0;
  }

  public String toString() {
    String hold = "";
    hold += "[";
    for(int i = 0; i < size; i++) {
      hold += data[i];
      if(i != size - 1) {
        hold += ", ";
      }
    }
    hold += "]";
    return hold;
  }

  public boolean contains(String s) {
    for(int i = 0; i < size; i++) {
      if(data[i] == s) {
        return true;
      }
    }
    return false;
  }
}