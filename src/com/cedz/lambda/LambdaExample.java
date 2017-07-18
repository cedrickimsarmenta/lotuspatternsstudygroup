package com.cedz.lambda;

import java.util.*;

/**
 * Created by cedric on 7/18/17.
 */
public class LambdaExample {
    private static Map<String, Integer> brandCoolness = new HashMap();

    static {
        brandCoolness.put("GUESS", 1);
        brandCoolness.put("LACOSTE", 2);
    }


    private static class Laundrey {
        private boolean whiteYN;
        private Integer size;
        private String brand;

        public Laundrey(boolean whiteYN, Integer size, String brand) {
            this.whiteYN = whiteYN;
            this.size = size;
            this.brand = brand;
        }


        @Override
        public String toString() {
            return "Laundrey{" +
                    "whiteYN=" + whiteYN +
                    ", size=" + size +
                    ", brand='" + brand + '\'' +
                    '}';
        }

        public Integer getSize() {
            return size;
        }

        public void setSize(Integer size) {
            this.size = size;
        }

        public String getBrand() {
            return brand;
        }

        public void setBrand(String brand) {
            this.brand = brand;
        }

        public boolean isWhiteYN() {
            return whiteYN;
        }

        public static int compareLowndry(Laundrey o1, Laundrey o2) {

            if(o1.whiteYN && !o2.whiteYN) {
                return -1;
            } else if(o2.whiteYN && !o1.whiteYN) {
                return 1;
            } if(o1.size != o2.size) {
                return o1.size - o2.size;
            } else if(!o1.brand.equals(o2.brand)) {
                return brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand);
            }
            return 0;
        }
    }

    private static class OldSchoolComparator implements Comparator<Laundrey> {

        @Override
        public int compare(Laundrey o1, Laundrey o2) {

            if(o1.whiteYN && !o2.whiteYN) {
                return -1;
            } else if(o2.whiteYN && !o1.whiteYN) {
                return 1;
            } if(o1.size != o2.size) {
                return o1.size - o2.size;
            } else if(!o1.brand.equals(o2.brand)) {
                return brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand);
            }
            return 0;
        }
    }


    public static void main(String[] args) {
        Laundrey laundrey1 = new Laundrey(true, 5, "GUESS");
        Laundrey laundrey2 = new Laundrey(true, 4, "LACOSTE");
        Laundrey laundrey3 = new Laundrey(false, 3, "LACOSTE");
        Laundrey laundrey4 = new Laundrey(false, 3, null);
        Laundrey laundrey5 = new Laundrey(false, 3, "FOO");

        List<Laundrey> dirtyLaundrey = Arrays.asList(laundrey1, laundrey2, laundrey3);

        //Sort with types
        Collections.sort(dirtyLaundrey, new OldSchoolComparator() );

        //Sort  type
        dirtyLaundrey.sort((Laundrey o1, Laundrey o2) ->

                (o1.whiteYN && !o2.whiteYN) ? -1 : (!o1.whiteYN && o2.whiteYN) ? 1 :
                        o1.size.compareTo(o2.size) != 0 ? o1.size.compareTo(o2.size) :
                                brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand)


        );

        //Sort Without type
        dirtyLaundrey.sort((o1, o2) ->

                (o1.whiteYN && !o2.whiteYN) ? -1 : (!o1.whiteYN && o2.whiteYN) ? 1 :
                        o1.size.compareTo(o2.size) != 0 ? o1.size.compareTo(o2.size) :
                                brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand)


        );


        // Sort using Reference to Static Method
        dirtyLaundrey.sort(Laundrey::compareLowndry);

        //Sort uing field
        Collections.sort(dirtyLaundrey, Comparator.comparing(Laundrey::isWhiteYN));

        //Reverse
        Comparator<Laundrey> comparator = (o1, o2) ->

                (o1.whiteYN && !o2.whiteYN) ? -1 : (!o1.whiteYN && o2.whiteYN) ? 1 :
                        o1.size.compareTo(o2.size) != 0 ? o1.size.compareTo(o2.size) :
                                brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand);
        dirtyLaundrey.sort(comparator.reversed());

        //Complex Sorting

        dirtyLaundrey.forEach((element -> System.out.println(element)));

        dirtyLaundrey.sort((o1, o2) -> {
                if(o1.whiteYN && !o2.whiteYN) {
                    return -1;
                } else if(o2.whiteYN && !o1.whiteYN) {
                    return 1;
                } if(o1.size != o2.size) {
                    return o1.size - o2.size;
                } else if(!o1.brand.equals(o2.brand)) {
                    return brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand);
                }
                return 0;
            }
        );

        //Multiple fields
        Collections.sort(dirtyLaundrey, Comparator.comparing(Laundrey::isWhiteYN).thenComparing(Laundrey::getSize).thenComparing((o1,o2) -> brandCoolness.get(o1.brand) - brandCoolness.get(o2.brand)));

    }
}
