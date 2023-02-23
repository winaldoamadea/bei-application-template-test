package src.main.java.com.traveloka.bootcamp.addition.component;

import src.main.java.com.traveloka.bootcamp.addition.service.AdditionService;
import src.main.java.com.traveloka.bootcamp.addition.service.AdditionServiceImpl;

public class AdditionLocalComponent implements AdditionComponent {
    private final AdditionService additionService;

    public AdditionLocalComponent() {
        this.additionService = new AdditionServiceImpl();
    }

    @Override
    public AdditionService getAdditionService() {
        return additionService;
    }
}