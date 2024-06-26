import java.util.*;
public class Main2
{
  static class QueueUsingSingleStack
  {

    Stack < Integer > stack = new Stack <> ();

    private void enqueue (int i)
    {
      stack.push (i);
    }

    private int dequeue ()
    {
      if (stack.size () == 0)
	{
	  System.out.println ("Queue is Empty");
	  return 0;
	}
      if (stack.size () == 1)
	return stack.pop ();

      int data = stack.pop ();
      int retVal = dequeue ();
      stack.push (data);
      return retVal;
    }
  }
  public static void main (String[]args) throws Exception
  {
    QueueUsingSingleStack queue = new QueueUsingSingleStack ();
      queue.enqueue (10);
      queue.enqueue (20);
      queue.enqueue (30);
      queue.enqueue (40);

      System.out.println (queue.dequeue ());
      System.out.println (queue.dequeue ());
      System.out.println (queue.dequeue ());
      System.out.println (queue.dequeue ());
      System.out.println (queue.dequeue ());

  }

}