package ykostrub.cn.ua.patterns.builder;

/**
 * The Class NutritionFacts.
 * @author Yuriy Kostrub(http://astelit.ukr).
 */
public class NutritionFacts {

  /** The serving size. */
  private final int servingSize;

  /** The servings. */
  private final int servings;

  /** The calories. */
  private final int calories;

  /** The fat. */
  private final int fat;

  /** The sodium. */
  private final int sodium;

  /** The carbohydrate. */
  private final int carbohydrate;
  
  

  /**
   * The Class Builder.
   */
  public static class Builder {
    // required parameters
    /** The serving size. */
    private final int servingSize;

    /** The servings. */
    private final int servings;

    // optional parameters

    /** The calories. */
    private int calories = 0;

    /** The fat. */
    private int fat = 0;

    /** The sodium. */
    private int sodium = 0;

    /** The carbohydrate. */
    private int carbohydrate = 0;

    /**
     * Instantiates a new builder.
     * @param servingSize the serving size
     * @param servings the servings
     */
    public Builder(
        int servingSize,
        int servings) {
      this.servingSize = servingSize;
      this.servings = servings;
    }

    /**
     * Calories.
     * @param cat the cat
     * @return the builder
     */
    public Builder calories(
        int cat) {
      this.calories = cat;
      return this;
    }

    /**
     * Fat.
     * @param fat the fat
     * @return the builder
     */
    public Builder fat(
        int fat) {
      this.fat = fat;
      return this;
    }

    /**
     * Carbohydrate.
     * @param carbohydrate the carbohydrate
     * @return the builder
     */
    public Builder carbohydrate(
        int carbohydrate) {
      this.carbohydrate = carbohydrate;
      return this;
    }

    /**
     * Sodium.
     * @param sodium the sodium
     * @return the builder
     */
    public Builder sodium(
        int sodium) {
      this.sodium = sodium;
      return this;
    }

    /**
     * Builds the.
     * @return the nutrition facts
     */
    public NutritionFacts build() {
      return new NutritionFacts(this);
    }

  }

  
  @Override
  public String toString() {
    return "NutritionFacts [servingSize=" + servingSize + ", servings=" + servings + ", calories="
        + calories + ", fat=" + fat + ", sodium=" + sodium + ", carbohydrate=" + carbohydrate + "]";
  }


  /**
   * Instantiates a new nutrition facts.
   * @param builder the builder
   */
  private NutritionFacts(
      Builder builder) {
    this.servingSize = builder.servingSize;
    this.servings = builder.servings;
    this.calories = builder.calories;
    this.fat = builder.fat;
    this.sodium = builder.sodium;
    this.carbohydrate = builder.carbohydrate;
  }

}
