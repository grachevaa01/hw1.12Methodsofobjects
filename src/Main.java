public class Main {
        public static void main(String[] args) {
            Book FathersAndSons =new Book("Отцы и дети ", 1860);
            System.out.println("Отцы и дети = " + FathersAndSons.getname());
            System.out.println("Год выпуска = " + FathersAndSons.getRelease());
            FathersAndSons.setrelease(1861);
            System.out.println("FathersAndSons.getRelease() = " + FathersAndSons.getRelease());
            Author author = new Author("Иван ", "Тургенев ");
            System.out.println("Name " + author.getAuthorName());
            System.out.println("Surname " + author.getAuthorSurname());
            Book Player = new Book("Игрок ", 1866);
            System.out.println("Игрок " + Player.getname());
            System.out.println("Год выпуска " + Player.getRelease());
            Player.setrelease(1866);
            System.out.println("Player.getRealease()= " + Player.getRelease());
            Author author1 = new Author("Федор ", "Достоевский ");
            System.out.println("Name " + author1.getAuthorName());
            System.out.println("Surname " + author1.getAuthorSurname());
            System.out.println("Сравним автора " + author.equals(author));
            System.out.println("Сравним автора " + author.equals(author1));
            System.out.println(author1);
        }
    }
