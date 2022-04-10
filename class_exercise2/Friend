package com.company;

class Friend implements Comparable<Friend> {

    String friend_name, cell_phone_number;
    Character friend_gender;
    int number_of_friends;

    Friend(){
        //nothing to do...
    }
    Friend(String name, String cell_number, Character gender, int num_friends){
        friend_name =  name;
        cell_phone_number = cell_number;
        friend_gender = gender;
        number_of_friends = num_friends;
    }

    public String getFriend_name() {
        return friend_name;
    }

    public void setFriend_name(String friend_name) {
        this.friend_name = friend_name;
    }

    public String getCell_phone_number() {
        return cell_phone_number;
    }


    public void setCell_phone_number(String cell_phone_number) {
        this.cell_phone_number = cell_phone_number;
    }

    public Character getFriend_gender() {
        return friend_gender;
    }


    public void setFriend_gender(Character friend_gender) {
        this.friend_gender = friend_gender;
    }

    public  int getNumber_of_friends() {
        return number_of_friends;
    }


    public void setNumber_of_friends(int number_of_friends) {
        this.number_of_friends = number_of_friends;
    }

    public String toString(){
        return (getFriend_name() + " " + getCell_phone_number() + " " +
                getFriend_gender() + " " + getNumber_of_friends());
    }

    @Override
    public int compareTo(Friend f){
        return friend_name.compareTo(f.getFriend_name());
    }

}
