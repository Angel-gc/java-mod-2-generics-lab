import java.util.Arrays;

class Problem {
  // declare the convertToString method here
  public static <T> String convertToString(T[] array){
    System.out.println(Arrays.toString(array));
    return Arrays.toString(array);
  }
  public static <E> E getFirstElement(E[] array){
    return array[0];
  }
}

public class StringRunner {
  public static void main(String[] args) {
    Integer[] inputInt = { 1, 2, 3 };
    String[] inputStr = { "Cake", "Donut", "Cupcake" };

    System.out.println(Problem.convertToString(inputInt)); // [1, 2, 3]
    System.out.println(Problem.convertToString(inputStr)); // [Cake, Donut,
    // Cupcake]
  }
}