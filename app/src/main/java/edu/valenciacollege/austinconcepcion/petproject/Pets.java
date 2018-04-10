package edu.valenciacollege.austinconcepcion.petproject;

/**
 * Created by Austin Concepcion on 4/9/2018.
 */

public class Pets {
    private int id, type, sizeClass;
    /* id is unique identifier
     *
     * type is as follows: 0 - dog;   1 - cat;    2 - rodent;
     *                       3 - bird;  4 - fish;   5 - reptile
     *                       6 - other
     *
     * sizeClass is relative to type and are as follows:
     *                       0 - xsmall; 1 - small; 2 - med
     *                       3 - large;  4 - xlarge 5 - xxlarge
     */
    private boolean specialNeeds;
    private String petName, imageName;
    /* petName: pet's name
     *
     * imageName: Because we do not use server integration, we need to (temporarily)
     *            store pet pictures locally at drawable/imageName
     */

    public Pets() {}

    public Pets(int id, int type, int sizeClass, boolean specialNeeds, String petName, String imageName) {
        this.id = id;
        this.type = type;
        this.sizeClass = sizeClass;
        this.specialNeeds = specialNeeds;
        this.petName = petName;
        this.imageName = imageName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSizeClass() {
        return sizeClass;
    }

    public void setSizeClass(int sizeClass) {
        this.sizeClass = sizeClass;
    }

    public boolean isSpecialNeeds() {
        return specialNeeds;
    }

    public void setSpecialNeeds(boolean specialNeeds) {
        this.specialNeeds = specialNeeds;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
}
