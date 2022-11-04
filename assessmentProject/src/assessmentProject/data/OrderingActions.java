package assessmentProject.data;

import java.util.ArrayList;

public interface OrderingActions 
{
	ArrayList<Order> displayOrder();
	ArrayList<Order> createOrder();
	ArrayList<Order> deleteOrder();
	ArrayList<Order> updateOrder();
}
