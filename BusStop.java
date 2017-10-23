public class BusStop {

  private String location;
  private Person[] queue;

  public BusStop(String location){
    this.location = location;
    this.queue = new Person[20];
  }

  public String getLocation(){
    return this.location;
  }

  public int queueCount(){
    int count = 0;
    for(Person person : this.queue){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void add(Person person){
    if(!isBusStopFull()){
      int queueCount = queueCount();
      this.queue[queueCount] = person;
    }
  }

  public boolean isBusStopFull(){
    return queueCount() == queue.length;
  }

  public void empty(){
    for (int i=0; i < this.queue.length; i++ ) {
      this.queue[i] = null;
    }
  }

}
