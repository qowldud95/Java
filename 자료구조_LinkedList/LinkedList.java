package test;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0;

	private class Node {
		private Object data;
		private Node next;

		public Node(Object input) {
			this.data = input;
			this.next = null;
		}

		public String toString() {
			return String.valueOf(this.data);
		}
	}

	public void addFirst(Object input) {
		Node newNode = new Node(input);
		newNode.next = head;
		head = newNode;
		size++;
		if (head.next == null) {
			tail = head;
		}
	}

	// 첫번째 위치에 데이터 추가
	public void addLast(Object input) {
		Node newNode = new Node(input);
		if (size == 0) {
			addFirst(input);
		} else {
			tail.next = newNode;
			tail = newNode;
			size++;
		}
	}

	// 노드 표현
	Node node(int index) {
		Node x = head;
		for (int i = 0; i < index; i++) {
			x = x.next;
		}
		return x;
	}

	// 특정한 인덱스에 데이터 추가
	public void add(int k, Object input) {
		if (k == 0) {
			addFirst(input);
		} else {
			Node temp1 = node(k - 1);
			Node temp2 = temp1.next;
			Node newNode = new Node(input);
			temp1.next = newNode;
			newNode.next = temp2;
			size++;
			if (newNode.next == null) {
				tail = newNode;
			}
		}
	}
	
	// 데이터를 보기 쉽게 하기 위해 toString 구현
	public String toString() {
		if (head == null) {
			return "[]";
		}
		Node temp = head;
		String str = "[";

		while (temp.next != null) {
			str += temp.data + ", ";
			temp = temp.next;
		}
		return str + "]";
	}
	
	//첫번째에 있는 값을 삭제해주는 로직
	//리턴값 : 삭제된 값
	public Object removeFirst() {
		Node temp = head;
		head = head.next;
		Object returnData = temp.data;
		temp = null;
		size--;
		return returnData;
	}
	
	//특정 인덱스의 값을 삭제하고 싶을 때
	//리턴값 : 삭제된 값
	public Object remove(int k) {
		if(k == 0) {
			return removeFirst();
		}
		Node temp = node(k-1);
		Node todoDeleted = temp.next;
		temp.next = temp.next.next;
		Object returnData = todoDeleted.data;
		if(todoDeleted == tail) {
			tail = temp;
		}
		todoDeleted = null;
		size--;
		return returnData;
	}
	
	// 마지막에 있는 데이터 값을 삭제하고 싶을 때
	public Object removeLast() {
		return remove(size-1);
	}
	
	//사이즈를 가지고 오고 싶을 때
	public int size() {
		return size;
	}
	
	//특정 인덱스의 값을 가지고 오고 싶을 때
	public Object get(int k) {
		Node temp = node(k);
		return temp.data;
	}
	
	//데이터값으로 인덱스 정보를 얻어오고 싶을 때
	public int indexOf(Object data) {
		Node temp = head;
		int index = 0; //우리가 찾고자 하는 위치의 정보
		while(temp.data != data) {  //찾는 데이터값이 데이터값과 같을때까지 반복
			temp = temp.next;
			index++;
			if(temp == null) {
				return -1;
			}
		}
		return index;
	}
	

}
