public class MyProgram
{
  public static void main(String[] args)
  {
    MyLinkedList linkedList = new MyLinkedList();
    linkedList.display();
    linkedList.add("One");
    linkedList.add("Two");
    linkedList.add("Three");
    linkedList.add("Four");

    linkedList.add(0, "YO");
    linkedList.add(1, "YOYO");
    linkedList.remove(0);
    linkedList.display();
  }
}
