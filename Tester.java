import java.util.Arrays;

public class Tester {
  public static void removeDuplicates(SuperArray s) {
    for(int i = s.size() - 1; i >= 0; i--) {
      if(s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    for(int i = 0; i < b.size(); i++) {
      overlap.add(a.get(i));
      overlap.add(b.get(i));
    }
    for(int i = overlap.size() - 1; i >= 0; i--) {
      if (a.indexOf(overlap.get(i)) == -1 || b.indexOf(overlap.get(i)) == -1) {
        overlap.remove(i);
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }


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


    a.clear();
    System.out.println(a.isEmpty()); // true
    System.out.println(a);

    SuperArray words = new SuperArray();

    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");     
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro"); 

    SuperArray words2 = new SuperArray();

    words2.add("kani"); 
    words2.add("ebo");
    words2.add("una");
    words2.add("toro");

    System.out.println(words);
    System.out.println(findOverlap(words, words2));

    removeDuplicates(words);
    System.out.println(words);
  }
}
