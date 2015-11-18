public class MyArrayList
{
  private String[] dataStore;
  private int back;

  // Initialized with a default size of 20
  public MyArrayList()
  {
    dataStore = new String[3];
    back = 0;
  }

  // Returns the current length of the datastore
  public int size()
  {
    return dataStore.length;
  }

  // Gets a value at a particular index
  public String get(int index)
  {
    return dataStore[index];
  }

  // Adds a value to the end of the data store
  public void add(String value)
  {
    checkSpace();
    dataStore[back] = value;
    back += 1;
  }

  // Method overloading, if index is provided, will insert into location
  public void add(int index, String value)
  {
    // if value is null just set the value there
    if(dataStore[index] == null)
    {
      set(index, value);
    }
    else
    {
      checkSpace();

      // Shift elements starting from index all the way to end one spot right
      for(int i = index; i < back; i++) {
        dataStore[i + 1] = dataStore[i];
      }

      // Set the value in the index provided
      set(index, value);
    }

    back += 1;
  }

  // Set element at an index, will override current value there
  public void set(int index, String value)
  {
    dataStore[index] = value;
  }

  // Removes an element from a particular index
  public void remove(int index)
  {
    // Shift elements starting from index + 1 all the way to end - 1 one spot left
    for(int i = index + 1; i < back - 1; i++) {
      dataStore[i] = dataStore[i + 1];
    }
    // Make last element null
    dataStore[size() - 1] = null;

    // Update back
    back -= 1;
  }

  // Called whenever there isn't enough space in the current data store
  private void doubleInSize()
  {
    String[] newDataStore = new String[size() * 2];

    for(int i = 0; i < size(); i++) {
      newDataStore[i] = dataStore[i];
    }

    dataStore = newDataStore;
  }

  // check if there is enough space, if not double in size
  private void checkSpace()
  {
      if(dataStore[size() - 1] != null)
      {
        doubleInSize();
      }
  }
}
