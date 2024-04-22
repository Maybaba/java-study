package day09.book;

import java.util.Arrays;

//role : Manage data that members, books, etc...
public class LibraryRepository {

    private static BookList bookList;
    static UserList users;
    static BookUser user;

    //static field's value 무한히 - . 0 ?!
    static {
        bookList = new BookList();
        users = new UserList();

        //관리자
        users.push(new BookUser("관리자 메이", 26, Gender.FEMALE, 0));

        bookList.push(new CookBook("기적의 김치볶음밥", "김해진", "청림라이프", true));
        bookList.push(new CartoonBook("떨어지면 꿈에서 깨어나", "스에노부 케이코", "대원씨아이", 18));
        bookList.push(new CartoonBook("원펀치쓰리강냉이", "One", "대원씨아이", 15));
        bookList.push(new CookBook("삐뽀삐뽀 119 이유식 : 시금치의 비밀", "하정훈", "유니책방", false));
        bookList.push(new CookBook("오늘은 아무래도 떡뵊이", "이마이 료", "참돌", true));
        bookList.push(new CartoonBook("이세계로 전이했으니 치트를 살려 마법검사가 되기로 했다", "Shinkoshoto", "대원씨아이", 12));
        bookList.push(new CookBook("프렌치 키위쥬스의 101가지 악기 다루기", "french kiwi juice", "FKJ", true));
    }


    //save new user -> BookUser의 입력값이 객체로 전달되지 않음
    public void saveBookUser(BookUser newBookUser) {
        System.out.println("newBookUser = " + newBookUser);
        users.push(newBookUser);
    }

    //return array include book's data
    public Book[] getAllBooksInfo() {
        return bookList.getbArr();
    }

    public Book[] searchBookList(String keyword) {

        //filtered data by search feature
        BookList filteredList = new BookList();

        for (Book book : bookList.getbArr()) {
            if(book.getTitle().contains(keyword)) {
                filteredList.push(book);
            }
        }
        return filteredList.getbArr();
    }

    /*
    주어진 책 번호에 맞는 책이 대여 가능한지에 대한 상태 상수 리턴
    @param bookNum - 주어진 책 번호
    @return - 대여 가능 상태 반환
     */
    public RentStatus rentBook(String bookNum) {
        //1. 책 번호에 해당하는 책 정보 가져오기
        Book wishBook = bookList.getbArr()[Integer.parseInt(bookNum) -1];

        //2. 이 책을 대여할 수 있는지 검증
        //2-1. 요리책일 경우
        if (wishBook instanceof CookBook) {
            //3. 쿠폰 유무 확인 - 타입 다운캐스팅
            if(((CookBook) wishBook).isCoupon()) {
                //회원 쿠폰 개수 없데이트
                user.setCouponCount(user.getCouponCount() + 1);
                return RentStatus.RENT_SUCCESS_WITH_COUPON;
            } else {
                return RentStatus.RENT_SUCCESS;
            }
        }
        //2-2. 만화책일 경우
        else if(wishBook instanceof CartoonBook) {
            //3. 회원의 연령이 만화책의 제한연령보다 높은지 확인 - 타입 다운캐스팅
            if (user.getAge() >= ((CartoonBook) wishBook).getAccessAge()) {
                return RentStatus.RENT_SUCCESS;
            } else {
                return  RentStatus.RENT_FAIL;
            }
        }
        return null;
    }

    //get User's index from BookList
    public BookUser getBookUser() {
        return user;
    }
}

