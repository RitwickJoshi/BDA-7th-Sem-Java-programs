package Queue;
import java.util.Scanner;

public class Circular_queue {  
	static int front = -1, rear = -1;
	static int maxsize = 5;
	static int queue[] = new int [maxsize];  
	static Scanner sc = new Scanner(System.in);
	static void insert()  
	{  
	    int item;  
	    System.out.print("\nEnter the element\n");  
	    item = sc.nextInt();    
	    if((rear+1)%maxsize == front)  
	    {  
	        System.out.print("\nOVERFLOW");  
	        return;  
	    }  
	    else if(front == -1 && rear == -1)  
	    {  
	        front = 0;  
	        rear = 0;  
	    }  
	    else if(rear == maxsize -1 && front != 0)   
	    {  
	        rear = 0;  
	    }  
	    else   
	    {  
	        rear = (rear+1)%maxsize;  
	    }  
	    queue[rear] = item;  
	    System.out.print("\nValue inserted ");  
	}  
	static void delete()  
	{  
	    if(front == -1 & rear == -1)  
	    {  
	        System.out.print("\nUNDERFLOW\n");  
	        return;  
	    }  
	    else if(front == rear)  
	    {  
	        front = -1;  
	        rear = -1;  
	    }  
	    else if(front == maxsize -1)  
	        {  
	            front = 0;  
	        }  
	    else   
	        front = front + 1;  
	}  
	      
	static void display()  
	{  
	   int i;        
	   if(front == -1)  
	      System.out.print("\nCircular Queue is Empty!!!\n");  
	   else  
	   {  
	      i = front;  
	      System.out.print("\nCircular Queue Elements are : \n");  
	      if(front <= rear){  
	     while(i <= rear)  
	        System.out.println(queue[i++]+" "+front+" "+rear);  
	      }  
	      else{  
	     while(i <= maxsize - 1)  
	    	 System.out.println(queue[i++]+" "+front+""+rear);
	     i = 0;  
	     while(i <= rear)  
	    	 System.out.println(queue[i++]+" "+front+" "+rear);
	      }  
	   }  
	}
	public static void main(String[] args) 
	{  
	    int choice = 0;   
	    while(choice != 4)   
	    {     
	        System.out.print("\n*************************Main Menu*****************************\n");  
	        System.out.print("\n1.insert an element\n2.Delete an element\n3.Display the queue\n4.Exit\n");  
	        System.out.print("\nEnter your choice ?");  
	        choice = sc.nextInt();  
	        switch(choice)  
	        {  
	            case 1:  
	            insert();  
	            break;  
	            case 2:  
	            delete();  
	            break;  
	            case 3:  
	            display();  
	            break;  
	            case 4:  
	            System.exit(1); 
	            break;  
	            default:   
	            System.out.print("\nEnter valid choice:\n");  
	        }  
	    }  
	}  
	  
}