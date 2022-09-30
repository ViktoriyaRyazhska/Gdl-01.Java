package com.softserve.sprintone.joceline;

/**
 * @author Joceline
 */
public class God {
    /**
     * The first object in the array should be an instance of the class Man.
     * The second should be an instance of the class Woman. Both objects have to be subclasses of Human.
     * Your job is to implement the Human, Man and Woman classes.
     */
    public void task47() {
        System.out.println("Task num 47");

        System.out.println(create());
    }

    public static Human[] create() {
        Human[] humans = new Human[2];
        humans[0] = new Man();
        humans[1] = new Woman();
        return humans;
    }
}

class Human {

}

class Woman extends Human {

}

class Man extends Human {

}