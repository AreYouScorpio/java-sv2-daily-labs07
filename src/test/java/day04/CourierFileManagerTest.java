package day04;

import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;

import static day04.Courier.rides;
import static day04.CourierFileManager.createCourierByFile;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CourierFileManagerTest {

    private Courier courier = new Courier();

    @Test
    public void testListSize() {
        createCourierByFile(Path.of("src/main/resources/courier.txt"));

        assertEquals(6, rides.size());
        assertEquals(2, rides.get(2).getDay());
        assertEquals(1, rides.get(2).getRideNumberThisDay());
        assertEquals(10, rides.get(2).getKm());
    }

    @Test
    public void testNotExistingFile() {
        Path path = Paths.get("src/main/resources/courrier.txt");
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> createCourierByFile(path));
        System.out.println(exception.getMessage());
        assertEquals("Olvasási hiba", exception.getMessage());
    }
}
