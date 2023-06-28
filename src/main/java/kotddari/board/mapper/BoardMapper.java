package kotddari.board.mapper;

import kotddari.board.dto.BoardDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface BoardMapper {

    void save(BoardDTO boardDTO);

    @Insert("INSERT INTO board_table (board_writer, board_password, board_title, board_content, created_time) "
            + "VALUES(#{board_writer}, #{board_password}, #{board_title}, #{board_content}, NOW())")
    void save2(BoardDTO boardDTO);
}
