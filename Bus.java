public class Bus {

  private int number;
  private Person[] passengers;

  public Bus(int number){
    this.number = number;
    this.passengers = new Person[10];
  }

  public int getNumber(){
    return this.number;
  }

  public int passengerCount(){
    int count = 0;
    for(Person person : this.passengers){
      if(person != null){
        count++;
      }
    }
    return count;
  }

  public void add(Person person){
    if(!isBusFull()){
      int index = passengerCount();
      this.passengers[index] = person;
    }
  }

  public boolean isBusFull(){
    return passengerCount() == passengers.length;
  }

  public void empty(){
    for (int i=0; i < this.passengers.length; i++ ) {
      this.passengers[i] = null;
    }
  }


  public void remove(){
    if(passengerCount() > 0){
      int index = passengerCount();
      passengers[index-1] = null;
    }
  }


}
