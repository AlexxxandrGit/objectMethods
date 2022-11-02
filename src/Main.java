public class Main {
    public static void main(String[] args) {


        Author aleksandrLobanov = new Author("Aleksandr", "Lobanov");
        Book myBook1 = new Book("Моя книга1 ", aleksandrLobanov, 2000);
        System.out.println("Название книги: " + myBook1.getNameOfTheBook());
        System.out.println("Автор: " + aleksandrLobanov.getAuthorName() + " " + aleksandrLobanov.getAuthorSurname());
        System.out.println("Дата публикации книги: " + myBook1.getYearOfPublicationOfTheBook());


        Author ivanovIvan = new Author("Ivan", "Ivanov");
        Book myBook2 = new Book("Моя книга 2", ivanovIvan, 2021);
        myBook2.setYearOfPublicationOfTheBook(2022);
        System.out.println("Название книги: " + myBook2.getNameOfTheBook());
        System.out.println("Дата публикации книги: " + myBook2.getYearOfPublicationOfTheBook());
        System.out.println("Автор: " + ivanovIvan.getAuthorName() + " " + ivanovIvan.getAuthorSurname());


    }


}