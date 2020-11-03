package thinkinjava.chapter19_enumerated.menu;

/**
 * 使用接口来组织枚举
 *
 * @author trevor.zhao
 * @date 2020/11/3
 */

//所有的枚举都是Food
public interface Food {


}

enum Appetizer implements Food {
    SALAD, SOUP, SPRING_ROLLS;
}

enum MainCourse implements Food {
    LASAGNE, BURRITO, PAD_THAI, LENTILS, HUMMOUS, VINDALOO;
}

enum Dessert implements Food {
    TIRAMISU, GELATO, BLACK_FOREST_CAKE, FRUIT, CREME_CARAMEL;
}

enum Coffee implements Food {
    BLACK_COFFEE, DECAR_COFFEE, ESPRESSO, LATTE, CAPPUCCINO, TEA, HERB_TEA;
}
