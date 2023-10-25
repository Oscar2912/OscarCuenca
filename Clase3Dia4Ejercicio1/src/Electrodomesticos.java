public class Electrodomesticos {
    //Se declaran los atributos o propiedades de la clase Electrodomesticos
    private String cod;
    private String marca;
    private String modelo;
    private String consumo;
    private String color;

    //Se declara el constructor sin parámetros
    public Electrodomesticos() {

    }

    //Se declara el constructor con los parámetros indicados
    public Electrodomesticos(String valorCod, String valorMarca, String valorModelo, String valorConsumo, String valorColor) {
        cod = valorCod;
        marca = valorMarca;
        modelo = valorModelo;
        consumo = valorConsumo;
        color = valorColor;
    }

    //Se generan los getter y los setter
    public void setCod(String valorCod) {
        cod = valorCod;
    }

    public void setMarca(String valorMarca) {
        marca = valorMarca;
    }

    public void setModelo(String valorModelo) {
        modelo = valorModelo;
    }

    public void setConsumo(String valorConsumo) {
        consumo = valorConsumo;
    }

    public void setColor(String valorColor) {
        color = valorColor;
    }

    public String getCod() {
        return cod;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getConsumo() {
        return consumo;
    }

    public String getColor() {
        return color;
    }
}
