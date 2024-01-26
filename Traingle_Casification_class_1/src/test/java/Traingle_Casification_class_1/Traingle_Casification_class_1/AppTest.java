package Traingle_Casification_class_1.Traingle_Casification_class_1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import static org.junit.Assert.*;
import  org.junit.Test;

public class AppTest {
	
	TriangleClassifier triangle = new TriangleClassifier();
	
	@Test
  
	public void equilateralTriangle(){
        int a = 2;
        int b = 2;
        int c = 2;
        TriangleClassifier.classifyTriangle(a,b,c);
        String expected =Triangle_Types.equilateral.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	  
	public void scaleneTriangle(){
        int a = 4;
        int b = 2;
        int c = 3;
        TriangleClassifier.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Scalene.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	  
	public void isoscelesTriangle(){
        int a = 2;
        int b = 2;
        int c = 3;
        TriangleClassifier.classifyTriangle(a,b,c);
        String expected =Triangle_Types.isosceles.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
	
	@Test
	  
	public void nottriangle(){
        int a = 2;
        int b = 2;
        int c = 0;
        TriangleClassifier.classifyTriangle(a,b,c);
        String expected =Triangle_Types.Nottriangle.toString();
        String result = TriangleClassifier.get_type().toString();
        assertEquals(expected, result.toString());
    }
}  