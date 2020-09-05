package DesignPattern.Adapter.objectadapter;

// 适配器类
public class VlotageAdapter implements IVoltage5V {

    private Voltage220V voltage220V; // 关联关系-聚合

    // 通过构造器传入一个Voltage220V实例
    public VlotageAdapter(Voltage220V voltage220V) {
        super();
        this.voltage220V = voltage220V;
    }

    @Override
    public int output5V() {
        int dst = 0;
        if (null != voltage220V) {
            int src = voltage220V.output220V(); // 获取220V电压
            System.out.println("使用对象适配器进行适配");
            dst = src / 44;
            System.out.println("适配完成，输出电压为=" + dst);
        }
        return dst;
    }
}
