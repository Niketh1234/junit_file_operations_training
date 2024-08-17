/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.demojunit.DemoJunit;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author pulkit
 */
public class DemoJunitTest {
    DemoJunit t;
    public DemoJunitTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        t = new DemoJunit();
    }
    
    @AfterEach
    public void tearDown() {
    }

    
     @Test
     public void addPositive() {
         int val = t.add(1, 2);
         assertEquals(3,val);
     }
     @Test
     public void addMaxValues(){
         assertEquals(-2,t.add(-12,10));
     }
}
