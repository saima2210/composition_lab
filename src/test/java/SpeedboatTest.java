import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import products.IProduct;
import products.Product;
import vehicles.Engine;
import vehicles.IMotorised;
import vehicles.Speedboat;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class SpeedboatTest {

    Speedboat speedboat;


    @BeforeEach
    public void setUp(){
        IMotorised engine = new Engine(100, 200);
        IProduct baseProduct = new Product(400, 50, "Maria");
        speedboat = new Speedboat(250, 300, baseProduct, engine);

    }

    @Test
    public void testGetHullType(){
        String expectedHullType = "round";
        String actualHullType = speedboat.getHullType();
        assertThat(actualHullType).isEqualTo(expectedHullType);
    }

    @Test
    public void testStartEngine(){
        String expectedEngineStart = "engine started";
        String actualEngineStart = speedboat.startEngine();
        assertThat(actualEngineStart).isEqualTo(expectedEngineStart);
    }

    @Test
    public void testStopEngine(){
        String expectedEngineStop = "engine stopped";
        String actualEngineStop = speedboat.stopEngine();
        assertThat(actualEngineStop).isEqualTo(expectedEngineStop);
    }

}
