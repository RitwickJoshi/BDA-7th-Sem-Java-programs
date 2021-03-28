import java.util.Scanner;

public class Stack_implementation {
	static int max = 10; 
	int top;
	int array[] = new int[max];
	
	boolean checkEmpty() {
		return (top < 0);
	}
	public void stack() {
		top=-1;
	}
	
	void push(int x){
		if(top>=(max-1)) {
			System.out.println("Overflow");
		}
		else {			
			array[top++] = x;
			System.out.println("Pushed");
		}
	}
	
	void pop() {
		if (top < 0) { 
            System.out.println("Stack Underflow");
            System.out.println(top);
            top=0;
        } 
        else { 
            int x = array[top--];  
            System.out.println("Popped");
        } 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack_implementation s = new Stack_implementation();
		System.out.print("Enter how many you want to insert: ");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		for (int i = 0; i < x; i++) {
			System.out.println("Enter the value: ");
			s.array[s.top] = sc.nextInt();
			s.top++;
		}
		for (int i = 0; i < s.top; i++) {
			System.out.println(s.array[i]);
		}
		int choice;
		int value = 0;
		boolean loop = true; 
		while (loop) {
			System.out.println("1. for push\n 2. for pop \n");
			choice = sc.nextInt();
			if (choice == 1) {
				System.out.print("Enter the Value: ");
				value = sc.nextInt();
				s.push(value);
				for (int i = 0; i<s.top; i++) {
					System.out.println(s.array[i]);
				}
			}
			else if (choice == 2) {
				s.pop();
				for (int i = 0; i<s.top; i++) {
					System.out.println(s.array[i]);
				}
			}
			else if (choice == 3) {
				loop = false;
			}
			else {
				System.out.println("Enter coorect option");
			}
		}
	}

}
