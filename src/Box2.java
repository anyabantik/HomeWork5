import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Box2 {
    private static final String FILE_BOX = "C:\\Users\\anyab\\IdeaProjects\\HomeWork5\\src\\FILE_BIG_BOX";
    private static final String FILE_BIG_BOX = "C:\\Users\\anyab\\IdeaProjects\\HomeWork5\\src\\FILE_BIG_BOX";

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileOutputStream fos = new FileOutputStream(FILE_BOX);
        ObjectOutputStream cos = new ObjectOutputStream(fos);
        List<Box> boxes = new ArrayList<>();
        boxes.add(new Box(1, 2, 3));
        boxes.add(new Box(10, 20, 30));
        boxes.add(new Box(1, 80, 20));
        boxes.add(new Box(11, 88, 22));
        boxes.add(new Box(100, 100, 100));

        cos.writeObject(boxes);
        cos.close();

        FileInputStream fis = new FileInputStream(FILE_BOX);
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Box> box = (List<Box>) ois.readObject();
        ois.close();
        System.out.println(box);


        Box max = boxes.get(0);
        for (Box box1 : box) {
            if (max.getVolume() < box1.getVolume()) {
                max = box1;
                System.out.println(max);
            }
        }
        FileOutputStream fileOutputStream = new FileOutputStream(FILE_BIG_BOX);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(max);
        objectOutputStream.close();
    }
}