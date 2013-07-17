package aa;

import aa.beans.ExtendedBean;
import aa.beans.SimpleBean;
import com.vaadin.ui.Table;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: mybook
 * Date: 13.07.13
 * Time: 23:52
 * To change this template use File | Settings | File Templates.
 */
public class MyTable extends Table {
    Random randomGenerator;
    public static SimpleDateFormat formatTimeStamp = new SimpleDateFormat("dd.MM.yyyy");
    NumberFormat currencyInstance = NumberFormat.getCurrencyInstance();

    public MyTable() {
        setSelectable(true);
        setNullSelectionAllowed(false);
        setHeight("100%");
        setWidth("100%");

        addContainerProperty("Дата", String.class, null);
        addContainerProperty("Название", SimpleBean.class, null);
        addContainerProperty("Сумма", String.class, null);
        addContainerProperty("Описание", String.class, null);
        randomGenerator = new Random();
    }

   public void generateRandomDate(int amountRow){
       for (int i=0; i < amountRow; i++) {
           SimpleBean a = new SimpleBean(randomGenerator.nextInt(), randomGenerator.nextInt(), "A" + i);
           SimpleBean b = new SimpleBean(randomGenerator.nextInt(), randomGenerator.nextInt(), "B" + i);
           SimpleBean c = new SimpleBean(randomGenerator.nextInt(), randomGenerator.nextInt(), "C" + i);
           ExtendedBean awfwfw = new ExtendedBean(randomGenerator.nextInt(), randomGenerator.nextInt(), a, b, c, new Date(), 0, 0, 0, "awfwfw");
           addItem(new Object[]{
                   formatTimeStamp.format(awfwfw.getDate()),
                   awfwfw.getArticle(),
                   currencyInstance.format(awfwfw.getSum()),
                   awfwfw.getDescription()},
                   awfwfw);
       }
   }
}
