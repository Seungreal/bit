package controller;

import java.util.ArrayList;
import java.util.Calendar;

import dto.BoardDTO;

public class BoardController {
    private ArrayList<BoardDTO> list;
    private int id;

    public BoardController() {
        list = new ArrayList<>();
        id = 1;
    }

    // 1.필드 리스트를 복사해서 복사본을 return해주는 selectAll()
    public ArrayList<BoardDTO> selectAll() {
        // deep copy vs shallow copy
        // deep copy: 객체의 필드 값을 복사하여
        // 새로운 객체의 필드에 저장
        // shallow copy: 주소값을 복사
        ArrayList<BoardDTO> temp = new ArrayList<>();
        for (BoardDTO b : list) {
            BoardDTO copy = new BoardDTO();
            copy.setId(b.getId());
            copy.setTitle(new String(b.getTitle()));
            copy.setContent(new String(b.getContent()));
            copy.setWriterId(b.getWriterId());
            Calendar tempCalendar1 = Calendar.getInstance();
            tempCalendar1.setTime(b.getWrittenDate().getTime());
            copy.setWrittenDate(tempCalendar1);
            Calendar tempCalendar2 = Calendar.getInstance();
            tempCalendar2.setTime(b.getUpdatedDate().getTime());
            copy.setUpdatedDate(tempCalendar2);

            temp.add(copy);
        }

        return temp;
    }

    // 2.파라미터로 넘어온 id와 일치하는 객체를 하나 보내주는 selectOne()
    public BoardDTO selectOne(int id) {
        BoardDTO b = new BoardDTO();
        b.setId(id);

        int index = list.indexOf(b);
        if (index != -1) {
            return list.get(index);
        }
        return null;
    }

    // 3.파라미터로 넘어온 BoardDTO 객체를 list에 추가하는 insert()
    public void insert(BoardDTO b) {
        b.setId(id++);
        list.add(b);
    }

    // 4.파라미터로 넘어온 BoardDTO객체를 수정하는 update()
    public void update(BoardDTO b) {
        int index = list.indexOf(b);
        list.get(index).setTitle(b.getTitle());
        list.get(index).setContent(b.getContent());
        list.get(index).setUpdatedDate(b.getUpdatedDate());
    }

    // 5.파라미터로 넘어온 id와 일치하는 객체를 삭제하는 delete()
    public void delete(int id) {
        BoardDTO b = selectOne(id);
        if (b != null) {
            list.remove(b);
        }
    }
}
