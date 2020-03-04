package Event;
import State.*;

abstract public class Event 
{
   protected State state;
   protected EventQueue eventQueue;
   
   abstract public void doMe();
   abstract public double getTime(); 
   abstract public Customer getCustomer();
   
   public Event(State state, EventQueue eventQueue) 
   {
      this.eventQueue = eventQueue;
      this.state = state;
   }
}