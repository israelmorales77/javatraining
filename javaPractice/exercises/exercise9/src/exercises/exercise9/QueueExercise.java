package exercises.exercise9;

import java.util.*;

public class QueueExercise 
{

	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub
		 int time = 100;
	        Queue<Integer> queue = new LinkedList<Integer>();

	        for (int i = 0; i < time; i++)
	        {
	            queue.add(i);
	        }
	        
	        for(int item : queue)
	        {
	        	System.out.println("Value of item is: "+ item);
	        	System.out.println("Current value in queue is: "+ queue.peek());
	        }

	        while (!queue.isEmpty()) 
	        {
	            System.out.println(queue.remove());
	            Thread.sleep(1000);
	        }

	        System.exit(0);
	        
	}

}
