public class Demo {
  public static void removeDuplicates(SuperArray s) {
    for (int i = s.size() - 1; i >= 0; i--) {
      if (s.indexOf(s.get(i)) != i) {
        s.remove(i);
      }
    }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    SuperArray overlap = new SuperArray();
    for (int i = 0; i < b.size(); i++) {
      overlap.add(a.get(i));
    }
    for (int i = 0; i < b.size(); i++) {
      overlap.add(b.get(i));
    }
    for (int i = overlap.size() - 1; i >= 0; i--) {
      if (a.indexOf(overlap.get(i)) == -1 || b.indexOf(overlap.get(i)) == -1) {
        overlap.remove(i);
      }
    }
    removeDuplicates(overlap);
    return overlap;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    SuperArray full = new SuperArray();
    int max;
    if(a.size() >= b.size()) {
      max = a.size();
    } else {
      max = b.size();
    }
    for (int i = 0; i < max; i++) {
      if(a.get(i) != null) {
        full.add(a.get(i));
      }
      if(b.get(i) != null) {
        full.add(b.get(i));
      }
    }
    return full;
  }


  public static void main(String[] args) {
    SuperArray words = new SuperArray();

    words.add("kani");  words.add("uni"); words.add("ebi");
    words.add("una");   words.add("una"); words.add("ebi");
    words.add("kani");  words.add("una"); words.add("una");
    words.add("ebi");   words.add("toro");

    SuperArray words2 = new SuperArray();

    words2.add("kani"); words2.add("ebo");  words2.add("una");
    words2.add("toro");

    System.out.println(words);

    System.out.println(findOverlap(words, words2));
    //kani una toro

    removeDuplicates(words);
    System.out.println(words);
    // kani uni ebi una toro
  }
}
