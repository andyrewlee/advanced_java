public class MyProgram
{
  public static void main(String[] args)
  {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.add("One");
    myLinkedList.add(0, "Zero");
    myLinkedList.display();
    myLinkedList.remove(0);
    myLinkedList.display();
    myLinkedList.set(0, "hello");
    myLinkedList.display();
  }
}
