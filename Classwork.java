public class Classwork
{
  public static void main(String[] args)
  {
    System.out.println(firstLastN("dictionary", 3));
    System.out.println();
    System.out.println(delEnd("library", 5));
  }

  public static String firstLastN(String word, int n)
  {
    String output = new String();

    String firstN = word.substring(0, n); // first n letters; substring from 0 to n-1
    int indexOfNToLast = word.length() - n; // index of the nth to last letter
    String lastN = word.substring(indexOfNToLast);

    output = firstN + lastN;
    return output;
  }

  public static String delEnd(String word, int n)
  {
    int lastN = word.length() - n;
    String end = word.substring(0, lastN);

    return end;
  }
}
