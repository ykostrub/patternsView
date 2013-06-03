package ykostrub.cn.ua.patterns.builder;

/**
 *
 *
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class BuilderTest {

  /**
   * @param args
   */
  public static void main(
      String[] args) {
    NutritionFacts cocaCola = new NutritionFacts.Builder(240, 8).calories(100).carbohydrate(27).sodium(35).build();
    System.out.println(cocaCola);
  }

}
