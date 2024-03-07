package ru.homchenko.java.basic.homeworks.homework12comparableandsort;

import java.util.*;

public class MainApp {
    static class Box implements Comparable<Box>{
        int size;
        public Box(int size) {
            this.size = size;
        }

        @Override
        public int compareTo(Box o) {
            return this.size - o.size;
        }

        @Override
        public String toString() {
            return "Box{" +
                    "size=" + size +
                    '}';
        }
    }
    static class OtherBox {
        int size;
        public OtherBox(int size) {
            this.size = size;
        }

        @Override
        public String toString() {
            return "OtherBox{" +
                    "size=" + size +
                    '}';
        }
    }
    public static void main(String[] args) {
        //для того, чтобы иметь возможность сортировать объекты с помощью Collections.sort
        //нужно реализовать интерфейс Comparable<> в классе объекта
        // (а именно: переопределить метод compareTo())
        List<Box> boxList = new ArrayList<>(Arrays.asList(
                new Box(5), new Box(1), new Box(3)
        ));
        System.out.println(boxList);
        Collections.sort(boxList);
        System.out.println(boxList);


        //в случае, если есть класс, который мы не можем изменить (реализовать в нем интерфейс Comparable<>) -
        //можно передать вторым параметром в Collections.sort() объект класса-компаратора
        //и здесь же переопределить метод compare())
        List<OtherBox> otherBoxList = new ArrayList<>(Arrays.asList(
                new OtherBox(5), new OtherBox(1), new OtherBox(3)
        ));
        Collections.sort(otherBoxList, new Comparator<OtherBox>() {
            @Override
            public int compare(OtherBox o1, OtherBox o2) {
                return o1.size - o2.size;
            }
        });
        System.out.println(otherBoxList);


        //Строки сортируются по алфавиту (нативная реализация). Если нужно кастомизировать сортировку, например, по длине строки,
        //также можно переопределить метод compare() объекта класса-компаратора
        List<String> stringList = new ArrayList<>(Arrays.asList("MMMM", "AAA", "HH", "BBBBBBBBBB", "CCCC"));
        System.out.println(stringList);
        Collections.sort(stringList);
        System.out.println(stringList);
        Collections.sort(stringList, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(stringList);
    }
}
