import java.util.*;

public class ExploradorDirectorios <T extends Directorio>{
    private List<Directorio> subdirectorio;
    private List<String> archivo;
    public ExploradorDirectorios() {
        this.subdirectorio = new ArrayList<>();
        this.archivo = new ArrayList<>();
    }

    public void explorarDirectorio(Directorio directorio){
        List<Directorio> subdirectorios = new ArrayList<>(directorio.getSubdirectorios());
        System.out.println("Directorio: " + directorio.getNombre()
                +"\nArchivos: "+ directorio.getArchivos()
                +"\n|--Subdirectorios: ");
                    for(Directorio nombre : subdirectorios){
                        System.out.println(nombre.getNombre());
                    };
        for(Object explorador : directorio.getSubdirectorios()){
            explorarDirectorio((Directorio) explorador);
            System.out.println("**** FIN DEL SUBDIRECTORIO ****");
        }
    }
}