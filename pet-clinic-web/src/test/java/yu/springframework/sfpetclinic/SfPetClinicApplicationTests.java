package yu.springframework.sfpetclinic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@SpringBootTest
class SfPetClinicApplicationTests {

//    @Test
//    void contextLoads() {
//    }

    @Test
    public void testEquals() {
        System.out.println("testEquals");
        Assertions.assertEquals(1,1);
    }
}
