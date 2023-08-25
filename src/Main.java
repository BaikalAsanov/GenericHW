public class Main {
    public static void main(String[] args) {
        Box box=new Box<>("Soda");
        System.out.println(Box.createBox(box.getItem()));
    }
}