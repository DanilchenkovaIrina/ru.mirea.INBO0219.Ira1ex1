package ru.mirea.INBO0219.Ira1ex1;

public class Dog {

        private String Name;
        private int Age;

        public Dog(String name, int age) {
            this.Name = name;
            this.Age = age;
        }

        public String getName() {
            return this.Name;
        }

        public int getAge() {
            return this.Age;
        }

        public void setName(String name) {
            this.Name = name;
        }

        public void setAge(int age) {
            this.Age = age;
        }

        public String toString() {
            return this.Name + " сейчас " + this.Age + "лет .";
        }

        public void intoHumanAge() {
            System.out.println(this.Name + " в человеческом измерении " + this.Age * 7 + " лет.");
        }
    }


