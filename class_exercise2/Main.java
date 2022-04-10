package com.company;

import java.util.Arrays;

public  class Main {

    public static Friend fillArray(int index, Friend[] fArr, Friend frnd){
        return (fArr[index] = frnd);
    }

    public static void displayArray(Friend[] fArr){
        for(int i = 0; i < 5; i++ ) {
            System.out.printf("Friend %d:  %s\n", (i + 1), fArr[i].toString());
        }
    }

    public static void sortArray(Friend[] fArr){
        Arrays.sort(fArr);
    }

    public static void findFriend(String name, Friend[] fArr){
        int len = fArr.length;

        for(int i = 0; i < len; i++){
            if(fArr[i].friend_name == name){
                System.out.println(fArr[i].getFriend_name() +": "+ fArr[i].getCell_phone_number());
            }
            else{
                System.out.println("Name not found");
                return;
            }
        }
    }

    public static void main(String[] args) {

        //instantiating all Main class functions
        Main fillArray = new Main();
        Main displayArray = new Main();
        Main sortArray = new Main();
        Main findFriend = new Main();

        Friend[] friends = new Friend[5];

        //filling objects' details at parsed indexes;
        fillArray(0, friends, new Friend("Mbali", "0728279141", 'F', 4));
        fillArray(1, friends, new Friend("Karabo", "0826279243", 'M', 3));
        fillArray(2, friends, new Friend("Cate", "0768249351", 'F', 2));
        fillArray(3, friends, new Friend("Andile", "0607379481", 'M', 5));
        fillArray(4, friends, new Friend("Blondie", "0668779561", 'F', 7));

        displayArray(friends);

        sortArray(friends);
        System.out.println("\n");

        displayArray(friends);
        System.out.println("\n");

        findFriend("Andile", friends);

    }
    
}

