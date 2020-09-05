package DesignPattern.FlyWeight;

// 具体的网站
public class ConcreateWebSite extends WebSite {

    // 共享的部分，内部状态
    private String type = ""; // 网站发布的形式（类型）

    // 构造器
    public ConcreateWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println("网站的发布形式为：" + type + "，" + user.getName() + "在使用中");
    }
}
