package dish;

import java.util.ArrayList;
import java.util.List;

//点菜
public class DishApp {
    //提前准备菜单
    //定义一个集合表示菜品
    static List<Dish> dishList=new ArrayList<>();
    public static void main(String[] args) {
        initDish();

    }
    //初始化菜品
    public static void initDish(){
        Dish dish=new Dish(1,"香辣肉丝",29.0);
        dishList.add(dish);
        Dish dish2=new Dish(2,"炖王八",59.0);
        dishList.add(dish2);

        //存放菜品
        dishList.add(new Dish(3,"凉菜",21.0));
        dishList.add(new Dish(4,"三县",24.0));
        dishList.add(new Dish(5,"大虾",55.0));
    }
}
