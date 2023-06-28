package kotddari.board.repository;

import kotddari.board.dto.BoardDTO;
import kotddari.board.entity.BoardEntity;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;
import java.time.LocalDateTime;

public class BoardRepositoryTest {

    BoardRepository br;

    @Test
    @Transactional
    @Rollback
    @DisplayName("mybatis 글 작성 테스트")
    public void boardSaveTest1() {
        BoardDTO boardDTO = new BoardDTO(0, "kot", "1234", "Test", "Testing...", 0, LocalDateTime.now(), null);
        BoardEntity boardEntity = BoardEntity.toBoardEntity(boardDTO);
        br.save(boardEntity);
    }

}
