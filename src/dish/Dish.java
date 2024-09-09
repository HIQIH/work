package dish;
//菜品
public class Dish {
    //编号
    int id;
    //菜名
    String name;
    //价格
    double price;

    //生成构造方法
    public Dish(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
}
