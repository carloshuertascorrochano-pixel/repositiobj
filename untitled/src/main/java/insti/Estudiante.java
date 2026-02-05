package insti;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Estudiante {

    private String nombre;
    private int edad;
    private  Curso curso;
}
