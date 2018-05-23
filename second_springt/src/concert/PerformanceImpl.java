package concert;

public class PerformanceImpl implements Performance{
    @Override
    public void perform() {
        System.out.println(this.getClass()+"正在演出~~~");
    }
}