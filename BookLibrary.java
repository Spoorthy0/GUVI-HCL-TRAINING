class Library{
      String[] books;
      int noOfBooks;
      Library(){
        this.books=new String[100];
        this.noOfBooks=0;
      }
      void addBook(String book){
        this.books[noOfBooks]=book;
        noOfBooks++;
        System.out.println("The book "+book+" has been added");
      }
      void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book : this.books) {
            if(book==null){
                continue;
            }
            System.out.println("* "+book);
        }
      }
      void issueBook(String book){
        for(int i=0;i<this.books.length;i++){
            if(this.books[i].equals(book)){
                System.out.println(book+" has been issued");
                noOfBooks--;
                this.books[i]=null;
                return;
            }
        }
        System.out.println("Book not found");
      }
      void returnBook(String book){
        addBook(book);
      }
}
public class BookLibrary {
    public static void main(String[] args){
        Library l=new Library();
        l.addBook("Think and grow Rich");
        l.addBook("Java");
        l.showAvailableBooks();
        System.out.println(l.noOfBooks);
        l.issueBook("Java");
        System.out.println(l.noOfBooks);

    }
}
