package ObjectsAndClasses.Exercises;

import java.util.Scanner;

public class Ex2Articles {
    public static class Article {
        private String title;
        private String content;
        private String author;


        public Article(String title, String content, String author) {
            this.title = title;
            this.content = content;
            this.author = author;
        }

        public String getTitle() {
            return title;
        }

        public String getContent() {
            return content;
        }

        public String getAuthor() {
            return author;
        }

        public void edit(String content) {
            this.content = content;
        }

        public void changeAuthor(String author) {
            this.author = author;
        }

        public void rename(String title) {
            this.title = title;
        }

        @Override
        public String toString() {
            return String.format("%s - %s: %s",
                    this.getTitle(),this.getContent(),this.getAuthor());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String [] data = scanner.nextLine().split(", ");

        Article article = new Article(data[0],data[1],data[2]);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String [] input = scanner.nextLine().split(": ");
            String command = input[0];

            switch (command){
                case "Edit":
                    article.edit(input[1]);
                    break;
                case "ChangeAuthor":
                    article.changeAuthor(input[1]);
                    break;
                case "Rename":
                    article.rename(input[1]);
                    break;
            }

        }
        System.out.println(article);
    }
}
