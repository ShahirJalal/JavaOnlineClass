public static void main(String []args){

        // Given an array: [1, 2, 3, 4, 5], please sort by descending order and store into a new array.

        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5); // <- i start here

        ArrayList<Integer> newArr = new ArrayList<>(); // local variable
        for (int i = arr.size() - 1; i >= 0; i--) {
            // local variable
            newArr.add(arr.get(i));
        }

        for (int i = 0; i < newArr.size(); i++) {
            System.out.println(newArr.get(i));
        }

     }