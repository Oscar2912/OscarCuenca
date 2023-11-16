import java.util.*;

public class Main {
    public static void main(String[] args) {

        //**** Nivel 1 ****

        List<String> archivos = Arrays.asList(
                "system.exe",
                "logo.jpg",
                "cmd.exe"
        );
        Directorio directorio = new Directorio<>(1, "Main", archivos);

                //**** Nivel 2 ****

                        List<String> musica = Arrays.asList(
                                "wake.mp3",
                                "call_me.mp3",
                                "revenge.mp3"
                        );
                List<Directorio> subdirectorios = Arrays.asList(
                        new Directorio<>(2, "Media", null),
                        new Directorio<>(3, "Document", null),
                        new Directorio<>(4, "Music", musica)
                );
                directorio.setSubdirectorios(subdirectorios);

                        //**** Nivel 3 ****

                                List<String> imagenes = Arrays.asList(
                                        "01.jpg",
                                        "02.jpg",
                                        "03.jpg"
                                );
                                List<String> videos = Arrays.asList(
                                        "01.wmv",
                                        "02.wmv",
                                        "03.wmv"
                                );
                        List<Directorio> mediaSubdirectorios = Arrays.asList(
                                new Directorio<>(5, "Image", imagenes),
                                new Directorio<>(6, "Video", videos)
                        );
                        Directorio directorioMedia = (Directorio) directorio.getSubdirectorios().get(0);
                        directorioMedia.setSubdirectorios(mediaSubdirectorios);

                                List<String> documentos = Arrays.asList(
                                        "java.docx",
                                        "java-avanzado.docx"
                                );
                                List<String> nominas = Arrays.asList(
                                        "23enero.pdf",
                                        "23febrero.pdf",
                                        "23marzo.pdf"
                                );

                        List<Directorio> documentSubdirectorios = Arrays.asList(
                                new Directorio<>(7, "Documentos", documentos),
                                new Directorio<>(8, "Nóminas", nominas)
                        );
                        Directorio directorioDocument = (Directorio) directorio.getSubdirectorios().get(1);
                        directorioDocument.setSubdirectorios(documentSubdirectorios);

        ExploradorDirectorios<Directorio> exploradorDirectorios = new ExploradorDirectorios<>();
        exploradorDirectorios.explorarDirectorio(directorio);
    }
}
