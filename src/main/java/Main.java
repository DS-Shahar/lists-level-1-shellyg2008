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
	    
	    
	    //מקבלת מספר ורשימה, מוחקת חוליה (הראשונה) עם המספר, ומחזירה את הרשימה לאחר השינוי.
	    //כדאי לטפל קודם במקרה שזאת החוליה הראשונה ברשימה.  דוגמה לפתרון

	  public static <T> Node<T> delete(Node<T> list, int x){
    	list = new Node<>(null, list);
    	Node<T> p = list;
    		   while (p != null) {
    		      if(p.getNext().getValue().equals(x)){
    		         p.setNext(p.getNext().getNext());
    		         return list.getNext();
    		       }
    		      p = p.getNext();
    		   }
    		    return list.getNext();
    		  } 
	 // מקבלת רשימה ומספר x, ומוחקת את החוליה שמיקומה x, למשל 1 אומר ראשונה.
	//  מחזירה את ראש הרשימה העדכני.
	  public static Node delete2(Node nod,int num) {
		  int count=0;
		  nod = new Node<>(null, nod);
	    	Node p = nod;
	    		   while (p != null) {
		    		      count++;
	    		      if(count==num){
	    		         p.setNext(p.getNext().getNext());
	    		         return nod.getNext();
	    		       }
	    		      p = p.getNext();
	    		   }
	    		    return nod.getNext();
	    		  }   

//ברקורסית זנב: מקבלת שתי רשימות L1, L2 ומחזירה האם כל ערכי L1 מופיעים ב-L2
	  public static boolean exe8(Node<Integer> L1, Node<Integer> L2, Node<Integer> cur) {
		    if (L1 == null) {
		        return true;
		    }
		    if (L2 == null || cur == null) {
		        return false;
		    }
		    if (L1.getValue().equals(cur.getValue())) {
		        return exe8(L1.getNext(), L2, L2); 
		    } else {
		        return exe8(L1, L2, cur.getNext());       
		    }
		}
//מקבלת שתי רשימות L1, L2 ומדפיסה רק את ערכי L1 המופיעים ב-L2 (עם חזרות)
public static void exe9(Node<Integer> L1, Node<Integer> L2) {
    while (L1 != null) {
        Node<Integer> cur = L2;
        while (cur != null) {
            if (L1.getValue().equals(cur.getValue())) {
                System.out.println(L1.getValue());
               cur=null;
            }
            else {
            cur = cur.getNext();
        }
        }
        L1 = L1.getNext();
    }
}
public static Node<Integer> exe10(Node<Integer> L1, Node<Integer> L2) {
    Node<Integer> l = new Node<>(-1);
    Node<Integer> newn = l;

    while (L1 != null) {
        Node<Integer> tempL2 = L2;

        while (tempL2 != null) {
            if (L1.getValue().equals(tempL2.getValue())) {
                newn.setNext(new Node<>(L1.getValue()));
                newn = newn.getNext();
                tempL2=null;
            }
            else {
            tempL2 = tempL2.getNext();
            }
        }

        L1 = L1.getNext();
    }

    return l.getNext();
}
    	
public static Node<Integer> exe11(Node<Integer> L1, Node<Integer> L2) {
    Node<Integer> prev = null;
    Node<Integer> first = L1;

    while (L1 != null) {
        Node<Integer> tempL2 = L2;
        boolean found = false;

        while (tempL2 != null) {
            if (L1.getValue().equals(tempL2.getValue())) {
                found = true;
                tempL2 = null;
            }
            else {
            tempL2 = tempL2.getNext();
        }
        }
        if (found) {
            if (prev == null) {
                first = L1.getNext();
            } 
            else {
                prev.setNext(L1.getNext());
            }
        } else {
            prev = L1;
        }

        L1 = L1.getNext();
    }

    return first;
}



public static void main(String[] args) {
	int [] arr= {1,2,3,4,3,6,5};
    Node<Integer> L1 = new Node<>(1); 
    Node<Integer> second = new Node<>(2);
    Node<Integer> third = new Node<>(3);
    Node<Integer> fourth = new Node<>(1);
    Node<Integer> fifth = new Node<>(7);
    L1.setNext(second);
    second.setNext(third);
    third.setNext(fourth);
    fourth.setNext(fifth);
    
    Node<Integer> L2 = new Node<>(1); 
    Node<Integer> b = new Node<>(2);
    Node<Integer> c = new Node<>(3);
    Node<Integer> d = new Node<>(4);
    Node<Integer> e = new Node<>(1);
    Node<Integer> f = new Node<>(1);
    Node<Integer> g = new Node<>(1);
    L2.setNext(b);
    b.setNext(c);
    c.setNext(d);
    d.setNext(e);
    e.setNext(f);
    f.setNext(g);
   
    
    Node <Integer>n4=randomList(2,10,10);
    System.out.println(n4);
    System.out.println();
    int times=times_in_list(L1,1);
    System.out.println(times+" times in list");
    System.out.println();
    Node n=arr(arr);
	System.out.println(n);
	System.out.println();
    printList(L1);
    System.out.println();
    ric(L1);
    System.out.println();
    ric2(L1);
    Node <Integer>n3=user_input();
    System.out.println(n3);
    even(L1);
    boolean flag=found(L1,2);
    System.out.println(flag);
    boolean flag2=found_ric(L1,1);
    System.out.println(flag2);
    System.out.println();
   // Node f2=delete2(L1,2);
    System.out.println(f);
    boolean flag3=exe8( L1,L2,L2);
   System.out.println(flag3);
    exe9(L1,L2);
   Node j= exe10(L1, L2);
   System.out.println(j);
   Node k=exe11(L1,L2);
   System.out.println(k);
    
}
   

}

