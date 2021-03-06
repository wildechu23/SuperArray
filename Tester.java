import java.util.Arrays;

public class Tester {
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a.isEmpty()); // true
    a.add("hi");
    a.add("no");
    a.set(0, "yes");
    a.get(0); // "yes"
    System.out.println(a.size()); // 2
    a.add("maybe");
    System.out.println(a.isEmpty()); // false
    System.out.println(a); // ["yes", "no", "maybe"]
    System.out.println(a.contains("hi")); // false
    System.out.println(a.contains("no")); // true
    System.out.println(a.indexOf("no")); // 1
    a.add(1, "ok");
    System.out.println(a); // ["yes", "ok", "no", "maybe"]
    a.remove(2);
    System.out.println(a); // ["yes", "ok", "maybe"]
    System.out.println(Arrays.toString(a.toArray()));

    
    SuperArray b = new SuperArray();
    b.add("yes");
    b.add("ok");
    b.add("maybe");

    System.out.println(a.equals(b));

    b.add("hello");
    
    System.out.println(a.equals(b));


    a.clear();
    System.out.println(a.isEmpty()); // true
    System.out.println(a);
  }
}
