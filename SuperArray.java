public class SuperArray {
  private String[] data;
  private int size;

  private int initialCapacity = 10;

  public SuperArray() {
    size = 0;
    data = new String[initialCapacity];
  }

  public SuperArray(int initialCapacity) {
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
    String[] newArray;
    if(data.length == 0) {
      newArray = new String[1];
    } else {
      newArray = new String[data.length * 2];
    }
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
      if(data[i] != null && data[i].equals(s)){
        return true;
      }
    }
    return false;
  }

  public void add(int index, String element) {
    size++;
    if(data.length >= size) {
      resize();
    }
    for(int i = size; i > index; i--) {
      data[i] = data[i - 1];
    }
    data[index] = element;
  }

  public String remove(int index) {
    size--;
    String hold = data[index];
    for (int i = index; i < size; i++) {
      data[i] = data[i+1];
    }
    return hold;
  }

  public int indexOf(String s) {
    for (int i = 0; i < size; i++) {
      if (data[i] != null && data[i].equals(s)) {
        return i;
      }
    }
    return -1;
  }

  public String[] toArray() {
    String[] hold = new String[size];
    for(int i = 0; i < size; i++) {
      hold[i] = data[i];
    }
    return hold;
  }
}