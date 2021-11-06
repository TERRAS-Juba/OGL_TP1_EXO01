package com.Tests;

import com.exception.NoSquareException;
import com.model.Matrix;
import com.service.MatrixMathematics;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixMathematicsTest {

    @Test
    public void determinant() throws NoSquareException {
        //Cas d'une matrice d'ordre 1
        double dat[][] = new double[1][1];
        dat[0][0] = 1;
        Matrix matrice_1 = new Matrix(dat);
        //Cas d'une matrice d'ordre 2
        double dat2[][] = new double[2][2];
        dat2[0][0] = 1;
        dat2[0][1] = 2;
        dat2[1][0] = 3;
        dat2[1][1] = 4;
        //Cas d'une matrice d'ordre 3
        Matrix matrice_2 = new Matrix(dat2);
        double dat3[][] = new double[3][3];
        dat3[0][0] = 1;
        dat3[0][1] = 0;
        dat3[0][2] = 0;
        dat3[1][0] = 0;
        dat3[1][1] = 0;
        dat3[1][2] = 1;
        dat3[2][0] = 2;
        dat3[2][1] = 3;
        dat3[2][2] = 1;
        Matrix matrice_3 = new Matrix(dat3);
        //Cas d'une matrice non carrée
        double dat4[][] = new double[1][2];
        dat4[0][0] = 1;
        dat4[0][1] = 0;
        Matrix matrice_4 = new Matrix(dat4);
        //Tests
        try {
            assertEquals(1, MatrixMathematics.determinant(matrice_1), 0);
            assertEquals(-2, MatrixMathematics.determinant(matrice_2), 0);
            assertEquals(-3, MatrixMathematics.determinant(matrice_3), 0);
            assertEquals(-2, MatrixMathematics.determinant(matrice_4), 0);
        } catch (NoSquareException e) {
            System.out.println(e.getMessage());
        }
    }
}