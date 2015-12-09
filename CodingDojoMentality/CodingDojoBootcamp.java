public class CodingDojoBootcamp
{
  public static void main(String[] args)
  {
    LosAngelesDojoStudent eduardo = new LosAngelesDojoStudent("Eduardo");
    SanJoseDojoStudent brendan = new SanJoseDojoStudent("Brendan");
    SeattleDojoStudent aaron = new SeattleDojoStudent("Matt");

    // interfaces can be used in similar ways as a class
    // we can specify a variable holds onto a type that conforms to protocol
    // create Array of instances that implement CodingDojoMentality
    CodingDojoMentality[] students = new CodingDojoMentality[] { eduardo, brendan, aaron };

    // we can iterate through Arrays in this alternate syntax
    for(CodingDojoMentality student: students)
    {
      challengeStudent(student);
    }
  }

  // we can specify our method parameters with interface as well
  // we can use this method as long as class conforms to CodingDojoMentality
  public static void challengeStudent(CodingDojoMentality student)
  {
    // now we can assume that the argument passed in will have struggle method
    student.struggle();
  }
}
