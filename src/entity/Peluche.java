package src.entity;

public class Peluche {

    private static int contador = 0;
    private int id;
    private String materialExterior;
    private String relleno;
    private String color;

    public Peluche(String materialExterior, String relleno, String color) {
        this.id = ++contador;
        this.materialExterior = materialExterior;
        this.relleno = relleno;
        this.color = color;
    }

    

    @Override
    public String toString() {
        return "Peluche [materialExterior=" + materialExterior + ", relleno=" + relleno + ", color=" + color + "]";
    }

    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }

    public static class PelucheBuilder {

        private String materialExterior;
        private String relleno;
        private String color;

        public PelucheBuilder() {
        }

        public PelucheBuilder materialExterior(String materialExterior) {
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno) {
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color) {
            this.color = color;
            return this;
        }

        public Peluche build() {
            return new Peluche(materialExterior, relleno, color);
        }
    }

}
