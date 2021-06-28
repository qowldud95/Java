package test;

public class Main {
  public static void main(String[] args) {
	  LinkedList numbers = new LinkedList();
	  
	  //실습 : 첫번째에 추가
	  numbers.addFirst(30);
	  numbers.addFirst(20);
	  numbers.addFirst(10);
	  
	  //실습 : 마지막에 추가
	  numbers.addLast(40);
	  numbers.addLast(50);
	  
	  //실습 : 특정한위치에 데이터 추가
	  numbers.add(1,15);
	  
	  //실습 : 데이터를 보기 쉽게 하기 위해 toString 구현
	  System.out.println(numbers);
	  
	  //실습 : 첫번째에 있는 값을 삭제해주는 로직
	  //리턴값 : 삭제된 값
	  numbers.removeFirst();
	  System.out.println(numbers);
	  
	  
	  //실습 : 특정 인덱스의 값을 삭제하고 싶을 때
	  numbers.remove(2);
	  System.out.println(numbers);
	  
	  //실습 : 마지막에 있는 데이터 값을 삭제하고 싶을 때
	  numbers.removeLast();
	  System.out.println(numbers);
	  
	  //실습 :사이즈를 가지고 오고 싶을 때
	  System.out.println(numbers.size());
	  
	  //실습 : 특정 인덱스의 값을 가지고 오고 싶을 때
	  System.out.println(numbers.get(2));
	  
	  //실습 : 데이터값으로 인덱스 정보를 얻어오고 싶을 때
	  System.out.println(numbers.indexOf(30));

  }
}
