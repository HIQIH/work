package dish;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//点菜
public class DishApp {
    //提前准备菜单
    //定义一个集合表示菜品
    static List<Dish> dishList=new ArrayList<>();
    static List<Dish>personList=new ArrayList<>();
    public static void main(String[] args) {
        initDish();
        //输入
        Scanner s=new Scanner(System.in);
        while (true) {
            //给用户展示主菜单
            showMenu();
            //选择服务
            int num = s.nextInt();
            switch (num){
                case 1:
                    while (true) {
                        //菜单
                        showDisMenu();
                        int id = s.nextInt();
                        if(id==0){
                            break;
                        }
                        Dish dish=dishList.get(id-1);
                        System.out.println("您点了："+dish.name);
                        personList.add(dish);
                    }break;
                case 2:
                    //已点菜品
                    showPersonDish();
                    break;
                case 3:
                    //买单
                    pay();
                    return;
            }
        }
    }

    /**
     * 主菜单
     */
    public static void showMenu(){
        System.out.println("----主菜单----");
        System.out.println("菜单\t\t\t 1");
        System.out.println("已点菜品\t\t 2");
        System.out.println("买单\t\t\t 3");
        System.out.println("-------------");
        System.out.print("请选择服务：");
    }

    //菜单
    public static void showDisMenu(){
        System.out.println("----请点菜----");
        //遍历集合
        for (Dish dish : dishList) {
            System.out.println(dish.id + "\t" + dish.name + "\t" + dish.price + "元");
        }
        System.out.println("---输入序号点菜，按0返回上一级---");
    }

    //已点菜品
    public static void showPersonDish(){
        System.out.println("---您已点菜品---");
        for (Dish dish : personList) {
            System.out.println(dish.id + "\t" + dish.name + "\t" + dish.price + "元");
        }
    }

    //买单
    public static void pay(){
        System.out.println("---正在结算---");
        double total=0f;
        for (Dish dish : personList) {
            total = total + dish.price;
        }
        System.out.println("您一共消费了："+total+"元");
    }

    //初始化菜品
    public static void initDish(){
        Dish dish=new Dish(1,"肉丝",29.0);
        dishList.add(dish);
        Dish dish2=new Dish(2,"王八",59.0);
        dishList.add(dish2);

        //存放菜品
        dishList.add(new Dish(3,"凉菜",21.0));
        dishList.add(new Dish(4,"三县",24.0));
        dishList.add(new Dish(5,"大虾",55.0));
    }
}
