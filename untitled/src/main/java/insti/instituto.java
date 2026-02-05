package insti;

import lombok.*;

import java.util.Objects;

@Getter @Setter @ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor

public class instituto {

    @NonNull
    private String nombre;
    private  String poblacion;

    public void setnombre ( String nombre){

        this.nombre = Objects.requireNonNullElse(nombre, "IES");

    }
}
