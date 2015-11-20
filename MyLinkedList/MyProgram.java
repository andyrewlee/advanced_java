public class MyProgram
{
  public static void main(String[] args)
  {
    MyLinkedList myLinkedList = new MyLinkedList();
    myLinkedList.display();
    myLinkedList.add("One");
    myLinkedList.add("Two");
    myLinkedList.add("Three");
    myLinkedList.display();
    System.out.println(myLinkedList.size());
  }
}
