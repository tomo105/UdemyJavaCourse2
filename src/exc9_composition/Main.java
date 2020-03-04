package exc9_composition;

public class Main {
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 4);
        Case theCase = new Case("200", "dell", "240", dimensions);
        Monitor monitor = new Monitor("thinkpad", "acer", 23, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("34-54", "asus", 4, 6, "v5.432");
        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp();

        Bed bed = new Bed(100,200);
        Wardrobe wardrobe = new Wardrobe(120,200,"ikea",6);
        Carpet carpet = new Carpet(200,200);
        Room room = new Room(wardrobe, bed ,carpet);
        //room.getBed().changePillow(4);
        room.cleanTheRoom();



    }
}
