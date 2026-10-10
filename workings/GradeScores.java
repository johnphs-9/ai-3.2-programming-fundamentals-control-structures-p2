package workings;

public class GradeScores {
  public static void main(String[] args) {
    int[] scores = {85, 92, 78, 65, 40};

    for (int score : scores) {
      String result = (score >= 50) ? "Pass" : "Fail";
      System.out.println(score + " -> " + result);
    }
  }
}
