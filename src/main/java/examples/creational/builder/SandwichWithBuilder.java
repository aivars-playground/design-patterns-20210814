package examples.creational.builder;

public class SandwichWithBuilder {

    public static class Builder {
        private String bread;
        private String sauce;
        private String salad;
        private String filling;

        public Builder(String bread) {
            //builder with enforced mandatory value
            this.bread = bread;
        }

        public Builder sauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Builder salad(String salad) {
            this.salad = salad;
            return this;
        }

        public Builder filling(String filling) {
            this.filling = filling;
            return this;
        }

        public SandwichWithBuilder build() {
            return new SandwichWithBuilder(this);
        }
    }

    private final String bread;
    private final String sauce;
    private final String salad;
    private final String filling;

    private SandwichWithBuilder(Builder builder) {
        this.bread = builder.bread;
        this.sauce = builder.sauce;
        this.salad = builder.salad;
        this.filling = builder.filling;
    }

    public String getBread() {
        return bread;
    }

    public String getSauce() {
        return sauce;
    }

    public String getSalad() {
        return salad;
    }

    public String getFilling() {
        return filling;
    }

    @Override
    public String toString() {
        return "SandwichWithBuilder{" +
                "bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", salad='" + salad + '\'' +
                ", filling='" + filling + '\'' +
                '}';
    }
}
