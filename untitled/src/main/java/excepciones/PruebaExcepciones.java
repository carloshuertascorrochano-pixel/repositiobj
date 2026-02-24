package excepciones;

import com.sun.jdi.VMCannotBeModifiedException;

import java.nio.BufferUnderflowException;
import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    static void main(String[] args) throws DataFormatException {

        int edad = 15;

        if (edad <= 18){

            throw new IllegalArgumentException("Ere menol");

        }


    }



}
