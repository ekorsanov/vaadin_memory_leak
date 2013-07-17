package aa;


import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.*;



/**
 * Created with IntelliJ IDEA.
 * User: mybook
 * Date: 13.07.13
 * Time: 23:49
 * To change this template use File | Settings | File Templates.
 */

public class NewApp extends UI {



    public void init(VaadinRequest request) {

        final VerticalLayout mainVerticalLayout = new VerticalLayout();
        setContent(mainVerticalLayout);

        final MyTable components = new MyTable();
        mainVerticalLayout.addComponent(components);


        final TextField textField = new TextField();
        mainVerticalLayout.addComponent(textField);


        Button addItems = new Button("AddItems");
        mainVerticalLayout.addComponent(addItems);

        addItems.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                components.generateRandomDate(Integer.valueOf(textField.getValue()));
            }
        });


        Button logout = new Button("Logout");
        logout.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent event) {
                final String context = VaadinServlet.getCurrent()
                        .getServletContext().getContextPath();
                getUI().getPage().setLocation(context);
                getSession().close();
            }
        });
        mainVerticalLayout.addComponent(logout);
    }
}
