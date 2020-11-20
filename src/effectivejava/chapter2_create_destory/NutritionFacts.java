package effectivejava.chapter2_create_destory;

/**
 * Builder模式
 *
 * @author trevor.zhao
 * @date 2020/11/20
 */
public class NutritionFacts {
    private final int servingSize; //必填值
    private final int servings; //必填值
    private final int calories;
    private final int fat;
    private final int carbohydrate;

    //声明为private 外部无法调用,同时也没有了默认无参数的构造器
    private NutritionFacts(Builder builder) {
        this.servingSize = builder.servingSize;
        this.servings = builder.servings;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.carbohydrate = builder.carbohydrate;
    }
    //设置为静态内部类,原因有:
    //无需先新建外部类的实例,再进行访问 可以通过 new NutritionFacts.Builder()来调用构造方法
    public static class Builder {
        private final int servingSize;
        private final int servings;
        private int calories = 0;
        private int fat = 0;
        private int carbohydrate = 0;

        //构造器,传入必传参数
        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        //类似于装饰器,增加一部分属性,又返回本身
        public Builder calories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat) {
            this.fat = fat;
            return this;
        }

        public Builder carbohydrate(int carbohydrate) {
            this.carbohydrate = carbohydrate;
            return this;
        }
        //内部类调用外部类的构造方法,生成实例
        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    public static void main(String[] args) {
        new NutritionFacts.Builder(1, 1).calories(100).fat(5).build();
        Builder builder = new Builder(12, 1);


    }
}
