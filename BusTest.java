import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusTest {
  Bus bus;
  Person person;

  @Before
  public void before() {
    bus = new Bus(21);
    person = new Person();
  }

  @Test
  public void hasNumber() {
    assertEquals(21, bus.getNumber());
  }

  @Test
  public void busStartsEmpty() {
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void addPassenger(){
    bus.add(person);
    assertEquals(1, bus.passengerCount());
  }

  @Test
  public void isBusFull() {
    for(int i=0; i < 10; i++){
      bus.add(person);
    }
    assertEquals(true, bus.isBusFull());
  }

  @Test
  public void busEmptysAtEndOfDay() {
    bus.add(person);
    bus.empty();
    assertEquals(0, bus.passengerCount());
  }

  @Test
  public void canRemovePerson() {
    bus.add(person);
    bus.add(person);
    bus.add(person);
    bus.remove();
    assertEquals(2, bus.passengerCount());
  }




}
