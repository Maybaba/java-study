package day12.io.obj;

import day12.io.FileExample;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SaveSnack {
    public static void main(String[] args) {

        List<Snack> snackList = List.of(
                new Snack("콘칲", 1970, 1500, Snack.Taste.GOOD),
                new Snack("사브레", 1980, 1000, Snack.Taste.SOSO),
                new Snack("오징어집", 1985, 1000, Snack.Taste.SOSO)
        );
        //list 객체 데이터를 try에 통째로 쓸 수도 있다.
        try (FileOutputStream fos =new FileOutputStream(FileExample.ROOT_PATH + "/hello/snack.exe")) {

            //snack list 객체를 통째로 저장할 수 있는 보조 스트림
            //serialize 직렬화 : 데이터를 일렬로 늘여뜨려 놓는것
            //데이터가 너무 똥글똥글해서 일자로 만들어서 stream을 통과해야 하기 때문이다(?)
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(snackList);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
