package day09.book;

import util.SimpleInput;

import static day09.book.LibraryRepository.users;

//role : input, output
//save inputted data
public class LibraryView {

    SimpleInput si;
    //공유할 수 있는 객체를 생성해야 한다.
    // 나는 여기서 만들지 않고 새로 생성하는 객체에서의 new 를 참조할 수 있을 줄 알았다.
    static LibraryRepository repository = new LibraryRepository();

    //menu capsulizing
    public void start() {
        makeNewBookUser();

        while (true) {
            String menuNum = showMenu();

            switch (menuNum) {
                case "1":
                    showMyPage();
                    break;
                case "2":
                    showAllBooks();
                    break;
                case "3":
                    searchBookByName();
                    break;
                case "4":
                    rentBooks();
                    break;
                case "5":
//                        searchBookByAuthor();
                    break;
                case "6":
//                        quit();
                    break;
            }
        }
    }

    private void rentBooks() {
        showAllBooks();
        String bookNum = si.input("- 대여할 도서번호 입력 : ");
        //check able to rent from library repo
        RentStatus status = repository.rentBook(bookNum);

        if (status == RentStatus.RENT_SUCCESS_WITH_COUPON) {
            System.out.println(" 대여 성공! 쿠폰 1장이 발급되었습니다.");
        }
    }

    private void searchBookByName() {
        String keyword = si.input("# 검색어 : ");

        Book[] searchBooks = repository.searchBookList(keyword);

        if (searchBooks.length > 0) {
            System.out.println("# 검색결과");
            for (Book searchBook : searchBooks) {
                System.out.println(searchBook.info());
            }
        } else {
            System.out.println("# 검색결과없음");
        }
    }

    //input user's data
    public void makeNewBookUser() {
        String name = si.input(("사용자의 정보를 입력해 주세요  \n #이름 :"));
        int age = Integer.parseInt(si.input((" #나이 :")));
        Gender gender = inputGender();

        //save those data :( - why is it null......!!!!!!!
        repository.saveBookUser(new BookUser(name, age, gender, 0));
    }

    //iterate infinite when input the gender value
    private Gender inputGender() {
        while (true) {
            String gender = si.input(" #성별 (M/F) :").toUpperCase();
            if (gender.startsWith("M")) return Gender.MALE;
            if (gender.startsWith("F")) return Gender.FEMALE;
            System.out.println("# 성별을 잘못 입력했습니다. ");
        }
    }

    //show menu
    String showMenu() {

        System.out.println("\n 메이도서관 도서대여 시스템");
        System.out.println("1. 마이페이지 ");
        System.out.println("2. 전체 도서 조회 ");
        System.out.println("3. 도서 제목으로 검색 ");
        System.out.println("4. 도서 대여하기 ");
        System.out.println("5. 도서 저자이름으로 검색 ");
        System.out.println("6. 프로그램 종료 ");

        String menuNum = si.input(("- 메뉴 : "));
        return menuNum;
    }


    public void showMyPage() {
        System.out.println("++++회원 정보++++");
        System.out.println(users.toString());

    }

    //display all books
    private void showAllBooks() {
        System.out.println("\n===========전체도서목록===========");
        Book[] informationList = repository.getAllBooksInfo();

        for (int i = 0, informationListLength = informationList.length; i < informationListLength; i++) {
            Book book = informationList[i];
            System.out.printf("%d. %s\n", i + 1, book.info());
        }
    }
}
