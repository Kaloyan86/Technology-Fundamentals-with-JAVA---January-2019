package ObjectsAndClasses.Exercises;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Ex4Articles2 {
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
                    this.getTitle(), this.getContent(), this.getAuthor());
        }
    }
    public static String switchInput (Article article,String input){
        String cmd = "";
        if (input.equals("title")) {
           cmd = article.title;
        } else if (input.equals("content")) {
            cmd = article.content;
        } else if (input.equals("author")) {
            cmd = article.author;
        }
        return cmd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Article> allArticles = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] data = scanner.nextLine().split(", ");

            Article article = new Article(data[0], data[1], data[2]);
            allArticles.add(article);

        }
        String input = scanner.nextLine();
        allArticles.stream().sorted(Comparator.comparing(article -> switchInput (article,input))).forEach(System.out::println);
    }
}
