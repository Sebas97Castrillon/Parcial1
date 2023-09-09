package src;

public class Carrito {

    private String color;
    private int numeroPuertas;
    private String marca;

    public Carrito(String color, int numeroPuertas, String marca) {
        this.color = color;
        this.numeroPuertas = numeroPuertas;
        this.marca = marca;
    }

    public static CarritoBuilder builder(String color, int numeroPuertas, String marca){
        return new CarritoBuilder();
    }

    public static class CarritoBuilder{

        private int numeroPuertas;
        private String marca;
        private String color;

        public CarritoBuilder(){}

        public CarritoBuilder numeroPuertas(int numeroPuertas) {
            this.numeroPuertas = (numeroPuertas);
            return this;
        }

        public CarritoBuilder marca(String marca){
            this.marca = marca;
            return this;
        }

        public CarritoBuilder color(String color){
            this.color = color;
            return this;
        }

        public Carrito build(){
            return new Carrito(color, numeroPuertas, marca);
        }
    }


}
