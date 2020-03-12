package MediaLib121;

public class LoopingMediaLib {

    public static void main(String[] args) {


        String s = MediaFile.readString();
//        while (s != null) {
//            System.out.println("From File: " + s);
//            s = MediaFile.readString();
//        }
//        while (s != null) {
//            String title = s.substring(0, s.indexOf("|"));
//
//
//            String rating  = s.substring((s.indexOf("|") +1));
//            System.out.println("Song Title: " + title + "\nRating: " + rating);
//            System.out.println();
//            s = MediaFile.readString();
//        }
        while (s != null) {
            String title = s.substring(0, s.indexOf("|"));
            int rating = Integer.parseInt(s.substring((s.indexOf("|") +1)));

            if(rating >= 9) {
                System.out.println("Song Title: " + title + "\nRating: " + rating);
                s = MediaFile.readString();
                Song song1 = new Song();
                song1.setTitle("Thats Tuff");
                song1.setRating(10);
                song1.setPrice(0.99);

            }
        }
    }
}
