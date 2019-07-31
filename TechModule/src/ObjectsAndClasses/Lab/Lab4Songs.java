package ObjectsAndClasses.Lab;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab4Songs {
    static class Song {
        String typeList;
        String name;
        String time;

        public Song(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public void setTypeList(String typeList) {
            this.typeList = typeList;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setTime(String time) {
            this.time = time;
        }



        public String getTypeList() {
            return typeList;
        }

        public String getName() {
            return name;
        }

        public String getTime() {
            return time;
        }


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfSongs = Integer.parseInt(scanner.nextLine());
        ArrayList<Song> songs = new ArrayList<>();

        for (int i = 0; i < numberOfSongs; i++) {
            String[] data = scanner.nextLine().split("_");
            Song song = new Song(data[0],data[1],data[2]);
//            song.setTypeList(data[0]);
//            song.setName(data[1]);
//            song.setTime(data[2]);

            songs.add(song);

        }
        String typeList = scanner.nextLine();
        if (typeList.equals("all")) {
//            for (Song song : songs) {
//                System.out.println(song.getName());
//            }
            songs.forEach(song -> System.out.println(song.getName()));
        } else {
            songs.stream().filter(e -> e.getTypeList().equals(typeList)).forEach(n -> System.out.println(n.getName()));
//            for (Song song : songs) {
//                if (song.getTypeList().equals(typeList)) {
//                    System.out.println(song.getName());
//                }

        }
    }


}

