package src.test.java.com.traveloka.bootcamp.addition.service;

import src.main.java.com.traveloka.bootcamp.addition.model.AddRequest;
import src.main.java.com.traveloka.bootcamp.addition.model.AddResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import src.main.java.com.traveloka.bootcamp.addition.service.AdditionService;
import src.main.java.com.traveloka.bootcamp.addition.service.AdditionServiceImpl;

import static org.testng.Assert.assertEquals;

@Test(groups = "small")
public class TestAdditionServiceImpl {
    private AdditionService additionService;

    @BeforeClass
    public void setUp() {
        additionService = new AdditionServiceImpl();
    }

    @Test
    public void testAdd_WithIntegers_ReturnsCorrectResult() {
        assertEquals(additionService.add(1, 2), 3);
    }

    public void testAdd_WithAddRequest_ReturnsCorrectAddResponse() {
        AddResponse addResponse = additionService.add(new AddRequest(1, 2));
        assertEquals(addResponse.getResult(), 3);
    }
}