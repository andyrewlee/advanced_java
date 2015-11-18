public class Node<E>
{
  private E data;
  private Node<E> next;

  public Node()
  {
    data = null;
    next = null;
  }

  public E getData()
  {
    return data;
  }

  public Node<E> getNext()
  {
    return next;
  }

  public void setData(E data)
  {
    this.data = data;
  }

  public void setNext(Node<E> node)
  {
    this.next = node;
  }
}
