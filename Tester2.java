public class Tester2 {
  public static void main(String[] args) {
    SuperArray a = new SuperArray();
    System.out.println(a.isEmpty()); // true
    a.add("hi");
    a.add("no");
    a.set(0, "yes");
    a.get(0); // "yes"
    System.out.println(a.size()); //2
    a.add("maybe");
    System.out.println(a.isEmpty()); //false
    System.out.println(a);
    System.out.println(a.contains("hi")); //false
    System.out.println(a.contains("no")); // true
    a.clear();
    System.out.println(a.isEmpty()); // true
    System.out.println(a);
  } 
}
