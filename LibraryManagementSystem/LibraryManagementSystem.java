package LibraryManagementSystem;
//Creating a Library Management System using Java


//Using LinkedList, HashMap, and Binary Search Tree to create the application
// Implement a linked list to manage the list of books borrowed by a user.
// Implement a hash table(HashMap) to allow quick lookups of books by title or author
// Implement a BST to store Book objects, where the bookID is the key for ordering the books.


import java.util.*;

public class LibraryManagementSystem {
    // Book class
    class Book {
        int bookID;
        String title;
        String author;
        boolean isBorrowed;

        public Book(int bookID, String title, String author) {
            this.bookID = bookID;
            this.title = title; 
            this.author = author;
            isBorrowed = false;
        }
        //Creating getters for the Book class
        public String getTitle() {
            return title;
        }

        public int getBookid() {
            return bookID;
        }

        public String getAuthor() {
            return author;
        }

        public boolean isBorrowed() {
            return isBorrowed;
        }

        //Creating a setter for isBorrowed since its the only thing that will change the rest are constant.
        public void setBorrowed(boolean borrowed) {
            isBorrowed = borrowed;
        }   
    }

    //User class
    class User {
        int userID;
        String name;
        LinkedList borrowedBooks;

        public User(int userID, String name){
            this.userID = userID;
            this.name = name;
            borrowedBooks = null;
        }
    }

    //BST class
    class BST {
        Book book;
        BST left, right;

        public BST(Book book){
            this.book = book;
            left = right = null;
        }

        //Inserting a book into the BST
        

        //Searching for a book in the BST


        //Deleting a book from the BST

        // Inorder traversal of the BST

    }
    
    //LinkedList class
    class LinkedList {
        Book book;
        LinkedList next;

        public LinkedList(Book book){
            this.book = book;
            next = null;
        }

        //using the linekd list to manage the list of books borrowed by a user

        //Inserting a book into the linked list(checking out a book)

        //Deleting a book from the linked list(returning a book)
    }

    //HashMap class

    class HashMap{

    //Implementing a hash table(HashMap) to allow quick lookups of books by title or author
        String key;
        Book value;
        HashMap next;

        public HashMap(String key, Book value){
            this.key = key;
            this.value = value;
            next = null;
        }
    }

    class HashTable{
        private HashMap[] table;
        private int size;

        public HashTable(int size){
            this.size = size;
            table = new HashMap[size];
            for(int i = 0; i < size; i++){
                table[i] = null;
            }
        }

        //Inserting key-value pair 

        //Search for a value by key 

        //Remove a key value pair 
    }


    public static void main(String[] args) {
        
    }
}