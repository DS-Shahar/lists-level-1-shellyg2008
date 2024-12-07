package lists;
import java.util.Random;
import java.util.Scanner;

    public class Homework {
 static Scanner reader = new Scanner(System.in);
 
 public static Node<Integer> randomList(int min, int max, int n) {
	    Random random = new Random();
	    Node<Integer> nod = new Node<>(-1);
	    Node<Integer> current = nod;
	    for (int i = 0; i < n; i++) {
	        int randomNum = random.nextInt(max - min + 1) + min;
	        Node<Integer> newNode = new Node<>(randomNum);
	        current.setNext(newNode); 
	        current = newNode; 
	    }
	    return nod.getNext();
	}
	
	  public static int times_in_list(Node<Integer>list, int num) {
		  int count=0;
		  Node<Integer> current = list;   
	  	    while (current != null) { 
	  	    	if(current.getValue()==num) {
	  	    		count++;
	  	    	}
	  	        current = current.getNext(); 
	  	}
	  	    return count;
	    }
	
	    

public static Node arr(int [] arr) {
    Node<Integer> nod = new Node<>(-1);
    Node<Integer> nod2=nod;
    for (int i = 0; i < arr.length; i++) {
        Node<Integer> newNode = new Node<>(arr[i]);
        nod2.setNext(newNode); 
        nod2 = newNode; 
    }	
	return nod.getNext();
}

public static void printList(Node<Integer> first) {
    Node<Integer> current = first;   
    while (current != null) { 
        System.out.print(current.getValue()); 
        System.out.println();    
        current = current.getNext(); 
    }
    System.out.println();    
}

public static void ric(Node<Integer> first) {
    Node<Integer> current = first;   
    if (current == null) { 
    	return;
    }
        System.out.print(current.getValue()); 
        System.out.println();    
        current = current.getNext(); 
		ric(current);
}

public static void ric2(Node<Integer> first) {
    Node<Integer> current = first;   
    if (current == null) { 
    	return;
    }
		ric2(current.getNext());
		System.out.println(current.getValue());  
}

public static Node<Integer> user_input() {
	Node<Integer> list = new Node<>(-1);
	Node<Integer> p = list;
	System.out.println("Enter number (num>0) or -1 to end:");
	int num = reader.nextInt();
	while (num != -1) {
	Node<Integer> x = new Node<>(num);
	p.setNext(x);
	p = x;
	System.out.println("Enter number (num>0) or -1 to end:");
	num = reader.nextInt();
	}
	return list.getNext();
	}

public static void even(Node <Integer> list) {
	  Node<Integer> current = list;   
	    while (current != null) { 
	    	if(current.getValue()%2==0) {
	        System.out.println(current.getValue()); 
	    }
	        current = current.getNext(); 
	}	
}
	    public static boolean found(Node <Integer> list,int num) {
	  	  Node<Integer> current = list;   
	  	    while (current != null) { 
	  	    	if(current.getValue()==num) {
	  	    		return true;
	  	    	}
	  	        current = current.getNext(); 
	  	}
	  	    return false;
	    }
	
	    public static boolean found_ric(Node<Integer> list, int num) {
	        if (list == null) {
	            return false;
	        }
	        if (list.getValue() == num) {
	            return true;
	        }
	        return found_ric(list.getNext(), num);
	    }
	  	    
    




public static void main(String[] args) {
	int [] arr= {1,2,3,4,3,6,5};
    Node<Integer> first = new Node<>(1); 
    Node<Integer> second = new Node<>(2);
    Node<Integer> third = new Node<>(3);
    Node<Integer> fourth = new Node<>(4);
    Node<Integer> fifth = new Node<>(1);

    first.setNext(second);
    second.setNext(third);
    third.setNext(fourth);
    fourth.setNext(fifth);
    Node <Integer>n4=randomList(2,10,10);
    System.out.println(n4);
    System.out.println();
    int times=times_in_list(first,1);
    System.out.println(times+" times in list");
    System.out.println();
    Node n=arr(arr);
	System.out.println(n);
	System.out.println();
    printList(first);
    System.out.println();
    ric(first);
    System.out.println();
    ric2(first);
    Node <Integer>n3=user_input();
    System.out.println(n3);
    even(first);
    boolean flag=found(first,2);
    System.out.println(flag);
    boolean flag2=found_ric(first,1);
    System.out.println(flag2);
    
}
   

}

