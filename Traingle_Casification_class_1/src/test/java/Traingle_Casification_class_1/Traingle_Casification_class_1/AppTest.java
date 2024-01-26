package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
	public void partition1(){

        TriangleClassifier.classifyTriangle(1,2,4);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition2(){

        TriangleClassifier.classifyTriangle(3,1,1);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition3(){

        TriangleClassifier.classifyTriangle(1,3,1);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }

	@Test
	public void partition4(){

        TriangleClassifier.classifyTriangle(1,1,3);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition5(){

        TriangleClassifier.classifyTriangle(4,5,6);
        String expected =Triangle_Types.Scalene.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition6(){

        TriangleClassifier.classifyTriangle(5,4,4);
        String expected =Triangle_Types.isosceles.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition7(){

        TriangleClassifier.classifyTriangle(4,5,4);
        String expected =Triangle_Types.isosceles.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition8(){

        TriangleClassifier.classifyTriangle(4,4,5);
        String expected =Triangle_Types.isosceles.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	public void partition9(){

        TriangleClassifier.classifyTriangle(4,4,4);
        String expected =Triangle_Types.equilateral.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	
}  