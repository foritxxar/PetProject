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
    boolean specialNeeds;
    String petName, imageName;
    /* petName: pet's name
     *
     * imageName: Because we do not use server integration, we need to (temporarily)
     *            store pet pictures locally at drawable/imageName
     */
}
