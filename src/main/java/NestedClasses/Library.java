package NestedClasses;
//Write a Java program to create an outer class called Library with an instance variable libraryName.
// Create an inner class Book with a method getLibraryName() that returns the name of the library.
// Instantiate the Book class and call the getLibraryName() method.

public class Library {
    String libraryName;

    Library(String lname){
        this.libraryName=lname;
    }
    public class Book{

        public String getLibraryName(){
            return libraryName;
        }
    }

    public static void main(String args[]){
        // Creating an instance of Library
        Library myLibrary = new Library("Central Library");

        // Creating an instance of the inner class Book
        Library.Book myBook = myLibrary.new Book();

// Calling the getLibraryName method and printing the result
        System.out.println("Library Name: " + myBook.getLibraryName());

    }
}

