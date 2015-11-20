public class MyProgram
{
  public static void main(String[] args)
  {
    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add(0, "One");
    myArrayList.add(1, "Two");
    myArrayList.add(2, "Three");
    myArrayList.display();
    myArrayList.remove(1);
    myArrayList.display();
  }
}
