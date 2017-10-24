import static org.junit.Assert.assertEquals;
import org.junit.*;

public class BusStopTest {
  BusStop busstop;
  Person person;
  Bus bus;

@Before
public void before() {
  busstop = new BusStop ("Argyle Street");
  person = new Person();
  bus = new Bus (21);
}

@Test
public void hasLocation() {
  assertEquals("Argyle Street", busstop.getLocation());
}

@Test
public void queueIsEmpty() {
  assertEquals(0, busstop.queueCount());
}

@Test
public void addToQueue(){
  busstop.add(person);
  assertEquals(1, busstop.queueCount());
}

@Test
public void isBusStopFull() {
  for(int i=0; i < 20; i++){
    busstop.add(person);
  }
  assertEquals(true, busstop.isBusStopFull());
}

@Test
public void busStopEmpty() {
  busstop.add(person);
  busstop.empty();
  assertEquals(0, busstop.queueCount());
}

@Test
public void canAddToBusFromQueue(){
  busstop.add(person);
  Person passenger = busstop.remove();
  bus.add(passenger);
  assertEquals(0, busstop.queueCount());
  assertEquals(1, bus.passengerCount());
}

}
