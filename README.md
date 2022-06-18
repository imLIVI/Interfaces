# Library
## Description
The program has developed a hierarchy of library employees. The combination of several roles in the library in one performer through interfaces is implemented. Each object in the program has a specific set of actions.

An example of interfaces in our library is the concept of a role on a project. Each role implies a set of specific operations that the user —User object in the program must "be able" to perform.

## The functionality of the program
1. A hierarchy of "Library Users" has been created with the following interfaces:
  * Reader – takes and returns books.
  * Librarian – orders books.
  * Book supplier – brings books to the library.
  * Administrator – finds and issues books and notifies about overdue return times.
Objects implementing these interfaces are created in the public static void main method.

## Additional information
It is important that the user (User) may have several interfaces. Objects of the User class can interact with each other (for example, a librarian orders from a supplier).
