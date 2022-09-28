import com.softserve.sprintone.ivan.TaskIvanSprintOne;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TaskIvanSprintOneTest {
    @Test
    public void task3Test() {
        TaskIvanSprintOne taskIvanSprintOne = new TaskIvanSprintOne();
        assertTrue(TaskIvanSprintOne.INST.getVolume(3, 3, 3) == 27);
    }

    @Test
    public void task33Test(){
        assertArrayEquals(new int[]{10,56,64}, TaskIvanSprintOne.INST.getDogCatyears(10));
        assertArrayEquals(new int[]{2,24,24}, TaskIvanSprintOne.INST.getDogCatyears(2));
        assertArrayEquals(new int[]{1,15,15}, TaskIvanSprintOne.INST.getDogCatyears(1));
    }

    @Test
    public void task38Test() {
        assertEquals(true, TaskIvanSprintOne.INST.betterThanAverage(new int[] {2, 3}, 5));
        assertEquals(true, TaskIvanSprintOne.INST.betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        assertEquals(true, TaskIvanSprintOne.INST.betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        assertEquals(false, TaskIvanSprintOne.INST.betterThanAverage(new int[] {100, 90}, 11));
    }
}
