import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class LabTest {
    Lab lab;
    @Before
    public void setUp(){
        lab = new Lab();
    }

    /**
     * Test that the serializer produces some meaningful result.
     */
    @Test
    public void serializerTest1(){
        CarModel carModel = new CarModel("yotoya", "macry", 2007);
        String serialized = lab.serializer(carModel);
        Assert.assertTrue((serialized != null)  && (serialized.equals("")==false));
    }

    /**
     * Test that the deserializer produces some meaningful result.
     */
    @Test
    public void deserializerTest1(){
        CarModel carModel = new CarModel("yotoya", "macry", 2007);
        String serialized = lab.serializer(carModel);
        CarModel deserialized = lab.deserializer(serialized);
        Assert.assertTrue((deserialized != null ));
    }

    /**
     * Test that the deserialized object matches the original object.
     */
    @Test
    public void comboTest1(){
        CarModel carModel = new CarModel("bord", "b150", 2013);
        String serialized = lab.serializer(carModel);
        CarModel deserialized = lab.deserializer(serialized);
        Assert.assertEquals(carModel, deserialized);
    }
    /**
     * Test that the deserialized object matches the original object.
     */
    @Test
    public void comboTest2(){
        CarModel carModel = new CarModel("busaru", "trekcross", 2018);
        String serialized = lab.serializer(carModel);
        CarModel deserialized = lab.deserializer(serialized);
        Assert.assertEquals(carModel, deserialized);
    }
    /**
     * Test that the deserialized object matches the original object.
     */
    @Test
    public void comboTest3(){
        CarModel carModel = new CarModel("tedbeast", "tedmobile", 2023);
        String serialized = lab.serializer(carModel);
        CarModel deserialized = lab.deserializer(serialized);
        Assert.assertEquals(carModel, deserialized);
    }
}
