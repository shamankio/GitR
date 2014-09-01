package study;

public class Fish {
    private final String name;
    private final String color;
    private final String type;

    private Fish(Builder builder) {
        this.name = builder.name;
        this.color = builder.color;
        this.type = builder.type;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fish)) return false;

        Fish fish = (Fish) o;

        if (color != null ? !color.equals(fish.color) : fish.color != null) return false;
        if (name != null ? !name.equals(fish.name) : fish.name != null) return false;
        if (type != null ? !type.equals(fish.type) : fish.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (color != null ? color.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        return result;
    }
    public static class Builder{
        private String name;
        private String color;
        private String type;
        public Builder(){
        }


        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public Builder setType(String type) {
            this.type = type;
            return this;
        }
        public Fish build(){
            return new Fish(this);
        }
    }

}
