package study;

    public class Person {
        private String name;
        private int number;
        private Person(Builder builder){
            this.name=builder.name;
            this.number=builder.number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;

            Person person = (Person) o;

            if (number != person.number) return false;
            if (name != null ? !name.equals(person.name) : person.name != null) return false;

            return true;
        }

        @Override
        public int hashCode() {
            int result = name != null ? name.hashCode() : 0;
            result = 31 * result + number;
            return result;
        }
        public static class Builder{
            private String name;
            private int number;
            public Builder(){
            }
            public Builder(Person orig){
                this.name=orig.name;
                this.number=orig.number;
            }
            public Builder name (String name){
                this.name=name;
                return this;
            }
            public Builder number(int number){
                this.number=number;
                return this;
            }
            public Person build(){
                return new Person(this);
            }


        }

    }

