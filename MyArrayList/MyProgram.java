public class MyProgram
{
  public static void main(String[] args)
  {
    MyArrayList myArrayList = new MyArrayList();
    myArrayList.add("Jelly");
    myArrayList.add("Bean");
    myArrayList.add("Bryant");
    myArrayList.add("Stephon");

    System.out.println(myArrayList.get(0));
    System.out.println(myArrayList.get(1));
    System.out.println(myArrayList.get(2));
    System.out.println(myArrayList.get(3));
    myArrayList.remove(2);
    System.out.println(myArrayList.get(2));
    myArrayList.add(2, "Shaq");
    System.out.println(myArrayList.get(0));
    System.out.println(myArrayList.get(1));
    System.out.println(myArrayList.get(2));
    System.out.println(myArrayList.get(3));
  }
}
