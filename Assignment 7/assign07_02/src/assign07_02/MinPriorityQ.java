package assign07_02;

public class MinPriorityQ {
	int arr[]=null;
	MinHeap h = null;
	int capacity =1 ;
	int size = 0;
	
	public MinPriorityQ() {
		arr = new int[6];
		h = new MinHeap();
		size = 6;
	}
	
	public MinPriorityQ(int size) {
		arr = new int[size+1];
		h = new MinHeap();
		this.size = size+1;
	}
	
	public int peek() {

		if(isEmpty())
			return -1;
		return arr[1];
	}
	
	public int poll() {
		
		if(isEmpty())
			return -1;
		
		int front = arr[1];
		h.delHeap(arr);
		capacity--;
		return front;
		
	}
	
	private boolean isEmpty() {
		return capacity == 1;
	}
	
	private boolean isFull() {
		return capacity +1 == size;
	}
	
	public void offer(int value) {
		if(isFull())
			return;
		
		arr[capacity] = value;
		h.addHeap(arr);
		capacity++;
				
	}
}
