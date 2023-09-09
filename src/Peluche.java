package src;

public class Peluche {


    private String materialExterior;
    private String relleno;
    private String color;


    public static PelucheBuilder builder() {
        return new PelucheBuilder();
    }


    public static class PelucheBuilder{

        private String materialExterior;
        private String relleno;
        private String color;

        public PelucheBuilder(){}



        public PelucheBuilder materialExterior(String materialExterior) {
            this.materialExterior = materialExterior;
            return this;
        }

        public PelucheBuilder relleno(String relleno){
            this.relleno = relleno;
            return this;
        }

        public PelucheBuilder color(String color){
            this.color = color;
            return this;
        }

        public Peluche build(){
            return new Peluche();
        }
    }








}
