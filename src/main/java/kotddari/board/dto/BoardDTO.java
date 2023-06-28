package kotddari.board.dto;

import kotddari.board.entity.BoardEntity;
import kotddari.board.repository.BoardRepository;
import lombok.*;

import java.time.LocalDateTime;

// DTO(Data Transfer Object), VO, Bean, !=Entity
@Getter
@ToString
@NoArgsConstructor(access = AccessLevel.PROTECTED) // 기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private int id;
    private String boardWriter;
    private String boardPassword;
    private String boardTitle;
    private String boardContent;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdatedTime;

    public static BoardDTO toBoardDTO(BoardEntity boardEntity) {
        return new BoardDTO(boardEntity.getId(), boardEntity.getBoardWriter(),
                boardEntity.getBoardPassword(), boardEntity.getBoardTitle(),
                boardEntity.getBoardContent(), boardEntity.getBoardHits(),
                boardEntity.getCreatedTime(), boardEntity.getUpdatedTime());
    }
}
