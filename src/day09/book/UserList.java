package day09.book;

public class UserList {

    private BookUser[] uArr;

    private static final int NOT_FOUND = -1;

    public UserList() {
        this.uArr = new BookUser[0];
    }

    //push - add new user
    void push(BookUser newUser) {
        BookUser[] temp = new BookUser[this.uArr.length + 1];
        for (int i = 0; i < this.uArr.length; i++) {
            temp[i] = this.uArr[i];
        }
        temp[temp.length -1] = newUser;
        this.uArr = temp;

        System.out.println("newUser = " + newUser);
    }

    //pop - delete last user
    private BookUser pop() {
        //back-up last user
        BookUser lastUser = uArr[uArr.length -1];
        //copy to new temp
        BookUser[] temp = new BookUser[uArr.length -1];
        for (int i = 0; i <temp.length; i++) {
            uArr[i]= uArr[i + 1];
        }
       uArr = temp;
        return lastUser;
    }

    //remove by index num
    public BookUser remove(int index) {
        //back-up the user to clear
        BookUser removedUser = uArr[index];
        for (int i = index; i < uArr.length - 1 ; i++) {
            uArr[i] = uArr[i + 1];
        }
        pop();
        return removedUser;
    }

    //return saved Arr
    int size() {
        return uArr.length;
    }

    //return uArr
    public BookUser[] getuArr() {
        return uArr;
    }

    //return specific index from uArr
    public BookUser get (int index) {
        return uArr[index];
    }

}
