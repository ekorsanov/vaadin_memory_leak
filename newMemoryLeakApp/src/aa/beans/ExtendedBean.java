package aa.beans;

import java.io.Serializable;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: mybook
 * Date: 17.10.12
 * Time: 23:03
 * To change this template use File | Settings | File Templates.
 */
public class ExtendedBean extends SimpleBean implements Serializable {

    private SimpleBean article;
    private SimpleBean articleType;
    private SimpleBean articleName;
    private Date date;
    private float price;
    private int amount;
    private float sum;
    private String description;

    public ExtendedBean(long id, long parentId, SimpleBean article, SimpleBean articleType, SimpleBean articleName, Date date, float price, int amount, float sum, String description) {
        setId(id);
        setParentId(parentId);
        //setName(article);
        this.date = date;
        this.article = article;
        this.articleType = articleType;
        this.articleName = articleName;
        this.price = price;
        this.amount = amount;
        this.sum = sum;
        this.description = description;
    }

    public ExtendedBean() {
    }

    public SimpleBean getArticle() {
        return article;
    }

    public void setArticle(SimpleBean article) {
        this.article = article;
    }

    public SimpleBean getArticleType() {
        return articleType;
    }

    public void setArticleType(SimpleBean articleType) {
        this.articleType = articleType;
    }

    public SimpleBean getArticleName() {
        return articleName;
    }

    public void setArticleName(SimpleBean articleName) {
        this.articleName = articleName;
    }


    public Date getDate() {
        return date;
    }


    public void setDate(Date date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(float sum) {
        this.sum = sum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return getArticle().getName();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ExtendedBean that = (ExtendedBean) o;

        if (amount != that.amount) return false;
        if (Float.compare(that.price, price) != 0) return false;
        if (Float.compare(that.sum, sum) != 0) return false;
        if (article != null ? !article.equals(that.article) : that.article != null) return false;
        if (articleName != null ? !articleName.equals(that.articleName) : that.articleName != null) return false;
        if (articleType != null ? !articleType.equals(that.articleType) : that.articleType != null) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

}
