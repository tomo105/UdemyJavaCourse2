package exc9_composition_encapsulation_polymorphism;

import exc7_classes_and_constructors.BankAccount;

public class Room {
    private Wardrobe wardrobe;
    private Bed bed;
    private Carpet carpet;

    public Room(Wardrobe wardrobe, Bed bed, Carpet carpet) {
        this.wardrobe = wardrobe;
        this.bed = bed;
        this.carpet = carpet;
    }
    public void cleanTheRoom(){
        bed.changePillow(4);
        carpet.vacuum();
        wardrobe.getAllClothesToWardrobe();
    }

}
