public class MyLinkedList<E>
{
  private Node<E> head;
  public MyLinkedList()
  {
    head = null;
  }

  // Displays data of all nodes in list
  public void display()
  {
    Node<E> currentNode = head;
    while(currentNode != null)
    {
      System.out.println(currentNode.getData());
      currentNode = currentNode.getNext();
    }
  }

  // Count of total nodes in the list
  public int size()
  {
    int count = 0;
    Node<E> currentNode = head;

    while(currentNode != null)
    {
      count++;
      currentNode = currentNode.getNext();
    }

    return count;
  }

  // Add to the back of the list
  public void add(E data)
  {
    Node<E> newNode = new Node<E>();
    newNode.setData(data);

    // If there are no nodes just set the new node as head
    if(head == null)
    {
      head = newNode;
      // Leave the function by returning because our job is done
      return;
    }

    // If there were nodes then set last node's next to new node
    Node<E> currentNode = head;
    while(currentNode.getNext() != null)
    {
      currentNode = currentNode.getNext();
    }

    currentNode.setNext(newNode);
  }

  // Get a node at particular index
  public Node<E> get(int index)
  {
    int count = 0;
    Node<E> currentNode = head;

    while(count != index)
    {
      count++;
      currentNode = currentNode.getNext();
    }

    return currentNode;
  }

  // Get a node right before a particular index
  private Node<E> getBefore(int index)
  {
    int count = 0;
    Node<E> currentNode = head;

    while(count != index - 1)
    {
      count++;
      currentNode = currentNode.getNext();
    }

    return currentNode;
  }

  // Insert node at a particular index
  public void add(int index, E data)
  {
    Node<E> newNode = new Node<E>();
    newNode.setData(data);

    if(index == 0)
    {
      newNode.setNext(head);
      head = newNode;
    }
    else
    {
      Node<E> beforeNode = getBefore(index);
      newNode.setNext(beforeNode.getNext());
      beforeNode.setNext(newNode);
    }
  }

  public void set(int index, E data)
  {
    Node<E> nodeToUpdate = get(index);
    nodeToUpdate.setData(data);
  }

  // Remove a node at a particular index
  public void remove(int index)
  {
    if(index == 0)
    {
      head = head.getNext();
    }
    else
    {
      Node<E> beforeNode = getBefore(index);
      Node<E> currentNode = get(index);

      if(currentNode.getNext() == null)
      {
        beforeNode.setNext(null);
      }
      else
      {
        beforeNode.setNext(currentNode.getNext());
      }
    }
  }
}
