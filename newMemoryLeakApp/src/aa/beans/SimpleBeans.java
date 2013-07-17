package aa.beans;

/**
 * Created by IntelliJ IDEA.
 * User: vm
 * Date: 11.10.12
 * Time: 13:38
 * To change this template use File | Settings | File Templates.
 */
public class SimpleBeans {
    SimpleBean[] simpleDBBeans;

    public SimpleBeans(SimpleBean[] simpleDBBeans) {
        this.simpleDBBeans = simpleDBBeans;
    }

    public SimpleBeans() {
        simpleDBBeans = new SimpleBean[0];
    }

    public void addSimpleDBBeans(SimpleBean host) {
        SimpleBean[] newHosts;
        if (simpleDBBeans == null) {
            newHosts = new SimpleBean[1];
            newHosts[0] = host;
        } else {
            newHosts = new SimpleBean[simpleDBBeans.length + 1];
            int i = 0;
            for (SimpleBean qwe : simpleDBBeans) {
                newHosts[i] = qwe;
                i++;
            }
            newHosts[i] = host;
        }
        setSimpleDBBeans(newHosts);
    }

    public void setSimpleDBBeans(SimpleBean[] simpleDBBeans) {
        this.simpleDBBeans = simpleDBBeans;
    }

    public SimpleBean[] getSimpleDBBeans() {
        return simpleDBBeans;
    }

    public int size() {
        return simpleDBBeans.length;
    }


}
