public class SuperArray {
  private String[] data;
  private int size;

  public SuperArray() {
    size = 0;
    data = new String[2];
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
    System.out.println(newArray);
    data = newArray;
  }
}