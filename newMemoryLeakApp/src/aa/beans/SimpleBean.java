package aa.beans;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * User: vm
 * Date: 11.10.12
 * Time: 13:32
 * To change this template use File | Settings | File Templates.
 */
public class SimpleBean implements Serializable {
    private long id;
    private long parentId;
    private String name;
    private SimpleBean[] simpleDBBeans;

    public SimpleBean(long id, long parentId, String name) {
        this.id = id;
        this.parentId = parentId;
        this.name = name;
    }

    public SimpleBean(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SimpleBean() {
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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



    public SimpleBean[] getSimpleDBBeans() {
        return simpleDBBeans;
    }

    public void setSimpleDBBeans(SimpleBean[] simpleDBBeans) {
        this.simpleDBBeans = simpleDBBeans;
    }

    @Override
    public String toString() {
        return getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SimpleBean bean = (SimpleBean) o;

        if (id != bean.id) return false;
        if (parentId != bean.parentId) return false;
        if (name != null ? !name.equals(bean.name) : bean.name != null) return false;

        return true;
    }

}
